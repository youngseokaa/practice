package pkg_practice_1;

public class prac_7 {
    public static void main(String args[]) {
        Solution2 nn =  new Solution2();
        int num = 100;
         int bbb = nn.solution(num);
        System.out.println(bbb);
    }
}
class Solution2 {
    public int solution(int n) {
        System.out.println(n);
        int[] a = {};
        int[] b = {};
        int abs = n;
        int num = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j <100; j++){
                a[i] = i+1;
                b[j] = j+1;
                if(a[i] * b[j] == n){
                    num++;
                }else{
                    continue;
                }
            }
        }
        return num;
    }
}