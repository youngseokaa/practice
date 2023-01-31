package pkg_book_practice;

public class Exception_4_med {
    public static void main(String[] args)throws Exception{
        method1();
    }

    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception{
        throw new Exception();
    }
}
