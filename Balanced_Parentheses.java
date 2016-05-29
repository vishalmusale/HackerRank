import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        String[] ipStrings = new String[n];
        String[] ans;
        for(int i=0; i<n; i++){
            ipStrings[i] = in.next();
        }

        ans = braces(ipStrings);

        printFunction(ans);
    }

    private static void printFunction(String[] ans) {
        for(int i =0 ; i<ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    private static String[] braces(String[] ipStrings) {
        String[] ans = new String[ipStrings.length];

        for(int i =0 ; i<ipStrings.length; i++){
            ans[i]=checkBraces(ipStrings[i]);
        }
        return ans;
    }

    private static String checkBraces(String ip) {
        if(ip.length() ==0)
            return "YESSS";

        Stack<Character> stk = new Stack<>();

        for(int i =0 ; i<ip.length(); i++){
            char c=ip.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stk.push(c);
            }

            if(c==')' || c=='}' || c==']'){

                if(stk.isEmpty())
                    return "NO";

                char tp = stk.peek();
                if(c==')' && tp == '(' || c=='}' && tp == '{' || c==']' && tp == '[')
                    stk.pop();
                else
                    return "NO";
            }
        }
        if(stk.isEmpty())
            return "YES";
        else
            return "NO";
    }
}