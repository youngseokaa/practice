package pkg_practice;

class test_prac1 {
    public static void main(String[] args) {
        SoSO aa = new SoSO();
        int ab = 1000;
        int ac = 580;
        int bb = aa.solution(ab,ac);
        System.out.println(bb);
    }
}
class SoSO {
    public int solution(int mon,int zan) {
        int nono = mon;
        int sum = 0;
        int mz = mon - zan;
        for (int i =0; i<nono-zan; i++){
            if(mz > 500){
                mz = mz - 500;
                sum++;
            }
            else if(mz >= 100 && mz< 500){
                mz = mz - 100;
                sum++;
            }
            else if(mz >= 50 && mz < 100){
                mz = mz - 50;
                sum++;
            }
            else if(mz >= 10 && mz < 50){
                mz = mz - 10;
                sum++;
            }
            else if(mz >= 5 && mz < 10){
                mz = mz - 5;
                sum++;
            }else if (mz >= 1 && mz <5){
                mz = mz - 1;
                sum++;
            }else{
                break;
            }

        }
        return sum;
    }
}
