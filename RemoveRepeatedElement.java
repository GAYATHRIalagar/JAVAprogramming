import java.util.*;
import java.lang.*;
import java.io.*;
class Remove
{
  public static void main (String[] args) throws java.lang.Exception
	{
		//String s="malayalam";
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		Set z=new HashSet();
		StringBuilder sb=new StringBuilder();
		System.out.println(s);
		for(char x : c)
		{
			if(!z.contains(x))
			{
				z.add(x);
				sb.append(x);
			}
		}
	
	System.out.println(sb);	
	}
}
