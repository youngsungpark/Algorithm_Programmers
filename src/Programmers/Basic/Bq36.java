package Programmers.Basic;

//편지
public class Bq36 {
    public static void main(String[] args) {
        Bq36 sol1 = new Bq36();
        Bq36 sol2 = new Bq36();
        System.out.println(sol1.solution("happy birthday!"));
        System.out.println(sol2.solution("I love you~"));
    }
    public int solution(String message) {
        int answer = 0;
        answer = message.length() * 2;
        return answer;
    }
}
