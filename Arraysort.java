import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			int a[]={9,22,11,4,15,45,36};
		int i;
		Arrays.sort(a);
		
		for( i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		System.out.print("\n");
		for( i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		i=i+1;
		}
		
	}
}



OUTPUT:

4 9 11 15 22 36 45
4 11 22 45 
