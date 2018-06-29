import java.util.*;
import java.lang.*;
import java.io.*;
class Countelements
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="Malayalam";
		String s1=s.toLowerCase();
		int s2=s.length();
		System.out.println(s1);
		System.out.println(s2);
		char c;
		int count=0;
		for(char i='a';i<='z';i++)
		{
                        count=0;
		for(int j=0;j<s2;j++)
		{
			c=s1.charAt(j);
			if(c==i)
			count++;
		}
		if(count!=0)
		{
		System.out.println(i+"\t"+count);	
		}
		}
	
	}
}
