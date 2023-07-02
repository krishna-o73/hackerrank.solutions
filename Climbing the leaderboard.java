import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    // Write your code here
        /*TreeSet<Integer> s = new TreeSet<Integer>(ranked);
        List<Integer> b = new ArrayList<Integer>();
        for(int element:player){
            int m=sea(element,s);
            b.add(m);
        }
        return b;
    }
    static int sea(int n,TreeSet<Integer> a){
        int i=0;
        for(int b:a){
            if(n<b){
                return a.size()-i+1;
            }
            i++;
        }
        return a.size()-i+1;*/
        List<Integer> ranks = new ArrayList<>();
        TreeSet<Integer> s = new TreeSet<Integer>(ranked);
        List<Integer> b = new ArrayList<Integer>(s);
        int n = b.size();
        int m = player.size();
        int cr = 0;
        int c = n-1;
        for(int i=0;i<m;i++){
            int a=player.get(i);
            c=0;
            cr=0;
            while(c<=n-1&&a>=b.get(c)){
                cr++;
                c++;
            }
            ranks.add(n+1-cr);
        }
        return ranks;
    }
}