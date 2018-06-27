import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="Java Prp ";
		String s1="From Psna";
		String a=s+s1;
		System.out.println(a);
	  StringBuilder sb=new StringBuilder();
		sb.append(a);
    System.out.println(sb.reverse());
	{
	String[] x=s.split(" ");
	for(int i=0;i<x.length;i++)
	{
    StringBuilder sp=new StringBuilder();
		sp.append(x[i]);
    System.out.print(sp.reverse());
	} 
	}
	System.out.println();
	{
	String[] y=s1.split(" ");
	for(int j=0;j<y.length;j++)
	{
		StringBuilder sp1=new StringBuilder();
		sp1.append(y[j]);
    System.out.print(sp1.reverse());
	}
	}
	}
}
