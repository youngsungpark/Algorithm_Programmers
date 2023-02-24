package Programmers.Basic;

//나이 출력
public class Bq20 {
    public static void main(String[] args) {
        Bq20 sol1 = new Bq20();
        Bq20 sol2 = new Bq20();
        System.out.println(sol1.solution(40));
        System.out.println(sol2.solution(23));
    }
    public int solution(int age) {
        int answer = 0;
        answer = 2022-age+1;
        return answer;
    }
}
