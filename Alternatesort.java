import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int a[]={1,2,3,4,5,6,7};
		int i;
		System.out.println(a.length/2);
		int n=a.length-1;
		if(a.length%2==0)
		{
		for(i=0;i<a.length/2;i++)
		{
			
			System.out.print(a[n-i]+" "+a[i]+" ");
		}
		}
		else
		{
		for(i=0;i<=a.length/2;i++)
		{
			if(i!=a.length/2)
			{
			System.out.print(a[n-i]+" "+a[i]+" ");
			}
			else
			{
				System.out.print(a[i]);
			}
		}
		}
		
	}
}


OUTPUT:

3
7 1 6 2 5 3 4
