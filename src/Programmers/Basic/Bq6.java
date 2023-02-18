package Programmers.Basic;

//두 수의 합
public class Bq6 {
    public static void main(String[] args) {
        Bq6 sol1 = new Bq6();
        Bq6 sol2 = new Bq6();
        System.out.println(sol1.solution(2,3));
        System.out.println(sol2.solution(100,2));
    }
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }
}
