import java.util.*;
import java.lang.*;
import java.io.*;
class SecondWord
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  String s="guvi github";
	  String[] z=s.split(" ");
	  if(z.length==1)
	  {
	  	System.out.println("LESS");
	  }
	  else
	  {         
	  	String x=z[1].toUpperCase();
	  	System.out.println(x);
	  }
	}
}
