package pkg_practice;

import java.util.Arrays;

public class test_prac2 {
    public static void main(String[] args) {
    SOl aa = new SOl();
    String ab = "OXXOOXXXOOOO";
     int ccc= aa.ox(ab);
        System.out.println(ccc);
    }
}
class SOl {
    public int ox(String aaa) {
        String[] wor = aaa.split("X");
        int sum = 0;
        for (int i = 0; i < wor.length; i++) {
            for (int j = 0; j < wor[i].length(); j++) {
                sum += (j + 1);
            }
        }
        return sum;
    }
}
