package pkg_practice;

class Whale1 extends Mammalia1{

    public void swimming(){
        System.out.println("수영 하다.");
    }

    @Override
    public void feeding(){
        System.out.println("고래는 모두 수유를 합니다.");
    }

    @Override
    public void giveBirth(){
        System.out.println("고래는 새끼를 낳습니다.");
    }

}

class Mammalia1{

    public void feeding(){
        System.out.println("모유 수유를 합니다.");
    }
    public void giveBirth(){
        System.out.println("새끼를 낳습니다.");
    }
}

class Bird{
    public void fly(){
        System.out.println("Bird.fly");
    }
}

class practice_9{
    public static void main(String[] args){
        Whale1 whale = new Whale1();
        Mammalia1 mammalia = whale; //Mammalia 생략 가능
        mammalia.giveBirth();
        mammalia.feeding();

        Whale1 whale2 = (Whale1)mammalia;
        whale2.swimming();

        Bird bird = new Bird();


    }
}