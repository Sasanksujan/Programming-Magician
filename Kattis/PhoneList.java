import static java.lang.System.*;
import java.util.*;
import java.lang.instrument.Instrumentation;
class PhoneList
{	
	static public boolean contains(String []array)
	{	
		for(int i=0;i<array.length-1;i++)
		{	if(array[i + 1].indexOf(array[i])==0)
			return false;
        	}
		return true;
	}
	public static void main(String args[])
	{	Scanner s=new Scanner(in);	
		byte tcs=0;
		short npn=0;
		out.println("Enter no.of test cases");
		tcs=s.nextByte();
		String arr[][]=new String[tcs][];
		for(int i=0;i<arr.length;i++)
		{	out.println("Enter no.of pnone no's");
			npn=s.nextShort();
			String phnNos[]=new String[npn];
			for(int j=0;j<npn;j++)
			{phnNos[j]=s.next();
			}
			arr[i]=phnNos;
			Arrays.sort(phnNos);
			out.println(contains(phnNos));
		}
	}
}