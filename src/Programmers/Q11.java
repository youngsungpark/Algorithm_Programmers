package Programmers;

//x만큼 간격이 있는 n개의 숫자
public class Q11 {
    public static void main(String[] args) {
        Q11 sol1 = new Q11();
        Q11 sol2 = new Q11();
        Q11 sol3 = new Q11();
        System.out.println(sol1.solution(2,5));
        System.out.println(sol2.solution(4,3));
        System.out.println(sol3.solution(-4,2));
    }
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] =(i+1)*x;
        }
        return answer;
    }
}
