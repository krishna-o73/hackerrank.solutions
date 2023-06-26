//https://www.hackerrank.com/challenges/circular-array-rotation/problem?isFullScreen=true
class Result {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
        while(k!=0){
            int b=a.get(a.size()-1);
            a.remove(a.size()-1);
            a.add(0,b);
            k--;
        }
        List<Integer> ar = new ArrayList<Integer>();
        for(int i=0;i<queries.size();i++){
            ar.add(a.get(queries.get(i)));
        }
        return ar;
    }
}
