import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=5,c=0,t=7;
		char[] ch={'A','B','C','D'};
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			c++;
			for(int k=1;k<=c;k++)
			{
				System.out.print(i);
			}
			c=c+1;
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=t;k++)
			{
				System.out.print(ch[i-1]);
			}
			t=t-2;
			System.out.println();
		}
	}
}

OUTPUT:

     1
    222
   33333
  4444444
 555555555
  DDDDDDD
   CCCCC
    BBB
     A
