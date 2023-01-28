package pkg_practice_1;

public class prac_6 {
    public static void main(String args[]) {
        Solution1 sal = new Solution1();
        int aa = 300000;
        int bb = sal.solution(aa);
        System.out.println(bb);
    }
}
class Solution1 {
    public int solution(int price) {
            int sale = 0;
        System.out.println(price);
        if(price >= 100000 && price < 300000){
            sale= ((price * 95)/(100));
        }else if(price >= 300000 && price < 500000){
            sale = ((price *9)/(10));
        }else if (price >= 500000){
            sale = ((price *8)/(10));
        }
        else{
            sale = price;
        }
        return sale;
    }
}