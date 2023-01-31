package pkg_practice_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class test_prac {
    public String abc(int month, int day) {
        LocalDate start = LocalDate.of(2022, month, day);
        // 시작 날짜 구하기
        LocalDate end = start.plusDays(98);
        //시작할때 날짜 하루가 포함 되어있어 99가아닌 98로 설정
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M월 dd일");
        // 리턴타입 지정
        String date = dateTimeFormatter.format(end);
        return date;
    }

    public static void main(String[] args) {
        test_prac method = new test_prac();
        System.out.println(method.abc(1, 18));
    }
}