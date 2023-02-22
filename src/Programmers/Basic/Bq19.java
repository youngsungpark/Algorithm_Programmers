package Programmers.Basic;

//아이스 아메리카노
public class Bq19 {
    public static void main(String[] args) {
        Bq19 sol1 = new Bq19();
        Bq19 sol2 = new Bq19();
        System.out.println(sol1.solution(5500));
        System.out.println(sol2.solution(15000));
    }
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}
