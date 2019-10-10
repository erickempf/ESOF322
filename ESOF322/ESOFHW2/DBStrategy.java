/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esofhw2;
import java.io.FileWriter;
/**
 *
 * @author erick
 */
public class DBStrategy {
    private Database db;
    
    public DBStrategy(Database db){
        this.db = db;
    }
    
    public void store(FileWriter writer){        //executes the generic store() when called
        db.store(writer);
    }
    
    public void setStoreStrategy(Database newdb){
        db = newdb;
    }
}
