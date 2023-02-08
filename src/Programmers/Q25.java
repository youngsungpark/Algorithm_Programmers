package Programmers;

//정수 제곱근 판별
public class Q25 {
    public static void main(String[] args) {
        Q25 sol1 = new Q25();
        Q25 sol2 = new Q25();
        System.out.println(sol1.solution(121));
        System.out.println(sol2.solution(3));
    }
    public long solution(long n) {
        long answer = 0;

        long sqrt = (long)Math.sqrt(n);

        if (sqrt * sqrt == n) {
            answer = (sqrt+1) * (sqrt+1);
        }
        else {
            answer = -1;
        }
        return answer;
    }
}
