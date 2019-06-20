/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * This is a collection of <s>ResultLog</s>s.  
 * @author Greg
 */
public class LogArray {
    /**
     * An array of <b>ResultLog</b>s
     */
    private ResultLog[] logArray;
    /**
     * Integer tracking where the LogArray is writing to.
     */
    private int writeTracker;
    /**
     * integer tracking where the LogArray is reading from.
     */
    private int readTracker;
    
}
