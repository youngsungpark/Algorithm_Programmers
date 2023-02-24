package Programmers.Basic;

//양꼬치
public class Bq23 {
    public static void main(String[] args) {
        Bq23 sol1 = new Bq23();
        Bq23 sol2 = new Bq23();
        System.out.println(sol1.solution(10,3));
        System.out.println(sol2.solution(64,6));
    }
    public int solution(int n, int k) {
        int answer = 0;
        int beverage = k - n/10;

        if (beverage <= 0) {
            answer = n * 12000;
        } else if (beverage > 0) {
            answer = n * 12000 + beverage * 2000;
        }

        return answer;
    }
}
