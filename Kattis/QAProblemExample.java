import static java.lang.System.*;
import java.util.*;
public class QAProblemExample 
{       
        	public static void main(String args[])
	{	Scanner s=new Scanner(in);
		out.println("Enter input:");
		while(s.hasNextLine())
		{	if(s.nextLine().toLowerCase().contains("problem"))
			out.println("yes");
			else
			out.println("no");
		}
	}
}
