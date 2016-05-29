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
    	no++;
    	String[] str = new String[no];
    	
    	// Initialization
    	for(int i = 0; i< no; i++)
    	{
    		str[i] = s.nextLine();
    	}
    	
    	
    	// Answer and output
    	for(int i = 1; i< no; i++)
    	{
    		System.out.println(AlternatingCharacters(str[i]));
    	}
    	
    }

	private static int AlternatingCharacters(String string) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		for(int i = 1; i< string.length(); i++)
    	{
			if(string.charAt(i) == string.charAt(i-1))
				count++;
    	}
		return count;
	}
    
}