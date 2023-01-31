package pkg_book_practice;

class prac_inner_cla2 {
    private int outerIv =0;
    static int outerCv = 0;

    class InstanceInner{
        int iiv = outerIv;
        int iiv2 =outerCv;
    }

    static class StaticInner{
        static int scv =outerCv;
    }

    void myMethod(){
        int Iv = 0;
        final int LV = 0;

        class LocalInner{
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = Iv;
            int liv4 = LV;
        }
    }
}
