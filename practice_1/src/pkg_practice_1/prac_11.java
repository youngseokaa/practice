package pkg_practice_1;


class Solution7 {
    public String solution(String[] seoul) {
        StringBuilder stringBuilder = new StringBuilder();
        String kim = "Kim";
        int re = 0;
        String a = "김서방은 ";
        String b = "에 있다";
        String answer = "";
        for(int i = 0; i< seoul.length; i++){
            if(kim.equals(seoul[i])){
                re = i;
            }else{

            }
        }

        String str = String.valueOf(re);
        stringBuilder.append(a).append(str).append(b);
        answer = stringBuilder.toString();

        return answer;
    }
}
public class prac_11 {
    public static void main(String[] args){
        Solution7 aa = new Solution7();
        String[] ab = new String[]{"df","Jane","Kim"};
        String ac = aa.solution(ab);
        System.out.println(ac);
    }
}