package Programmers.Basic;

//숫자 비교하기
public class Bq1 {
    public static void main(String[] args) {
        Bq1 sol1 = new Bq1();
        Bq1 sol2 = new Bq1();
        Bq1 sol3 = new Bq1();
        System.out.println(sol1.solution(2,3));
        System.out.println(sol2.solution(11,11));
        System.out.println(sol3.solution(7,99));
    }
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2) {
            answer = 1;
        }
        else answer = -1;
        return answer;
    }
}
