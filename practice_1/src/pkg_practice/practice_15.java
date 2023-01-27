package pkg_practice;

abstract class player{
    boolean pause;
    int currentPos;


    player(){
        pause =false;
        currentPos = 0;
    }

    abstract void play(int pos);
    abstract void stop();

    void play(){
        System.out.println();
        System.out.println("play() 일반 인스터스 메서드");
        play(currentPos);
    }
}
class AudioPlayer extends player{
    @Override
    void play (int pos){
        System.out.println();
        super.currentPos = pos;
        super.pause = false;
        System.out.println("추상클래스 player 의 play(int pos) 구현");
        System.out.println("현재 위치 = " + super.currentPos);
        System.out.println("다시 시작합니다.");
    }

    @Override
    void stop(){
        System.out.println("재생을 멈춥니다.");
        this.pause = true;
    }
}

class practice_15{
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(100);
        audioPlayer.stop();
        audioPlayer.play();
    }
}