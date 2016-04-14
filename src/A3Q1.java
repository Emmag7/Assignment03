
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**  
 *
 * @author godie2014
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();


        Robot karel = new Robot(kw, 0, 0, Direction.EAST);
    

        new Thing(kw, 0, 3);
        new Thing(kw, 0, 2);
        new Wall(kw,0,4,Direction.WEST);

        
        while(karel.frontIsClear() && !karel.canPickThing()){
            karel.move();
    }
        Robot tina=new Robot (kw,1,2,Direction.EAST);
        while (tina.frontIsClear()){
            tina.move();
            
            new Thing (kw,1,6);
            new Wall (kw,1,5,Direction.EAST);  
        }
        {
   
   } 
}        
}     
              
   



              
              
             
              
       
    
           