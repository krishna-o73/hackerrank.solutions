//https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
public class Solution {

    static int jumpingOnClouds(int[] c, int k) {
        int i=k;
        int res=100;
        if(c[0]==1){
            res=res-2-1;
        }
        else{
            res=res-1;
        }
        if(c.length==k){
            return res;
        }
        while(i!=0){
            if(c[i]==1){
                res=res-2-1;
            }
            else{
                res=res-1;
            }
            i=i+k;
            i=i%c.length;
        }
        return res;
    }
}
