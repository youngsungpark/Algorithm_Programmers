package Programmers.Basic;

//피자 나눠 먹기 (3)
public class Bq16 {
    public static void main(String[] args) {
        Bq16 sol1 = new Bq16();
        Bq16 sol2 = new Bq16();
        System.out.println(sol1.solution(7,10));
        System.out.println(sol2.solution(4,12));
    }
    public int solution(int slice, int n) {
        int answer = 0;
        while (slice * answer < n)
            answer++;
        return answer;
    }
}
