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
public class ResultLog {
    

    /**
     * This is an array of results (boolean, indicating whether or not a deceptive node was hit at each step in the walk) from one individual run.
     */
    private boolean[] interactions;
    
    /**
     * indexRef is ResultLog's tracker for how many log entries have been made so far.  
     * It is used as a position reference for new additions to the array, and
     * as a check that new additions won't spill off the end of the array.
     */
    private int indexRef;
    
    /**
     * Default constructor.  Creates an array of size 1.  Shouldn't be used.
     */
    ResultLog() {
        interactions = new boolean[1];
        indexRef = 0;
    }
    
    /**
     * 
     * @param lengthOfWalk indicates the size of the result array being created.
     */
    ResultLog(int lengthOfWalk) {
        interactions = new boolean[lengthOfWalk];
        indexRef = 0;
    }
    /**
     * 
     * @param result is a value (true/false) indicating whether the attacker has indicated with a deceptive node.
     * 
     * The value is added to the next spot in the array.
     */
    void addResult(boolean result) {
        try {
            interactions[indexRef] = result;
            this.indexRef++;
        }
        
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Something's trying to overflow the interactions[] array:" + e);
        }
    }
    
    /**
     * 
     * @param ref is an integer giving the position in the array you want to know the value of.
     * @return a boolean true/false indicating whether the attacker interacted 
     * with a deceptive node on step (ref) of their run.
     */
    boolean getResult(int ref) {
        try {
            return this.interactions[ref];
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Something's asking for a result outside the bounds of the interactions array: " + e + "\n");
            System.out.println("Returning a FALSE result.");
            return false;
        }
    }
    /**
     * 
     * @return an integer value equal to the length of the log array
     */
    int getLogLength() {
        return this.interactions.length;
    }
}
