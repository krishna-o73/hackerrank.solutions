//question about multiples of 3 and 5
//https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a = 0; a < t; a++){
            long n = in.nextLong();
            fact(n);
        }
    }
    public static void fact(long n){
        n=n-1;
        long m=n/3;
        long k=n/5;
        long s=n/15;
        long z=3*(m*(m+1)/2)+5*(k*(k+1)/2)-15*(s*(s+1)/2);
        System.out.println(z);
    }
}
