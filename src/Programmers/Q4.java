package Programmers;

//두 정수 사이의 합
public class Q4 {
    public static void main(String[] args) {
        Q4 a1 = new Q4();
        Q4 a2 = new Q4();
        Q4 a3 = new Q4();
        System.out.println(a1.solution(3,5));
        System.out.println(a2.solution(3, 3));
        System.out.println(a3.solution(5,3));
    }
    public long solution(int a, int b) {
        long answer = 0;

        if (a == b) {
            answer = a;
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                answer = answer + i;
            }
        } else {
            for (int i = a; i <= b; i++) {
                answer = answer + i;
            }
        }
        return answer;
    }
}
