/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.WEST;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author anisoaraavram
 */
public class A2C1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating city called kw
        City kw = new City();

        //creating a robot named karel
        Robot karel = new Robot(kw, 0, 2, Direction.SOUTH);

        //creating walls for the left Road
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        new Wall(kw, 4, 0, Direction.WEST);
        new Wall(kw, 5, 0, Direction.WEST);
        new Wall(kw, 6, 0, Direction.WEST);
        new Wall(kw, 7, 0, Direction.WEST);
        new Wall(kw, 8, 0, Direction.WEST);
        new Wall(kw, 9, 0, Direction.WEST);

        //creating walls for the Right Road
        new Wall(kw, 0, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 2, 1, Direction.EAST);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 5, 1, Direction.EAST);
        new Wall(kw, 6, 1, Direction.EAST);
        new Wall(kw, 7, 1, Direction.EAST);
        new Wall(kw, 8, 1, Direction.EAST);
        new Wall(kw, 9, 1, Direction.EAST);

        //creating walls for the right street
        new Wall(kw, 0, 2, Direction.EAST);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 6, 2, Direction.EAST);
        new Wall(kw, 9, 2, Direction.EAST);
        //creating wall for the top right side
        new Wall(kw, 1, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.EAST);
        //creating wall for the middle right side
        new Wall(kw, 4, 5, Direction.EAST);
        //creating wall for the bottom right side
        new Wall(kw, 7, 7, Direction.EAST);
        new Wall(kw, 8, 7, Direction.EAST);

        //creating wall for the bottom street
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        //creating wall for the bottom middle
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.SOUTH);
        //creating bottom wall for second bottom
        new Wall(kw, 8, 3, Direction.SOUTH);
        new Wall(kw, 8, 4, Direction.SOUTH);
        new Wall(kw, 8, 5, Direction.SOUTH);
        new Wall(kw, 8, 6, Direction.SOUTH);
        new Wall(kw, 8, 7, Direction.SOUTH);
        //creating wall for the bottom
        new Wall(kw, 9, 2, Direction.SOUTH);

        //creating the top wall of the street
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 6, Direction.NORTH);
        //crating the top wall of the middle
        new Wall(kw, 4, 3, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        //crating the top wall of the bottom
        new Wall(kw, 7, 3, Direction.NORTH);
        new Wall(kw, 7, 4, Direction.NORTH);
        new Wall(kw, 7, 5, Direction.NORTH);
        new Wall(kw, 7, 6, Direction.NORTH);
        new Wall(kw, 7, 7, Direction.NORTH);

        //creating things on the road
        new Thing(kw, 0, 1);
        new Thing(kw, 1, 0);
        new Thing(kw, 2, 0);
        new Thing(kw, 3, 0);
        new Thing(kw, 3, 1);
        new Thing(kw, 4, 0);
        new Thing(kw, 5, 1);
        new Thing(kw, 7, 0);
        new Thing(kw, 7, 1);
        new Thing(kw, 8, 1);
        new Thing(kw, 9, 0);
        new Thing(kw, 9, 1);

        //creating things on street
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 4);
        new Thing(kw, 2, 6);
        new Thing(kw, 4, 2);
        new Thing(kw, 4, 3);
        new Thing(kw, 4, 4);
        new Thing(kw, 7, 2);
        new Thing(kw, 7, 3);
        new Thing(kw, 7, 7);
        new Thing(kw, 8, 3);
        new Thing(kw, 8, 4);
        new Thing(kw, 8, 6);

        //creating things outside the street and road
        new Thing(kw, 0, 3);
        new Thing(kw, 0, 4);
        new Thing(kw, 0, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 6);
        new Thing(kw, 4, 6);
        new Thing(kw, 4, 7);
        new Thing(kw, 5, 5);
        new Thing(kw, 5, 7);
        new Thing(kw, 6, 4);
        new Thing(kw, 6, 6);
        new Thing(kw, 9, 3);
        new Thing(kw, 9, 4);
        new Thing(kw, 9, 6);

        //making a wall follower
        //doing while statement to unify the code
        while (true) {
            if (karel.canPickThing()) {
                karel.pickThing();

            }
            if (karel.frontIsClear()) {
                karel.move();

            }
            if (karel.frontIsClear()) {
                karel.turnLeft();
            }
            //if karel faces the direction west he turns left when facing wall
            if (karel.getDirection() == WEST && !karel.frontIsClear()) {
                karel.turnLeft();
            }

            if (!karel.frontIsClear()) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();

                //&& is to add things in the bracket + to make it strict
                //making karel stop at the cordinets and to drop the things
            }
            while (karel.getAvenue() == 2 && karel.getStreet() == 9 && karel.countThingsInBackpack() > 0) {
                karel.putThing();
            }
            //stopping the loop
            if (karel.getAvenue() == 2 && karel.getStreet() == 9) {
                break;

            }
        }

    }

}
//How to turn right (An example)
//private static void Right(Robot name){
//for(int i = 0; i < 3; i++)
//name.turnLeft();

