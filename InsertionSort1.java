import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner s = new Scanner(System.in);
    	int n= s.nextInt();
    	int[] ar = new int[n];
    	
    	for(int i=0; i<n; i++)
    	{
    		ar[i]=s.nextInt();
    	}
    	
    	insertion(ar);
    }

	private static void insertion(int[] ar) {
		// TODO Auto-generated method stub
		for(int i=ar.length-1; i> 0; i--)
		{
			int temp = ar[i];
			int j;
			for(j=i-1; j>=0 && temp<ar[j]; j--)
			{
				ar[j+1] = ar[j];
				printArray(ar);
			}
				
			ar[j+1] = temp;
		}
		printArray(ar);
	}

	private static void printArray(int[] ar) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<ar.length ; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
}