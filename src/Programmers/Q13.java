package Programmers;

//2016년
public class Q13 {
    public static void main(String[] args) {
        Q13 sol1 = new Q13();
        System.out.println(sol1.solution(5,24));
    }
    public String solution(int a, int b) {
        String[] result = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        String answer = "";

        for (int i = 0; i < a; i++) {
            if (i+1 >= a) {
                sum = sum + b;
            }
            else {
                sum = sum + day[i];
            }
        }
        sum = sum -1;
        answer = result[sum % 7];
        return answer;
    }
}
