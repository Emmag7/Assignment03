
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author godie2014
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot karel = new Robot(kw, 10, 0, Direction.EAST);
        new Thing(kw, 10, 0);
        new Thing(kw, 10, 0);
        new Thing(kw, 10, 0);
        new Thing(kw, 10, 0);
        new Thing(kw, 10, 0);
        new Thing(kw, 10, 0);
        new Thing(kw, 10, 0);
        new Thing(kw, 10, 0);
        new Thing(kw, 10, 0);
        new Thing(kw, 10, 0);



        int count = 0;
           while (count < 10) {
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();

            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            count = count + 1;
            
                 
           
        }
        karel.move();

    }
}
