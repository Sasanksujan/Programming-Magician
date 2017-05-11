import static java.lang.System.*;
import java.util.*;
class SortOfSort
{	public static void main(String args[])
	{   
		class StringsCompare implements Comparator<String>
		{	public int compare(String name1, String name2) 
			{	String sstr1 = name1.substring(0,2);
				String sstr2 = name2.substring(0,2);
				return sstr1.compareTo(sstr2);
			}
		}

                out.println("Enter Input:");
		Scanner s=new Scanner(in);
		while(s.hasNext())
		{	
			int count=s.nextInt();
			if(count==0)
			break;

			ArrayList<String> singleCaseNames=new ArrayList<String>();
			for(int i=1;i<=count;i++)
			{	String lname=s.next();
				singleCaseNames.add(lname);	
			}	
			Collections.sort(singleCaseNames, new StringsCompare());
                        
			for(String lname:singleCaseNames){
				out.println(lname);
			}
                        out.println();
                        
		}	
		
	}	
}