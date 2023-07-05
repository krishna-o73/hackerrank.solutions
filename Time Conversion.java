//https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
class Result {
public static String timeConversion(String s) {
    // Write y1our code here
    if(s.charAt(8)=='P'){
        if(s.charAt(1)=='2'&&s.charAt(0)=='1')
            return s.substring(0,8);
        else{
            int n=Integer.parseInt(s.substring(0,2));
            int m=n+12;
            String s1=m+""+s.substring(2,8);
            return s1;
        }
    }
    if(s.charAt(1)=='2'){
        return "00"+s.substring(2,8);
    }
    return s.substring(0,8);
    }

}
