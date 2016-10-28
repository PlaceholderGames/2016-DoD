/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;
import java.util.List;
import java.util.Arrays;
/**
 *
 * @author tdahl01
 */
public class DoD {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.io.BufferedReader stdin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        World world = new World();
        Player player = new Player(world.locations.get(0));
        int temp;
        // Add starting objects to player.obj
        String cmd="I am a sentence"; // replaces the old one String cmd = "";
        List <String> commands = Arrays.asList(cmd.split(" ")); //To make sure we don't get warnings about uninstantiated variables
        cmd = ""; // returns us to the original empty string
        //System.out.println("this is a test: "+ commands.get(0)); //This is just a test to show it works
        System.out.println("You are in " + player.location.name);
        System.out.println(player.location.direct);


    while (!cmd.equalsIgnoreCase("quit")) {
                       
        if(commands.get(0).equalsIgnoreCase("w") || commands.get(0).equalsIgnoreCase("e") || commands.get(0).equalsIgnoreCase("s") || commands.get(0).equalsIgnoreCase("n")){
            System.out.println("You are in " + player.location.name);
            System.out.println(player.location.direct);
        }
            
            // This code tests to see if the sword is present to check isHere("sword") is working
            /*
            if (player.location.isHere("sword") != -1) {
                System.out.println("The sword is here!");
            }
            else System.out.println("The sword is NOT here");
            */
            
            
           // This code tests to see if the player is holding the sword to check isHolding("sword") is working
            /*
           if (player.isHolding("sword") != -1) {
                System.out.println("You\'re holding the sword!");
            }
            else System.out.println("You are going to need a sword"); 
            */     
           if(commands.get(0).equalsIgnoreCase("help")){
               System.out.print("The aim of game is to kill the enemy in the "
                   + "cave whilst picking up items on the way, which may help kill the enemy! ");
            }
            //Decrease oil level
            if(player.isHolding("lamp") !=-1 && World.lp.isOn){
               World.lp.oilLevel();
               System.out.println("The oil level of the lamp is: " + World.lp.oilLev);  
            }
            //Testing the status of the location
            if (player.location.isLit == false && !World.lp.isOn()){
                System.out.println ("It's too dark here. You can't see anything.");
            } else{
            // This code prints out location objects
                if (player.location.objects.size() > 0) {
                    System.out.print("You can see ");  
                    int n = player.location.objects.size();
                    for(int i = 0; i < n ; i++) {
                    System.out.print( player.location.objects.get(i).name );
                    if (i <n-1)  System.out.print(", ");
                    }
                System.out.println(" here.");              
                }
            }
        
            System.out.println("What next?");
            try{
                cmd = stdin.readLine();
                commands = Arrays.asList(cmd.split(" "));
            }catch(java.io.IOException e){
                System.out.println(e);
            }
            if(commands.get(0).equalsIgnoreCase("n")){
                if(player.location.north!=null){
                    player.location = player.location.north;
                }else{
                    System.out.println("There is no exit to the north.");
                }
            }
            if(commands.get(0).equalsIgnoreCase("e")){
                if(player.location.east!=null){
                    player.location = player.location.east;
                }else{
                    System.out.println("There is no exit to the east.");
                }
            }
            if(commands.get(0).equalsIgnoreCase("s")){
                if(player.location.south!=null){
                    player.location = player.location.south;
                }else{
                    System.out.println("There is no exit to the south.");
                }
            }
            if(commands.get(0).equalsIgnoreCase("w")){
                if(player.location.west!=null){
                    player.location = player.location.west;
                }else{
                    System.out.println("There is no exit to the west.");
                }
            }       
            if(commands.get(0).equalsIgnoreCase("take")){
                if (player.location.isLit == false && !World.lp.isOn()){
                    System.out.println ("You can't see anything. If only you had a lit lamp...");
                }
                else {
                    int i = 0;
                    Boolean taken = false;
                    String objectsTaken = "";
                    int n = player.location.objects.size();
                    if (n>0){
                        // Some test code for multiple word sentences
                        if (commands.size() > 1) {
                            if (commands.get(1).equalsIgnoreCase("all"))  {
                                while (i < player.location.objects.size()){
                                    if (player.location.objects.get(i).takeable() != -1) {
                                        player.invent.add(player.location.objects.get(i));
                                        taken = true;
                                        objectsTaken = (objectsTaken + player.location.objects.get(i).name);
                                        player.location.objects.remove(i);
                                        if (i != player.location.objects.size()){
                                        objectsTaken = (objectsTaken + ", ");
                                        }
                                    }
                                    else {
                                        i++;
                                    }
                                }
                                if (taken = true)
                                System.out.println("You have taken the following: " + objectsTaken);
                            }
                            else {
                                temp = player.location.isHere(commands.get(1));
                                if (temp != -1) {
                                    if (player.location.objects.get(temp).takeable() != -1) {
                                        player.invent.add(player.location.objects.get(temp));
                                        player.location.objects.remove(temp);
                                    }
                                    else {
                                        System.out.println("You can't take this!");
                                    }            
                                } 
                                else {
                                    System.out.println("That\'s not here, if it exists at all.");
                                }              
                            }           
                        }
                        else {
                            System.out.println("Take what?");
                        }    
                    } 
                    else {
                        System.out.println("There is no object here.");
                    } 
                }  
            }            
            if(commands.get(0).equalsIgnoreCase("drop")){
                int n = player.invent.size();
                if (n>0) {
                    if (commands.size() > 1) {
                        if (commands.get(1).equalsIgnoreCase("all")) {
                            player.location.objects.addAll(player.invent);
                            System.out.println("You have dropped the following: ");
                            for (Object ob : player.invent){
                                System.out.println(ob.name);
                            }
                            player.invent.removeAll(player.invent);
                        }
                        else {
                            temp = player.isHolding(commands.get(1));
                            if (temp != -1) {
                                player.location.objects.add(player.invent.get(temp));
                                player.invent.remove(temp);
                            }
                            else {
                                System.out.println("You\'re not holding that.");
                            }
                        }
                    }
                    else {
                        System.out.println("Drop what?");
                    }
                } 
                else {
                System.out.println("You aren't holding anything.");
                }
            }
            if(commands.get(0).equalsIgnoreCase("x") || commands.get(0).equalsIgnoreCase("exam") || commands.get(0).equalsIgnoreCase("examine")){
                if (player.location.isLit == false && player.isHolding("lamp")!= 1){
                    System.out.println("You can't examine anything in the dark. If only you had a lamp...");
                } else if (player.location.isLit == false && player.isHolding("lamp")!= -1){
                    temp = player.isHolding("lamp");
                    Lamp l = (Lamp)player.invent.get(temp);
                    if (l.isOn() == false){
                        System.out.println("You can't see anything. If only you could use that lamp...");
                    } else {
                        int objectsSize = player.location.objects.size();
                        int inventSize = player.invent.size();
                        if (commands.size() > 1) {
                            if (objectsSize > 0 && player.location.isHere(commands.get(1))!= -1) {
                                System.out.println(player.location.objects.get(player.location.isHere(commands.get(1))).desc);       
                                } else if (inventSize > 0 && player.isHolding(commands.get(1))!= -1) {
                                    System.out.println(player.invent.get(player.isHolding(commands.get(1))).desc); 
                            } else {
                                System.out.println("That\'s not here to examine, if it exists at all.");
                            }
                        } else {
                            System.out.println("Examine what?");
                        }
                    }
                } else {
                    int objectsSize = player.location.objects.size();
                    int inventSize = player.invent.size();
                    if (commands.size() > 1) {
                        if (objectsSize > 0 && player.location.isHere(commands.get(1))!= -1) {
                            System.out.println(player.location.objects.get(player.location.isHere(commands.get(1))).desc);       
                            } else if (inventSize > 0 && player.isHolding(commands.get(1))!= -1) {
                                System.out.println(player.invent.get(player.isHolding(commands.get(1))).desc); 
                        } else {
                            System.out.println("That\'s not here to examine, if it exists at all.");
                        }
                    } else {
                        System.out.println("Examine what?");
                    }
                }
            } 
            if (commands.get(0).equalsIgnoreCase("use")) {
                if (commands.size() > 1) {
                    if (commands.get(1).equalsIgnoreCase("Lamp")) {
                        if (((player.isHolding("lamp") != -1) || (player.location.isHere("lamp") != -1)) && (!World.lp.isOn)) {
                            World.lp.isOn = true;
                            System.out.println("The lamp is on.");
                        } else if (((player.isHolding("lamp") != -1) || (player.location.isHere("lamp") != -1)) && (World.lp.isOn)) {
                            World.lp.isOn = false;
                            System.out.println("The lamp is off");
                        } else {
                            System.out.println("You  do not have a lamp to use");
                        }
                    }
                }
                if (commands.size() > 1) {
                    if (commands.get(1).equalsIgnoreCase("Sword")) {
                        if ((World.lp.isOn == true) && player.isHolding("sword") != -1 && player.location.isHere("dragon") != -1) {
                            System.out.println("You killed the dragon. You won!");
                            System.exit(0);
                            System.out.println("Goodbye!");
                        } else if (player.location.name.equalsIgnoreCase("cave") && player.isHolding("sword") != -1 && player.isHolding("lamp") == -1 && player.location.isHere("lamp") == -1) {
                            System.out.println("You lost! Dragon killed you because you have not seen him because you have not had a lamp on you!");
                            System.exit(0);
                            System.out.println("Goodbye!");                          
                        } else if ((World.lp.isOn == false) && player.isHolding("sword") != -1 && player.location.isHere("dragon") != -1) {
                            System.out.println("You cannot use the sword because you cannot see anything. Use your lamp!");
                        } else if (player.isHolding("sword") != -1 && player.location.isHere("dragon") == -1) {
                            System.out.println("You cannot use the sword because there is nothing to kill");
                        } else if (player.isHolding("sword") == -1) {
                            System.out.println("You do not have a sword to use.");
                        }
                    }
                }
            }
            if (player.location.name.equalsIgnoreCase("cave") && player.isHolding("lamp") == -1 && player.isHolding("sword") == -1) {
                System.out.println("You lost! The dragon killed you because you did not have the required objects to see him and kill him!");
                System.exit(0);
                System.out.println("Goodbye!");
            } else if (player.location.name.equalsIgnoreCase("cave") && player.isHolding("lamp") != -1 && player.isHolding("sword") == -1) {
                System.out.println("You lost! The dragon killed you because you did not have a sword to kill him");
                player.location.isLit = true;
                System.exit(0);
                System.out.println("Goodbye!");
            } else if (player.location.name.equalsIgnoreCase("cave") && player.isHolding("lamp") == -1 && player.isHolding("sword") != -1) {
                System.out.println("You lost! The dragon killed you because you could not see him because you did not have a lamp on you!");
                System.exit(0);
                System.out.println("Goodbye!");
            }         
            if(commands.get(0).equalsIgnoreCase("i")){
                int n = player.invent.size();
                if (n>0) {
                    System.out.println("You have the following:");
                    for (Object in : player.invent){
                        System.out.println(in.name);
                    }
                } else {
                System.out.println("You aren't holding anything.");
                }
            }          
            if (commands.get(0).equalsIgnoreCase("look")) {
                System.out.println(player.location.desc);
            }            
            if(commands.get(0).equalsIgnoreCase("quit")){
                System.out.println("You quit.");
            }        
        }
        System.out.println("Goodbye!");
    }
}