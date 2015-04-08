import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
    	// Input
    	Scanner s = new Scanner(System.in);
    	int T= s.nextInt();
    	T++;
    	String[] str=new String[T];
    	
    	for(int i=0; i<T; i++)
    	{
    		str[i] = s.nextLine();
    	}
    	
    	for(int i=1; i<T; i++)
    	{
    		System.out.println(subString(str[i]));
    	}
    	
    }

    // For Creating Substrings
    private static int subString(String string) {
		// TODO Auto-generated method stub
		
    	ArrayList<String> list = new ArrayList<String>();
		
    	int count=0;
    	//String s="";
    	
    	//	Adding Substring
    	for(int i=0; i<string.length(); i++)
		{
			for(int j=1; j<=string.length()-i; j++)
			{
				list.add(string.substring(i, i+j));
				//s+= string.substring(i, i+j) +" ";
			}
		}
    	
    	for(int i=0; i<list.size(); i++)
    	{
    		for(int j=i+1; j<list.size(); j++)
    		{
    			count += anagram(list.get(i), list.get(j));
    		}
    	}
    	//return s;
    	return count;
	}

	//	For Checking Anagram
	private static int anagram(String string1, String string2) {
		// TODO Auto-generated method stub
		int flag=0;
		
		char[] ar1 = string1.toCharArray();
		char[] ar2 = string2.toCharArray();
		
		if(ar1.length!=ar2.length)
			return 0;
		else
		{
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			//String a = new String(ar1);
			//String b = new String(ar2);
			
			if(Arrays.equals(ar1, ar2))
				return 1;
			else
				return 0;
		}
	}
		
    	
}