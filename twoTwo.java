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
    	//int[] A = new int[T];
    	String[] str=new String[T];
    	
    	for(int i=0; i<T; i++)
    	{
    		str[i] = s.nextLine();
    		
    	}
    	
    	for(int i=1;i<T; i++)
    	{
    		System.out.println(twoTow(str[i]));
    	}
		
    }

	private static int twoTow(String str) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<str.length(); i++)
		{
			for(int j=1; j<=str.length()-i; j++)
			{
				list.add(strength(str.substring(i, i+j)));
			}
		}
		
		//Object obj = Collections.min(list);
		
		int count=0;
		for(int i=0; i<list.size(); i++)
		{
			count+= isPowerOfTwo(list.get(i));
		}
		/*
		  bool isPowerOfTwo(int n)
			{
			  if (n == 0)
			    return 0;
			  while (n != 1)
			  {
			    if (n%2 != 0)
			      return 0;
			    n = n/2;
			  }
			  return 1;
			}
	  */
		 
		
		
		return count;
	}

	private static int isPowerOfTwo(Integer n) {
		// TODO Auto-generated method stub
		
		if (n == 0 || n==1)
		    return 0;
		
		while (n != 1)
		{
		   if (n%2 != 0)
		      return 0;
		    n = n/2;
		}
		  
		return 1;
	}

	private static int strength(String a) {
		// TODO Auto-generated method stub
		
		if( ((int) a.charAt(0) - 48) == 0)
			return 0; //If first child has value 0 in the group, strength of group is zero
		
		int value = 0;
		
		for(int i=0; i<a.length(); i++)
			value = value*10 + ((int) a.charAt(i) - 48);
		
		return value;
	}
}