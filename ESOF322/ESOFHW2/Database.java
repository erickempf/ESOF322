/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esofhw2;
import java.io.BufferedWriter;
import java.io.FileWriter;
/**
 *
 * @author erick
 */
public interface Database {                                 //In this case all of the store() methods
    void store(FileWriter writer);                          //basically do the same thing(writing to a file)
}                                                           //since they are dummy methods, but in a real application
                                                            //each store() would implement the various types or store listed.
class Relational implements Database{
    @Override
    public void store(FileWriter writer){                    //uses table store
        try{
            writer.append("table store successful\n");
            System.out.println("Success");
        }catch(Exception e){
            System.out.println("Something went wrong with table store");
        }
    }
}

class NoSQL implements Database{
    @Override
    public void store(FileWriter writer){                    //uses document store
        try{
            writer.append("document store successful\n");
            System.out.println("Success");
        }catch(Exception e){
            System.out.println("Something went wrong with document store");
        }
    }
}

class Graph implements Database{
    @Override
    public void store(FileWriter writer){                    //uses node store
        try{
            writer.append("node store successful");
            System.out.println("Success");
        }catch(Exception e){
            System.out.println("Something went wrong with node store");
        }
    }
}