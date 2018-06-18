import java.util.*;
import java.lang.*;
import java.io.*;
class Fact
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int f=1,i;
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(i=1;i<=a;i++)
		{
			f=f*i;
		}
			System.out.println("The factorial number is "+f);
	}
}
