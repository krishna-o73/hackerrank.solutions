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
        /*List<Integer> ranks = new ArrayList<>();
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
    }*/
            public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    /* Write your code here
        TreeSet<Integer> s = new TreeSet<Integer>(ranked);
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
        //The below code is the optimised solution
        List<Integer> result = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>(ranked);
        Integer[] array = set.toArray(new Integer[set.size()]);
        Arrays.sort(array);
        int n = array.length;
        int temp = 0;
        int max = array[n - 1];
        for (int i : player)
        {
            for (int j = temp; j < n; j++)
            {   if (i >= max)
                {
                    result.add(1);
                    break;
                }
                if (i < array[j])
                {
                    temp = j;
                    result.add(n + 1 - j);
                    break;
                }
            }
        }
        return result;
    }
}
