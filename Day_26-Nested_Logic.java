import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int fine = 0;
        
        Scanner scanner = new Scanner(System.in);
        int actualDay = scanner.nextInt();
        int actualMonth = scanner.nextInt();
        int actualYear = scanner.nextInt();
        
        int expectedDay = scanner.nextInt();
        int expectedMonth = scanner.nextInt();
        int expectedYear = scanner.nextInt();
        
        scanner.close();
        
        if (actualYear == expectedYear){
            if (actualMonth < expectedMonth || (actualMonth == expectedMonth && actualDay <= expectedDay)) {
                fine = 0;
            } else if (actualMonth == expectedMonth) {
                fine = (actualDay - expectedDay) * 15;
            } else if (actualMonth > expectedMonth) {
                fine = (actualMonth - expectedMonth) * 500;
            }
        } else if (actualYear > expectedYear){
            fine = 10000;
        }
        
        System.out.println(fine);
    }
}