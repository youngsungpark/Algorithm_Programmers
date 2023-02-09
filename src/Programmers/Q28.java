package Programmers;

//하샤드 수
public class Q28 {
    public static void main(String[] args) {
        Q28 sol1 = new Q28();
        Q28 sol2 = new Q28();
        Q28 sol3 = new Q28();
        Q28 sol4 = new Q28();
        System.out.println(sol1.solution(10));
        System.out.println(sol1.solution(12));
        System.out.println(sol1.solution(11));
        System.out.println(sol1.solution(13));
    }
    public boolean solution(int x) {

        int num = x;
        int sum = 0;

        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (x % sum == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
