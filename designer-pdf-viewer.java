//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?isFullScreen=true
class Result {
  public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
        int a[] = new int[word.length()];
        for(int i=0;i<word.length();i++){
            a[i]=h.get(word.charAt(i)-97);
        }
        Arrays.sort(a);
        return word.length()*a[a.length-1];
    }

}
