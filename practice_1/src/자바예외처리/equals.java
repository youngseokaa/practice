package 자바예외처리;

public class equals {
    public static void main(String[] args){
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    }
}
class Value{
    int value;

    Value(int value){
        this.value =value;
    }
}
//기본적으로 equals메서드는 서로의 주소값을 비교한다.