package Programmers.Basic;

//자릿수 더하기
public class Bq37 {
    public static void main(String[] args) {
        Bq37 sol1 = new Bq37();
        Bq37 sol2 = new Bq37();
        System.out.println(sol1.solution(1234));
        System.out.println(sol2.solution(930211));
    }
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
