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
import becker.robots.Wall;

/**
 *
 * @author anisoaraavram
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating city
        City kw = new City();
        kw.showThingCounts(true);

        //creating thing
        new Thing(kw, 1, 9);

        //creating bottom of the walls
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 1, 3, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 5, Direction.SOUTH);
        new Wall(kw, 1, 6, Direction.SOUTH);
        new Wall(kw, 1, 7, Direction.SOUTH);
        new Wall(kw, 1, 8, Direction.SOUTH);
        new Wall(kw, 1, 9, Direction.SOUTH);

        //creating the side walls
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 7, Direction.EAST);

        //creating robot karel
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);

        while (true) {
            if (karel.canPickThing()) {
                karel.pickThing();
            } else if (karel.countThingsInBackpack() == 1) {
                break;
            } else if (karel.frontIsClear()) {
                karel.move();
            } else if (!karel.frontIsClear()) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
            }
        }

    }

}
