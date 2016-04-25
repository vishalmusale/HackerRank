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
        
        System.out.println(fact(no));
    }
    
    static int fact(int no){
        if(no == 0 || no == 1)
            return 1;
        else{
            int factorial = no * fact(no-1);
            return factorial;
        }
    }
}