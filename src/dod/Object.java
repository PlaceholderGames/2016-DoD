/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dod;

/**
 *
 * @author mreddy01
 */
public class Object {
    public String name;  // added public keyword for testing purposes
    public String desc;  // added public keyword for testing purposes
    public int takeable;  // added public keyword for testing purposes

    public Object(String n, String d) {  //added public keyword for testing purposes
        name = n;
        desc = d;
        takeable = 1;
    } 

     public int takeable() {  //added public keyword for testing purposes
        return takeable;
     }    
}