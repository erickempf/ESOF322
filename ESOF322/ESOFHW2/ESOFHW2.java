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
public class ESOFHW2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            FileWriter writer = new FileWriter("output.txt");
        DBStrategy dbs;
        
        System.out.println("Relational Store executing");
        dbs = new DBStrategy(new Relational());        //Gets ready for Relational store
        dbs.store(writer);                      //calls generic method store() from IDatabase
        
        System.out.println("NoSQL Store executing");
        dbs.setStoreStrategy(new NoSQL());              //Dynamically switches to NoSQL store
        dbs.store(writer);                       //calls generic method store() from IDatabase
        
        System.out.println("Graph Store executing");
        dbs.setStoreStrategy(new Graph());            //Dynamically switches to Graph store
        dbs.store(writer);                     //calls generic method store() from IDatabase
        
        writer.close();
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
    
}
