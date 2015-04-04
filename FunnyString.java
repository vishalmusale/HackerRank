import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    	Scanner s = new Scanner(System.in);
    	String str1 = s.nextLine();
    	String str2 = s.nextLine();
    	String str3 = s.nextLine();
    	
    	String revstr2 = StringRev(str2);
    	String revstr3 = StringRev(str3);
    	
    	System.out.println(FunnyOrNot(str2,revstr2));
    	System.out.println(FunnyOrNot(str3,revstr3));
    	
    	//System.out.println(revstr);
    }

	private static String FunnyOrNot(String str, String revstr) {
		// TODO Auto-generated method stub
		int flag =0;
		for(int i = 0; i< str.length()-1; i++)
		{
			int a=Math.abs(str.charAt(i)-str.charAt(i+1));
			int b=Math.abs(revstr.charAt(i)-revstr.charAt(i+1));
			if(a==b)
				flag =1;
			else
			{
				flag = 0;
				break;
			}
		}
		
		if(flag == 1)
			return "Funny";
		else
			return "Not Funny";
	}

	private static String StringRev(String str) 
	{
		// TODO Auto-generated method stub
		
		String rev = "";
		
		for(int i=str.length() -1; i>=0; i--)
		{
			rev += str.charAt(i);
		}
			
		return rev;
	}
}