import java.util.Arrays;
import java.util.Comparator;

public class prac_14 {
    public static void main(String[] args){
        Solution14 bbb = new Solution14();
        long ccc = 2312412431L;
        long ddd = bbb.solution(ccc);
        System.out.println(ddd);
    }
}
class Solution14 {
    public long solution(long n) {
         String val= String.valueOf(n);
         String[] arrval = val.split("");
         String sum = "";
        Arrays.sort(arrval, Comparator.reverseOrder());
        for(int i = 0; i< arrval.length; i++){
            sum += arrval[i];
        }
        long sums = Long.parseLong(sum);


         return sums;
    }
}