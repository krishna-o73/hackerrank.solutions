//https://www.hackerrank.com/challenges/drawing-book/problem
class Result {
    public static int pageCount(int n, int p) {
    // Write your code here
        if(n-p==1&&n%2==1){
            return 0;
        }
        int mid=(1+n)/2;
        if((p-1)<(n-p)){
            return p/2;
        }
        else{
            if(n-p==1){
                return 1;
            }
            return (n-p)/2;
        }
        
    }

}
