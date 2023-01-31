package pkg_book_practice;

class prac_inner {
    static class StaticInner{}
    class InstanceInner{}
    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        StaticInner obj2 = new StaticInner();


        prac_inner outer = new prac_inner();
        InstanceInner obj1 = outer.new InstanceInner();
    }
    void instnaceMethod(){
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }

    void myMethod(){
        class LocalInner{}
        LocalInner Iv = new LocalInner();
    }
}

