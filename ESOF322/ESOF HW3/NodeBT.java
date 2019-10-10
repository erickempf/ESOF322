/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof.hw3;

/**
 *
 * @author erick
 */
public class NodeBT {
    
    public int number;
    
    public NodeBT left;
    public NodeBT right;
    public NodeBT parent;
    
    public NodeBT getLeft(){return left;}
    public NodeBT getRight(){return right;}
    public NodeBT getParent(){return parent;}
    
}
