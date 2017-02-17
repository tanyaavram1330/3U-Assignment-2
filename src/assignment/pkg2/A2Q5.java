/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author anisoaraavram
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a city called kw
        City kw = new City();

        //creating robot
        Robot karel = new Robot(kw, 10, 5, Direction.EAST);

        //Getting karel to turn west
        if (karel.getDirection() == Direction.EAST) {
            karel.turnLeft();
            karel.turnLeft();

        } else if (karel.getDirection() == Direction.NORTH) {
            karel.turnLeft();

        } else if (karel.getDirection() == Direction.SOUTH) {
            //turning karel
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
        }
        //Getting karel to get to avenue 0
        while (karel.getAvenue() != 0) {
            karel.move();
        }

        //turning karel
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();

        //getting karel to street 0
        while (karel.getStreet() != 0) {
            karel.move();
        }

    }
}
