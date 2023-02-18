package Programmers.Basic;

//두 수의 나눗셈
public class Bq5 {
    public static void main(String[] args) {
        Bq5 sol1 = new Bq5();
        Bq5 sol2 = new Bq5();
        Bq5 sol3 = new Bq5();
        System.out.println(sol1.solution(3,2));
        System.out.println(sol2.solution(7,3));
        System.out.println(sol3.solution(1,16));
    }
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = (int) ((double) num1/num2 * 1000);
        return answer;
    }
}
