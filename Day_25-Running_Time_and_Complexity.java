import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner s = new Scanner(System.in);
        int ip = s.nextInt();
        for(int i=0; i<ip; i++){
            int no = s.nextInt();
            if(primeOrNot(no))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
    
    public static boolean primeOrNot(int n){
        if(n<=1)
            return false;
        else{
            for(int i = 2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }
        
    }
}