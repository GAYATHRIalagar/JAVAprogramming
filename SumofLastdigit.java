import java.io.*;
import  java.util.*;
class UserMainCode
{

	public int addLastDigits(int input1,int input2)
  {
    int output1,a,b;
		a=Math.abs(input1%10);
		b=Math.abs(input2%10);
		output1=a+b;
		return output1;
	}
}
