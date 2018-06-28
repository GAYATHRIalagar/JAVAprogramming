import java.util.*;
import java.lang.*;
import java.io.*;
class Test
{
	public static void main (String s[]) throws java.lang.Exception
	{
		try
		{
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		System.out.println("answer is"+a/b);
		}
		catch(ArithmeticException ae)
		{
		 System.out.println("divide by zero"+ae.getMessage());
		}
		catch(NumberFormatException ne)
		{
		 System.out.println("enter whole number"+ne.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ao)
		{
		 System.out.println("array error occur"+ao.getMessage());
		}
		finally
		{
		 System.out.println("program excuted");
		}
	}
}
