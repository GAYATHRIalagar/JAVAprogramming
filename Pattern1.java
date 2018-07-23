import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n=5,c=0;
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("\t");
			}
			c++;
			for(int k=1;k<=c;k++)
			{
			System.out.print("\t"+i);
			}
			System.out.println();
			c=c+1;
		}
	}
}


OUTPUT:

						5
					4	4	4
				3	3	3	3	3
			2	2	2	2	2	2	2
		1	1	1	1	1	1	1	1	1
