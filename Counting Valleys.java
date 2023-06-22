//https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true
class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
    int altitude = 0;
        int valleys = 0;
        boolean inValley = false;

        for (char step : path.toCharArray()) {
            if (step == 'U') {
                altitude++;
            } else {
                altitude--;
            }
            if (altitude < 0) {
                inValley = true;
            } else if (altitude == 0 && inValley) {
                valleys++;
                inValley = false;
            }
        }

        return valleys;
    }
}
