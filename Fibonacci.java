import java.util.*;
import java.lang.*;
import java.io.*;
class Fibo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=0,b=1,c,i;
		System.out.println(a);
		System.out.println(b);
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(i=2;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}
}
