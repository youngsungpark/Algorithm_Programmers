package Programmers.Basic;

//두 수의 곱
public class Bq4 {
    public static void main(String[] args) {
        Bq4 sol1 = new Bq4();
        Bq4 sol2 = new Bq4();
        System.out.println(sol1.solution(3,4));
        System.out.println(sol2.solution(27,19));
    }
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 * num2;
        return answer;
    }
}
