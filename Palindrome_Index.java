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
    	no++;
    	String[] str = new String[no];
    	//char[] chararr = new char[no];
    	
    	// Initialization
    	for(int i = 0; i< no; i++)
    	{
    		str[i] = s.nextLine();
    	}
    	
    	// Answer and output
    	for(int i = 1; i< no; i++)
    	{
    		System.out.println(RevStr(str[i]));
    	}
    }

	private static int RevStr(String str) {
		// TODO Auto-generated method stub
		
		String rev = new StringBuffer(str).
		reverse().toString();
		
		int[] a = checkPalindrome(str);
		int[] b = checkPalindrome(rev);
		
		if(a[0]>b[0])
			return (rev.length()-b[1]-1);
		else
			return a[1];
	}

	private static int[] checkPalindrome(String str) {
		// TODO Auto-generated method stub
		
		int mid=((str.length())/2)-1;
		int[] op = new int[2];
		op[0] = 0;
		op[1] = -1;
		
		for(int i=0, j=str.length()-1; i<=mid && mid<str.length(); i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				op[0]++; mid++;j++;op[1]=i;
			}
		}
		return op;
	}
}