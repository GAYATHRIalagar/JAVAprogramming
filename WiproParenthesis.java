
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		int c=0,d=0,i;
		for(i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='(')
			{
				c++;
			}
			else if(ch==')')
			{
				d++;
			}
		}
		if(c==d)
		{
			System.out.println("valid");
		}
		else
		{
				System.out.println("invalid");
		}
		
	}
}

OUTPUT:
(())
valid
