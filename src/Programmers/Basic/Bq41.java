package Programmers.Basic;

//개미 군단
public class Bq41 {
    public static void main(String[] args) {
        Bq41 sol1 = new Bq41();
        Bq41 sol2 = new Bq41();
        Bq41 sol3 = new Bq41();
        System.out.println(sol1.solution(23));
        System.out.println(sol2.solution(24));
        System.out.println(sol3.solution(999));
    }
    public int solution(int hp) {
        int answer = 0;

        answer = hp/5 + hp%5/3 + hp%5%3;

        return answer;
    }
}
