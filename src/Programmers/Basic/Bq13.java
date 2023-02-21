package Programmers.Basic;

//짝수는 싫어요
public class Bq13 {
    public static void main(String[] args) {
        Bq13 sol1 = new Bq13();
        Bq13 sol2 = new Bq13();
        System.out.println(sol1.solution(10));
        System.out.println(sol2.solution(15));
    }
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer[i/2] = i;
            }
        }
        return answer;
    }
}
