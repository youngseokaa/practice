package pkg_practice_1;

public class prac_12 {
    public static void main(String[] args){
        Solution8 aaa = new Solution8();
        int bbb = 22;
         int cccc= aaa.solution(bbb);
        System.out.println(cccc);
    }
}
class Solution8 {
    public int solution(int hp) {
        int sum = 0;
        int hp1 = hp;
        for(int i =0; i<hp1; i++){
            if(hp >= 5){
                hp = hp - 5;
                ++sum;
            }else if(hp >=3 && hp < 5){
                hp = hp - 3;
                ++sum;
            }else if(hp >=1 && hp < 3){
                hp = hp - 1;
                ++sum;
            }else{
                break;
            }
        }

        return sum;
    }
}