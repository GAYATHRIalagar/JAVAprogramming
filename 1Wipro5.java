import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static int count,temp=0;
	public static int output1;
	public static int output2;
	public static int output3;
	public static int find(String input1)
	{
		String[] x=input1.split(" ");
		int[] a=new int[x.length];
		for(int i=0;i<x.length;i++)
		{
			a[i]=Integer.parseInt(x[i]);
		}
	for(int i=0;i<a.length;i++)
	{
		count=0;
		if(a[i]>1)
		{
			for(int j=2;j<=a[i]/2;j++)
			{
				
				if(a[i]==j)
				{
					
					
				}
				if(a[i]%j==0)
				{
					count=1;
				}
			}
			if(count==0)
			{
				temp++;
				if(temp==1)
				{
				output1=a[i];
				System.out.println("the first prime number is"+output1);
				output2=a[i+1];
				if(output2%2==0)
				{
				System.out.println("the immediate even number is"+output2);	
				}
				else
				{
					System.out.println("the immediate odd number is"+output2);	
				}	
				}
				output3=output1+output2;
				}
			}
		}
		return output3;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	Ideone i=new Ideone();
	int c=i.find("4 6 5 7 8 9");
	System.out.println("sum of prime and odd/even is"+c);
	}
}

QUESTION:

5. Given an integer number, find the first prime number, find immediate odd / even number and add prime number and immediate odd / even number. Use the following prototype:
public static int find(String input1)
The function takes as String input input1. The function sets the output1 variable to find first prime number and sets the output2
variable to find immediate (next to 1st prime number) odd / even number and sets the output3 
variable to add 1st prime number and immediate odd / even number
Example:
Input1 = {123456789}
Ouput1 should be {2}
Output2 should be if odd: {odd = 3} 
                                 If even {Even = 4}
Output3 should be ODD { output3 = 2 + 3 = 5}
                                   EVEN { output3 = 2 + 4 = 6}
