package Programmers.Basic;

//각도기
public class Bq21 {
    public static void main(String[] args) {
        Bq21 sol1 = new Bq21();
        Bq21 sol2 = new Bq21();
        Bq21 sol3 = new Bq21();
        System.out.println(sol1.solution(70));
        System.out.println(sol2.solution(91));
        System.out.println(sol3.solution(180));
    }
    public int solution(int angle) {
        int answer = 0;
        if (0 < angle && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }
}
