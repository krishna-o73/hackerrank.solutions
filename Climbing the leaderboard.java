//https://www.hackerrank.com/challenges/climbing-the-leaderboard/copy-from/333953648?isFullScreen=true
class Result {
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
