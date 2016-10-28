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
public class Location {
    public ArrayList<Object> objects = new ArrayList<Object>();  // added public keyword for testing purposes
    
    public String name;  // added for testing purposes
    public String desc;  // added for testing purposes
    public String direct;  // added for testing purposes
    public Boolean isLit;  // added for testing purposes
    public Location north, east, south, west; // added for testing purposes
    
    public Location(String n, String d, String di){   //added public keyword for testing purposes
        name = n;
        desc = d;
        direct = di;
        isLit = true;
}

    public void setObject(Object o) {   //added public keyword for testing purposes
        objects.add(o);
    }

    public void setExits(Location n, Location e, Location s, Location w){   //added public keyword for testing purposes
        north = n;
        east = e;
        south = s;
        west = w;
    }
 
     public int isHere(String objName){   //added public keyword for testing purposes
        // This code implements isHere. Give it the name of an object and it will return the index number of that object.
        // NOTE: If there are more than one objects with the same name it will return the first only. If not found it returns -1
   
        int i=0;
        boolean found = false;
        
        while (i < objects.size() && !found) {
            if (!objName.equals(objects.get(i).name)) { // .equals() is used to compare strings
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