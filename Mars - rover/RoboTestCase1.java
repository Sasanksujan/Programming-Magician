import static org.junit.Assert.*;

import org.junit.Test;

public class RoboTestCase1 {

	@Test
	public void robotestcase1(){
        RoboGrid rg=new RoboGrid();
      //  System.out.println("Enter the order of the grid");
        int x=100;
        int y=100;
        
     
        Coordinates c=new Coordinates();
       // System.out.println("Enter the robo cordinates");
        c.setX(0);
        c.setY(0);
       // System.out.println("Enter the facing");
        c.setFacing("S");
        
        rg.getGridSize(x, y,c);
       // rg.displayGrid();
        
        String str="fflff";
        for(int i=0;i<str.length();i++)
        {
               char ch= str.charAt(i);
               String s=""+ch;
               c.setDirection(s);
               rg.moving(c);
        	
        }
        rg.displayGrid();
       assertEquals(2, c.getX());
       // assert 3==c.getX() && 3==c.getY();
        assertEquals(2, c.getY());

	}

}
