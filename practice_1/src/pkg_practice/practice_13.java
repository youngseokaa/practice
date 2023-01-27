package pkg_practice;

class Animal1 {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void onomatopoeia() {
        System.out.println("동물이 소리냅니다.");
    }
}

class Dog1 extends Animal1{
    @Override
    public void move(){
        System.out.println("강아지가 달립니다.");
    }
    @Override
    public void onomatopoeia(){
        System.out.println("멍멍!");
    }
}

class Bird2 extends Animal1{
    @Override
    public void move(){
        System.out.println("새가 날아다닙니다.");
    }
    @Override
    public void onomatopoeia(){
        System.out.println("멍멍!");
    }
}

class Action1{
    static void doMove(Animal1 animal){
        animal.move();
    }
    static void doCry(Animal1 animal){
        animal.onomatopoeia();
    }
}
public class practice_13 {
    public static void main(String[] args){
        Animal1[] animals = new Animal1[3];

        animals[0] =new Animal1();
        animals[1] = new Dog1();
        animals[2] = new Bird2();

        for (Animal1 animal : animals){
            animal.move();
            animal.onomatopoeia();
            System.out.println();
        }
    }
}

