import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //  INPUT
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.nextLine();
        int[] h = new int[n];
        int i=0;
        for (i = 0; i<h.length ; i++){
         h[i] = in.nextInt();
        }
        
        //  Finding Largest rectangle
       System.out.println(largestRectangle(h));        
    }
    
    static int largestRectangle(int[] h){
        int maxHeight = 0;
        
        for(int i = 0; i<h.length ; i++){
            int j=i, curHeight = h[i], tempTotal = 0, leftHeight = 0, rightHeight = 0;
            while(j+1 < h.length){
                if(h[j+1] >= curHeight){
                    rightHeight += curHeight;
                    j++;
                }
                else
                    break;
            }
            j=i;
            while(j-1 >= 0){
                if(h[j-1] >= curHeight){
                    leftHeight += curHeight;
                    j--;
                }
                else
                    break;
            }
            
            tempTotal = leftHeight + curHeight + rightHeight;
            maxHeight = Math.max(maxHeight, tempTotal);
        }
        return maxHeight;
    }
}