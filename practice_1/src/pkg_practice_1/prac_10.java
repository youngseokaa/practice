package pkg_practice_1;

import java.util.Objects;

public class prac_10 {
    public static void main(String[] args) {
        Solution5 a = new Solution5();
        String[] s1 = {"a","b","c"};
        String[] s2 = {"com","b","d","p","c"};
         int bb = a.solution(s1,s2);
        System.out.println(bb);
    }
}
class Solution5 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i < s1.length; i++){
            for(int j = 0; j < s2.length; j++){
                if(Objects.equals(s1[i], s2[j])){
                    answer++;
                }else{
                    continue;
                }
            }
        }
        return answer;
    }
}