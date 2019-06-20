/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hulle_000
 */
public class Node {
    /**
     * boolean deceptive indicates whether the node is deceptive or not.
     */
    private boolean deceptive;
    /**
     * int nodeID  stores the ID of the node.
     */
    Node() {
        this.deceptive = false;
    }
    
    Node(boolean deceptive) {
        this.deceptive = deceptive;
    }
    
    
    /**
     * @return nothing.  Updates ResultLog about the content of the node.
     */
    private void interact(ResultLog resultLog){
        //Calls a resultlog method, updating the ResultLog about the result of the interaction.
    }
    
}
