package Programmers.Basic;

//세균 증식
public class Bq47 {
    public static void main(String[] args) {
        Bq47 sol1 = new Bq47();
        Bq47 sol2 = new Bq47();
        System.out.println(sol1.solution(2,10));
        System.out.println(sol2.solution(7,15));
    }
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i++) {
            answer *= 2;
        }
        return answer;
    }
}
