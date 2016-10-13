import java.util.Scanner;

/**
 * Created by vishal on 3/2/2016.
 * A zero-indexed array A consisting of N integers is given. A slice of that array is a pair of integers (P, Q) such that
 O ,; P,; Q < N. A slice {P, Q) of array A is called non-negative if all the elements A[P], A[P+ 1], ... , A[Q-1], A[Q] 
 are non-negative. The sum of a slice (P, Q) of array A is the value A[P] + A(P+ 1] + ... + A[Q-1] + A[Q].
 
 For example, the following array A:
 A[6] = {1,2,-3,4,5,-6}
 has non-negative slices (0, O), (1, 1), (0, 1), (3, 3), (4, 4) and (3, 4).
 The sum of slice (O, 1) is A[O] + A[l] = 1 + 2 = 3.
 The sum of slice (3, 4) is A[3] + A[4] = 4 + 5 = 9.
 The sum of slice (4, 4) is A[4] = 5.
 
 Write a function:
 class Solution { public int solution(int[J A); }
 that, given a zero-indexed array A consisting of N integers, returns the maximum sum of any non-negative slice in this array.
 The function should return -1 if there are no non-negative slices in the array.

 */
public class test {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] A = new int[size];

        for(int i=0; i<A.length; i++){
            A[i] = in.nextInt();
        }

        int sum=-1, temp=-1;
        boolean flag = false;
        for(int i=0; i<A.length;i++){
            if(A[i] > -1){
                if(flag == false){
                    temp = A[i];
                    flag = true;
                }
                else
                    temp+=A[i];
            }
            else if(A[i] < 0 || i==A.length-1){
                sum = Math.max(sum, temp);
                temp=-1;
                flag=false;
            }
        }
        sum = Math.max(sum, temp);
        System.out.println(sum);
    }
}
