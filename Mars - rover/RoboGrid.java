import java.util.Scanner;

public class RoboGrid {

	int r,c;
	int grid[][];
// initializing size and assigning 0 in all gird values
	void getGridSize(int r,int c,Coordinates c1)
	{
		this.r=r;
		this.c=c;
		grid=new int[r][c];
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid[i].length;j++)
			{
				grid[i][j]=0;
				
			}
		}
		grid[c1.getX()][c1.getY()]=1;
		
		
	}
	void displayGrid()
	{
		System.out.println("The gird values are");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}
	void moving(Coordinates c)
	{
		// North direction
		if(c.getFacing().equals("N"))
		{
			
	          if(c.getDirection().equals("f"))
	          {
	        	  if(c.getX()-1>=0)
	        	  {
	        		  grid[c.getX()][c.getY()]=0;
	        		  int x=c.getX();
	        		  c.setX(x-1);
	        		  grid[c.getX()][c.getY()]=1;
	        		 
	        	  }
	        	  else
	        	  {
	        		  System.out.println("Obstacle found the grid is ended in the forword direction");
	        	       System.exit(0);
	        	  }
	          }
	          else if(c.getDirection().equals("b"))
	          {
	        	 
	        	  if(c.getX()+1<grid.length)
	        	  {
	        		  grid[c.getX()][c.getY()]=0;
	        		  int x=c.getX();
	        		  c.setX(x+1);
	        		  grid[c.getX()][c.getY()]=1;
	        		 
	        	  }
	        	  else
	        	  {
	        		  System.out.println("Obstacle found the grid is ended in the backward direction");
	        		  System.exit(0);
	        	  }
	          }
	          else if(c.getDirection().equals("l"))
	          {
	        	 
	        	 
	        	    c.setFacing("W");	 
	        	  
	          }
	          else if(c.getDirection().equals("r"))
	          {
	        	 
	        	    c.setFacing("E");	 
	        	  
	          }
		}
		// South Direction
		else if(c.getFacing().equals("S"))
		{
			
	          if(c.getDirection().equals("f"))
	          {
	        	  if(c.getX()+1<grid.length)
	        	  {
	        		  grid[c.getX()][c.getY()]=0;
	        		  int x=c.getX();
	        		  c.setX(x+1);
	        		  grid[c.getX()][c.getY()]=1;
	        		 
	        	  }
	        	  else
	        	  {
	        		  System.out.println("Obstacle found the grid is ended in the forward direction");
	        		  System.exit(0);
	        	  }
	          }
	          else if(c.getDirection().equals("b"))
	          {
	        	  if(c.getX()-1>=0)
	        	  {
	        		  grid[c.getX()][c.getY()]=0;
	        		  int x=c.getX();
	        		  c.setX(x-1);
	        		  grid[c.getX()][c.getY()]=1;
	        		 
	        	  }
	        	  else
	        	  {
	        		  System.out.println("Obstacle found the grid is ended in the backward direction");
	        		  System.exit(0);
	        	  }
	        	  
	          }
	          else if(c.getDirection().equals("l"))
	          {
	        	  
	        	 
	        	    c.setFacing("E"); 
	        	  
	     
	          }
	          else if(c.getDirection().equals("r"))
	          {
	        	  
	        	    c.setFacing("W"); 
	        	  
	       }
		}
		
		
		// East direction
		else if(c.getFacing().equals("E"))
				{
					
			          if(c.getDirection().equals("f"))
			          {
			        	  if(c.getY()+1<grid[c.getX()].length)
			        	  {
			        		  grid[c.getX()][c.getY()]=0;
			        		  int y=c.getY();
			        		  c.setY(y+1);
			        		  grid[c.getX()][c.getY()]=1;
			        		 
			        	  }
			        	  else
			        	  {
			        		  System.out.println("Obstacle found the grid is ended in the forward side direction");
			        		  System.exit(0);
			        	  }
			        	  
			        	  
			          }
			          else if(c.getDirection().equals("b"))
			          {
			        	  if(c.getY()-1>=0)
			        	  {
			        		  grid[c.getX()][c.getY()]=0;
			        		  int y=c.getY();
			        		  c.setY(y-1);
			        		  grid[c.getX()][c.getY()]=1;
			        		 
			        	  }
			        	  else
			        	  {
			        		  System.out.println("Obstacle found the grid is ended in the backward side direction");
			        		  System.exit(0);
			        	  }
			        	 
			          }
			          else if(c.getDirection().equals("l"))
			          {
			        	 
			        	 	  c.setFacing("N");
			        	   
			          }
			          else if(c.getDirection().equals("r"))
			          {
			        	
			        	 	  c.setFacing("S");	 
			        	  
			          }
				}
		
           //West Direction
		else if(c.getFacing().equals("W"))
				{
					
			          if(c.getDirection().equals("f"))
			          {
			        	  
			        	  if(c.getY()-1>=0)
			        	  {
			        		  grid[c.getX()][c.getY()]=0;
			        		  int y=c.getY();
			        		  c.setY(y-1);
			        		  grid[c.getX()][c.getY()]=1;
			        		 
			        	  }
			        	  else
			        	  {
			        		  System.out.println("Obstacle found the grid is ended in the forward side direction");
			        		  System.exit(0);
			        	  }
			        	   
			        	  
			          }
			          else if(c.getDirection().equals("b"))
			          {
			        	  if(c.getY()+1<grid[c.getX()].length)
			        	  {
			        		  grid[c.getX()][c.getY()]=0;
			        		  int y=c.getY();
			        		  c.setY(y+1);
			        		  grid[c.getX()][c.getY()]=1;
			        		 
			        	  }
			        	  else
			        	  {
			        		  System.out.println("Obstacle found the grid is ended in the backward side direction");
			        		  System.exit(0);
			        	  }
			        	 
			          }
			          else if(c.getDirection().equals("l"))
			          {
			        	 
			        	 
			        	 	  c.setFacing("S");	 
			        	   
			          }
			          else if(c.getDirection().equals("r"))
			          {
			        	  
			        	 	  c.setFacing("N"); 
			        	   
			        	 
			          }
				}

				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in); 
        RoboGrid rg=new RoboGrid();
        System.out.println("Enter the order of the grid");
        int x=sc.nextInt();
        int y=sc.nextInt();
        
     
        Coordinates c=new Coordinates();
        System.out.println("Enter the robo cordinates");
        c.setX(sc.nextInt());
        c.setY(sc.nextInt());
        System.out.println("Enter the facing");
        c.setFacing(sc.next());
        
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
        System.out.println(c.getX()+" "+c.getY()); 
       
      /*  String opt;
        do
        {
        	System.out.println("Enter f ->forward"
        			+ "\nEnter b->backword"
        			+ "\nEnter l->left"
        			+ "\nEnter r-right"
        			+ "\nEnter e->exit");
        	opt=sc.next();
        	switch(opt)
        	{
        	case "f":
        		        c.setDirection("f");
        		        rg.moving(c);
        		  break;
        	case "b":
        		c.setDirection("b");
		        rg.moving(c);
		        break;
		  
        	case "l":
        		c.setDirection("l");
		        rg.moving(c);
		        break;
		  
      		  
        	case "r":
        		c.setDirection("r");
		        rg.moving(c);
      		  break;
        	
             
        	 
        	}
        	rg.displayGrid();
        	
        }while(!opt.equals("e"));
        */  
		
	}

}
