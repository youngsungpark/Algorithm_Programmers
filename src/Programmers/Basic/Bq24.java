package Programmers.Basic;

//점의 위치 구하기
public class Bq24 {
    public static void main(String[] args) {
        Bq24 sol1 = new Bq24();
        Bq24 sol2 = new Bq24();
        System.out.println(sol1.solution(new int[]{2,4}));
        System.out.println(sol2.solution(new int[]{-7,9}));
    }
    public int solution(int[] dot) {
        int answer = 0;

        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }

        return answer;
    }
}
