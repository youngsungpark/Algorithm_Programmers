package Programmers.Basic;

//두 수의 차
public class Bq7 {
    public static void main(String[] args) {
        Bq7 sol1 = new Bq7();
        Bq7 sol2 = new Bq7();
        System.out.println(sol1.solution(2,3));
        System.out.println(sol2.solution(100,2));
    }
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }
}
