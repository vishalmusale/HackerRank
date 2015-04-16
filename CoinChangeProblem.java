import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CoinChange {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner s = new Scanner(System.in);
    
    int N=s.nextInt();
    int M=s.nextInt();
    
    if((0<N && N<251) || (0<M && M<51))
    {
    	int[] c=new int[M];
        for(int i=0; i<M; i++)
        {
        	c[i]=s.nextInt();
        }
    
    System.out.println(coinChangeProblem(c,N,M));
    }
    
    else
    	System.out.println("0");
    }

	private static int coinChangeProblem(int[] c, int n, int m) {
		// TODO Auto-generated method stub
		
		if(n==0)
			return 1;
		if(n<0)
			return 0;
		if(m<=0 && n>=1)
			return 0;
		
		return(coinChangeProblem(c,n,m-1) + coinChangeProblem(c,n-c[m-1],m));
	}
}