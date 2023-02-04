package Programmers;

//짝수와 홀수
public class Q2 {
    public static void main(String[] args) {
        Q2 num1 = new Q2();
        Q2 num2 = new Q2();
        System.out.println(num1.solution(3));
        System.out.println(num2.solution(4));
    }

    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        }
        else {
            answer = "Odd";
        }

        return answer;
    }
}
