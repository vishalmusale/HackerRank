import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        String[] ipString = new String[T];
        for(int i=0; i<T; i++){
            ipString[i]= s.next();
        }
        
        for(int i=0; i<T; i++){
            printString(ipString[i]);
        }
        s.close();
    }
    
    static void printString(String str){
        String even = "", odd = "";
        for(int i=0; i<str.length(); i = i+2){
            even+= str.charAt(i);
        }
        
        for(int i=1; i<str.length(); i = i+2){
            odd+= str.charAt(i);
        }
        
        System.out.println(even + " " + odd);
    }
}