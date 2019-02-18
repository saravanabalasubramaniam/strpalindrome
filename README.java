import java.io.*;
import java.util.*;
class Strpalindrome
{
  public static void main(String args[])
   {
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	int flag=0;
	String rev="";
	int length=a.length();
	for(int i=length-1;i>=0;i--)
	{
		rev=rev+a.charAt(i);
	}
  if(a.equals(rev))
	{
		System.out.println("yes");
  }
	else
	{
		System.out.println("no");
	}
 }
}

	
