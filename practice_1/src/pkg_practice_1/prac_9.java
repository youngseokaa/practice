package pkg_practice_1;

public class prac_9 {
    public static void main(String args[]) {
        Solution4 a = new Solution4();
        long bb = a.solution(1,20,4);
        System.out.println(bb);
    }
}
class Solution4 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        int sum = 0;
        for(int i = 1; i<count+1; i++){
            sum += price * i;
        }
        if(sum > money){
            answer = (long)(sum - money);
        }else{
            answer = 0;
        }
        return answer;
    }
}