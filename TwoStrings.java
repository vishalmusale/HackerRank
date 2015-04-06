import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	Scanner s = new Scanner(System.in);
    	int no = s.nextInt();
    	no=no*2;no++;	// 2time input
    	String[] str = new String[no];
    	
    	// Initialization
    	for(int i = 0; i< no; i++)
    	{
    		str[i] = s.nextLine();
    	}
    	
    	// Answer and output
    	for(int i = 1; i< no; i=i+2)
    	{
    		System.out.println(twoString(str[i],str[i+1]));
    	}
    }

	private static String twoString(String str1, String str2) {
		// TODO Auto-generated method stub
		ArrayList<String> a = subString(str1);
		ArrayList<String> b = subString(str2);
		
		for(int i=0; i<a.size(); i++)
		{
			if(b.contains(a.get(i)))
				return "YES";
		}
		return "NO";
	}

	private static ArrayList<String> subString(String str) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=1; j<=str.length()-i; j++)
			{
				list.add(str.substring(i, i+j));
			}
		}
		return list;
	}
}