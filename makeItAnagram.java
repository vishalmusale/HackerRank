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
    	String a = s.nextLine();
    	String b = s.nextLine();
    	
    	System.out.println(makeItAnagram(a,b));
    	
    
    }

	private static int makeItAnagram(String a, String b) {
		// TODO Auto-generated method stub
		
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(arr1==arr2)
			return 0;
		else
		{
			int count=0, flag=0;
			
			for(int i=0; i<a.length();i++)
			{
				for(int j=0; j<b.length(); j++)
				{
					if(a.charAt(i)==b.charAt(j))
						{
							flag=1;
							break;
						}
					else 
						flag=0;
				}
				if(flag==0)
					count++;
			}
			
			for(int i=0; i<b.length();i++)
			{
				for(int j=0; j<a.length(); j++)
				{
					if(b.charAt(i)==a.charAt(j))
					{
						flag=1;
						break;
					}
					else
						flag=0;
				}
				if(flag==0)
					count++;
			}
			return count;
		}
	}
}