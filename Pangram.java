import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner s = new Scanner(System.in);
    	String str = s.nextLine();
    	
    	System.out.println(pangram(str));
    }

	private static String pangram(String str) {
		// TODO Auto-generated method stub
		
		String lower = str.toLowerCase();
		int x=0, flag=0;
		
		int[] a = new int[26];
		for(int i=0; i<26;i++)
		{
			a[i]=0;
		}
		
		for(int j=0; j<lower.length(); j++)
		{
			char c= lower.charAt(j);
			
			if(c>96 && c<123)
				a[c-97]=1;
		}
		
		for(x=0;x<26;x++)
		{
			if(a[x]==1)
			{
				flag=1;
			}
			else
			{
				flag=0;
				break;
			}
		}
		
		if(flag==1)
			return "panagram";
		else
			return "not pangram";
		
	}
}