/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;

import java.util.ArrayList;

/**
 *
 * @author tdahl01
 */
public class Player {
    
    public ArrayList<Object> invent = new ArrayList<Object>();  // added keyword for testing purposes
    public Location location;  // added keyword for testing purposes
    
    public Player(Location start){  // added public keyword for testing purposes
        location = start;
    }

    public void setObject(Object o) {  //added public keyword for testing purposes
        invent.add(o);
    }

    public int isHolding(String objName){  //added public keyword for testing purposes
        // This code implements isHere. Give it the name of an object and it will return the index number of that object.
        // NOTE: If there are more than one objects with the same name it will return the first only. If not found it returns -1
        
        int i=0;
        boolean found = false;
        
        while (i < invent.size() && !found) {
            if (!objName.equals(invent.get(i).name)) { // .equals() is used to compare strings
                i++;
            }
            else found = true;
        }
        if (found) {
            return i; // index number of the object
        }
        else {
            return -1; // if not found
        }
    }
}