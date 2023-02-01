package pkg_practice;

import java.util.Arrays;

public class practice19 {
    public static void main(String[] args){
        Solution11 jun = new Solution11();
        int[] arr = {4,3,2,1};
        int[] answer= jun.solution(arr);
        System.out.println(Arrays.toString(answer));
    }
}
class Solution11 {
        public int[] solution(int[] arr) {
            int[] answer = {};
            if(arr.length==1){
                answer = new int[1];
                answer[0] = -1;
            }else{
                answer = new int[arr.length-1];
                int min = arr[0];

                for(int i=0; i<arr.length; i++){
                    min = Math.min(min, arr[i]);
                }
                int index = 0;
                for(int i=0; i<arr.length; i++){
                    if(min == arr[i]){
                        continue;
                    }
                    answer[index] = arr[i];
                    index++;
                }
            }
            return answer;
        }
    }