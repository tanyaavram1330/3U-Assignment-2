/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author anisoaraavram
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a city
        City kw = new City();
        kw.showThingCounts(true);
        
        //creating things
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);
       
        //creating robot
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);
        
        //moving bob the robot
        bob.move();
        
        while(true){
            //if is to see if he can pick up things
            if(bob.canPickThing()){
                //If it is lower than 7 it can pick thing up
                if(bob.countThingsInBackpack()<7){
                    bob.pickThing();
                    //If max 7 it just moves
                    bob.move();
                }else if (bob.countThingsInBackpack() <=7) {
                    //moving bob after having max 7 things in backpack
                    bob.move();
                }
        
        //(reference)Below are error codes. One above is the code that works.
        //picking up the object
        //while(bob.canPickThing()){
            //making bob pick up the thing
            //bob.pickThing();

            //moving bob
            //bob.move();
      
            //counting max things in backpack
        //if(bob.countThingsInBackpack() == 7){
            
            //moving bob
            //bob.move();
        }
        }
        
        
        
                
    }
    
}
