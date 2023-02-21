package Programmers.Basic;

//피자 나눠 먹기 (2)
public class Bq15 {
    public static void main(String[] args) {
        Bq15 sol1 = new Bq15();
        Bq15 sol2 = new Bq15();
        Bq15 sol3 = new Bq15();
        System.out.println(sol1.solution(6));
        System.out.println(sol2.solution(10));
        System.out.println(sol3.solution(4));
    }
    public int solution(int n) {
        int answer = 0;
        answer = n * 6 / gcd(n,6);
        answer = answer/6;
        return answer;
    }

    public static int gcd(int a, int b) {
        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) return  a;

        return gcd(b, (a % b));
    }
}
