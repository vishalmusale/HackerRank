import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String bin = convertBin(n);
        
        consecutiveOnes(bin);
    }
    
    static String convertBin(int n){
        if (n == 0) {
           return "0";
        }
        String binary = "";
        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }
        return binary;
    }
    
    static void consecutiveOnes(String bin){
        int max1 = 0, tempMax = 0;
        for(int i=0; i<bin.length(); i++){
            if (bin.charAt(i) == '1') {
                tempMax++;
                max1 = Math.max(max1, tempMax);
            }
            else
                tempMax = 0;            
        }
        System.out.println(max1);
    }
}