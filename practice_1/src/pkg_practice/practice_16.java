package pkg_practice;

class Solution {
    public String solution(String s) {
        int ans = s.length();
        if (ans % 2 == 1){
            return Character.toString(s.charAt(ans/2));
        }
        else{
            return s.substring((ans/2)-1, (ans/2)+1);
        }
    }
}

class practice_16{
    public static void main(String[] args){
        Solution s = new Solution();
        String stt = s.solution("dlalRd");
        System.out.println(stt);
    }
}
