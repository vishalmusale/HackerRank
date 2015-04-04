import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    	
    	// Declaration
    	Scanner s = new Scanner(System.in);
    	int no = s.nextInt();
    	String[] str = new String[no];
    	String[] revstr = new String[no];
    	
    	// Initialization
    	for(int i = 1; i<= no; i++)
    	{
    		str[i] = s.nextLine();
    	}
    	
    	// Reverse String
    	for(int i = 1; i<= no; i++)
    	{
    		revstr[i] = StringRev(str[i]);
    	}
    	
    	// Answer and output
    	for(int i = 1; i<= no; i++)
    	{
    		System.out.println(FunnyOrNot(str[i],revstr[i]));
    	}
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

}