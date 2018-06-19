import java.util.*;
import java.lang.*;
import java.io.*;
class Prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,count=0;
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		for(i=2;i<=p/2;i++)
		{
			if(p%2==0)
			{
				count=count+1;
			}
		}
		if(count==0)
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
			System.out.println("It is Not Prime Number");
		}
	}
}
