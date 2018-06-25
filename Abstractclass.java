import java.util.*;
import java.lang.*;
import java.io.*;
abstract class Psna
{
	abstract void cse();
	void show()
	{
		System.out.println("hello");
	}
}
	class cse extends Psna
	{
		void cse()
		{
			System.out.println("welcome");
		}
	public static void main (String[] args) throws java.lang.Exception
	{
	cse c=new cse();
	c.show();
	c.cse();
	}
	}
