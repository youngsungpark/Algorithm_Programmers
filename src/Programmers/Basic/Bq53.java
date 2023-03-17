package Programmers.Basic;

//인덱스 바꾸기
public class Bq53 {
    public static void main(String[] args) {
        Bq53 sol1 = new Bq53();
        Bq53 sol2 = new Bq53();
        System.out.println(sol1.solution(new String("hello"),1,2));
        System.out.println(sol2.solution(new String("I love you"),3,6));
    }
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] s = my_string.split("");

        for (int i = 0; i < s.length; i++) {
            if (i == num1) {
                answer += s[num2];
            } else if (i == num2) {
                answer += s[num1];
            }
            else {
                answer += s[i];
            }
        }
        return answer;
    }
}
