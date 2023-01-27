package pkg_practice;

class Parent{
    void accost(){
        System.out.println("Parent.accost");
    }
}
class Child1 extends Parent {
    @Override
    void accost(){
        System.out.println("Child1.accost");
    }
}

class Child2 extends Parent{
    @Override
    void accost(){
        System.out.println("Child2.accost");
    }
}
class Child3 extends Parent{
    @Override
    void accost(){
        System.out.println("Child3.accost");
    }
}

class Poly{
    void checkChild(Parent child){
        child.accost();
    }
}


public class practice_12 {
    public static void main(String[] args){
        Poly poly = new Poly();

        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();

        poly.checkChild(child1);
        poly.checkChild(child2);
        poly.checkChild(child3);
    }
}

