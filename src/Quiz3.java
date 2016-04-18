
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author godie2014
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot karel = new Robot(kw, 1, 1, Direction.EAST, 20);

        {
            int count = 0;
            while (count < 4) {
                int row = 0;
                while (row < 5) {
                    karel.putThing();
                    karel.move();
                    
                    row=row+1;
                }
                if (karel.getAvenue() == 6) {
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.move();
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.move();
                }
                if (karel.getAvenue()==0){
                  karel.turnLeft();
                  karel.move();
                  karel.turnLeft();
                  karel.move();
                  
                    
                }
                count = count + 1;
            }
        }
    }
}
