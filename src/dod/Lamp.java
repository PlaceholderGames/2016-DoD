/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dod;

/**
 *
 * @author hannah
 */
public class Lamp extends Object {
    boolean isOn;  
    public boolean isEmpty; // added public keyword for testing purposes
    int oilLev;

    public Lamp(String n, String d) { 
        super(n,d);
        isOn = false;
        oilLev = 7;
        isEmpty = false;
    }

    public void oilLevel(){
        if (!isEmpty) {
              if (oilLev <=0){
                  isOn = true;
                  isEmpty = true;
            }else           
                oilLev = oilLev -1; 
            }
            if (isEmpty) {  
                lampOff();
                isOn = false;
                System.out.println("The lamp has run out of oil!");
            }   
        } 
 
    public void lampOn (){
       isOn = true;
    }

    public void lampOff (){
      isOn = false;
    }
    
    public boolean isOn(){
        return isOn;
    }
}