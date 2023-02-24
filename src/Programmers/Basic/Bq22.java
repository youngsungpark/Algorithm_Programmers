package Programmers.Basic;

//짝수의 합
public class Bq22 {
    public static void main(String[] args) {
        Bq22 sol1 = new Bq22();
        Bq22 sol2 = new Bq22();
        System.out.println(sol1.solution(10));
        System.out.println(sol2.solution(4));
    }
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                answer += i;
            }
        }
        return answer;
    }
}
