package Programmers.Basic;

//나머지 구하기
public class Bq10 {
    public static void main(String[] args) {
        Bq10 sol1 = new Bq10();
        Bq10 sol2 = new Bq10();
        System.out.println(sol1.solution(3,2));
        System.out.println(sol2.solution(10,5));
    }
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }
}
