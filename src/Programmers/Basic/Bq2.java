package Programmers.Basic;

//몫 구하기
public class Bq2 {
    public static void main(String[] args) {
        Bq2 sol1 = new Bq2();
        Bq2 sol2 = new Bq2();
        System.out.println(sol1.solution(10,5));
        System.out.println(sol2.solution(7,2));
    }
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1/num2;
        return answer;
    }
}
