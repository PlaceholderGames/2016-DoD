/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dod;

/**
 *
 * @author met
 */
public class Inventory {
    public void addObjectsToInv(String name){
        for (int i =0; i < inv.length; i++){
            if(inv[i] == null){
                inv[i] = name;

    System.out.println("You begin with a" + name +",");

                return;
            }
        }
     System.out.println("There is no space in your inventory.");
    }
    public void printInv(){
        for(String x: inv){

     System.out.println(x);

        }
    }

 private static String inv[] = new String [7];

 }