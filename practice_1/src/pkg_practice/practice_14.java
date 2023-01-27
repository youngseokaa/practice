package pkg_practice;

class Parent4{
    void accost(){
        System.out.println("parent.accost");
    }
}
class Child4 extends Parent4{
    @Override
    void accost(){
        System.out.println("Child1.accost");
    }
}
class Child5 extends Parent4{
    @Override
    void accost(){
        System.out.println("Child2.accost");
    }
}
class Child6 extends Parent4{
    @Override
    void accost(){
        System.out.println("Child2.accost");
    }
}
class practice_14 {
    public static void main(String[] args){
        Parent4[] parents = new Parent4[3];
        parents[0] = new Child4();
        parents[1] = new Child5();
        parents[2] = new Child6();

        for (Parent4 child : parents){
            child.accost();
        }
    }
}
