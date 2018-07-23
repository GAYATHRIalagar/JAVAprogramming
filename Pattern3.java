import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   int n=5,z;
               for(int i=1;i<=n;i++)
               {
       	      for(int j=i;j<=n;j++)
       	      {
       	            System.out.print(" ");
       	      }
       	      for(z=1;z<=i;z++)
       	      {
       		System.out.print(z);
       	      }
       	      for(z=i-1;z>0;z--)
       	      {
       	      	System.out.print(z);
       	      }
       	      System.out.println();
              }
	}
}

OUTPUT:

    1
   121
  12321
 1234321
123454321

