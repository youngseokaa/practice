package pkg_practice_1;

import java.util.Arrays;

public class prac_5 {
    public static void main(String[] args) {
        Solution number = new Solution();
        int[] num = new int[]{1,2,3,4,5};
        int[] aa = number.solution(num);
        System.out.println(aa);
    }
}

class Solution {
    public int[] solution(int[] numbers) {
        int[] tmp =new int[numbers.length];
    for (int i = 0; i < numbers.length; i++){
         tmp[i] = numbers[i] * 2;

    }
        return tmp;
    }
}
