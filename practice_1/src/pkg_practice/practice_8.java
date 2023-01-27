package pkg_practice;

class Whale extends Mammalia{

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

class Mammalia{

    public void feeding(){
        System.out.println("모유 수유를 합니다.");
    }
    public void giveBirth(){
        System.out.println("새끼를 낳습니다.");
    }
}

class PolyTest1{
    public static void main(String[] args){

        Mammalia mammalia = new Whale();

        mammalia.giveBirth();
        mammalia.feeding();

    }
}


