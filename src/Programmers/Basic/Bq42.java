package Programmers.Basic;

//제곱수 판별하기
public class Bq42 {
    public static void main(String[] args) {
        Bq42 sol1 = new Bq42();
        Bq42 sol2 = new Bq42();
        System.out.println(sol1.solution(144));
        System.out.println(sol2.solution(976));
    }

    public int solution(int n) {
        int answer = 2;

        for (int i = 1; i < n; i++) {
            if (n % i == 0 && n == i * i) {
                answer = 1;
            }
        }

        return answer;
    }
}