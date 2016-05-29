import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner s = new Scanner(System.in);
    	int V = s.nextInt(), n= s.nextInt();
    	int[] ar = new int[n];
    	
    	for(int i=0; i<n; i++)
    	{
    		ar[i]=s.nextInt();
    	}
    	
    	for(int i=0; i<n; i++)
    	{
    		if(ar[i] == V)
    			System.out.println(i);
    	}
    }
}