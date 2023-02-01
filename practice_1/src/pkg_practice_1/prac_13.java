package pkg_practice_1;

public class prac_13 {
    public static void main(String[] args){

    }
}
class Solution11 {
    public int[] solution(long n) {
        String nn = String.valueOf(n);
        int[] nnn =new int[nn.length()];
        for(int i = 0; i < nn.length();i++){
            nnn[i] = nn.length() - (i+1);
        }
        return nnn;
    }
}