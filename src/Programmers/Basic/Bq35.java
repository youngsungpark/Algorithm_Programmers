package Programmers.Basic;

//순서쌍의 개수(O(n))
public class Bq35 {
    public static void main(String[] args) {
        Bq35 sol1 = new Bq35();
        Bq35 sol2= new Bq35();
        System.out.println(sol1.solution(20));
        System.out.println(sol2.solution(100));
    }
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }

        return answer;
    }
}
