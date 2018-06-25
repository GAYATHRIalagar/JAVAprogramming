import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 String s="wipro technolgies bangaloru";
	 System.out.println(s);//print normalcase
	 String s1=s.toUpperCase();
	 System.out.println(s1);//print normal to uppercase
	 StringBuilder sb=new StringBuilder();
	 sb.append(s);
	 System.out.println(sb.reverse());//print reverse
	 {
	 String[] a=s.split(" ");
	 for(int i=0;i<a.length;i++)
	 {
	 	String x=a[i].substring(1);
	 	char x1=a[i].charAt(0);
	 	char y=Character.toUpperCase(x1);
	 	System.out.print(y+x+"\t");
	 }
	 System.out.print("\n");
	 }
	 {
	 String[] b=s1.split(" ");
	 for(int j=0;j<b.length;j++)
	 {
	 	String p=b[j].substring(1);
	 	char p1=b[j].charAt(0);
	 	char q=Character.toLowerCase(p1);
	 	System.out.print(q+p+"\t");
	 }
	 System.out.print("\n");
	 }
	}
}
