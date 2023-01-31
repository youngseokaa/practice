package pkg_practice_1;

public class prac_8 {
    public static void main(String args[]) {
        Solution3 a = new Solution3();
        int x = 2;
        int n = 5;
        long[] ab = a.solution(x,n);
        System.out.println(ab);
    }
}
class Solution3 {

    public long[] solution(int x, int n) {
        long[] y = new long[n];
        for(int i = 1; i < n+1; i++){
            y[i-1] = (long) x * i;
        }
        System.out.println(y);
        return y;
    }
}