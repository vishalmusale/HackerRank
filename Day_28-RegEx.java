import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        LinkedList<String> fname = new LinkedList<String>();
        
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            if(checkEmail(emailID))
                fname.add(firstName);
        }
        
        Collections.sort(fname);
        for(int i=0; i<fname.size(); i++)
            System.out.println(fname.get(i));
    }
    
    public static boolean checkEmail(String email){
        String[] temp = email.split("@");
        
        if(temp[1].equals("gmail.com"))
            return true;
        else
            return false;
    }
}