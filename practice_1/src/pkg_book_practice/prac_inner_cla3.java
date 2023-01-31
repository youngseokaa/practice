package pkg_book_practice;

class outer2 {
    class INstanceInner{
       int iv = 100;
    }

    static class StaticInner{
        int iv = 200;
        static int cv = 300;
    }
    void myMethod(){
        class LocalInner{
            int iv = 400;
        }
    }
}
class prac_inner_cla3{
    public static void main(String[] args){}
}