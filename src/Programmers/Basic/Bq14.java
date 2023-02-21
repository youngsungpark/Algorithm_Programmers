package Programmers.Basic;

//피자 나눠 먹기 (1)
public class Bq14 {
    public static void main(String[] args) {
        Bq14 sol1 = new Bq14();
        Bq14 sol2 = new Bq14();
        Bq14 sol3 = new Bq14();
        System.out.println(sol1.solution(7));
        System.out.println(sol2.solution(1));
        System.out.println(sol3.solution(15));
    }
    public int solution(int n) {
        int answer = 0;
        if (n % 7 == 0) {
            answer = n/7;
        }
        else {
            answer = n/7 + 1;
        }
        return answer;
    }
}
