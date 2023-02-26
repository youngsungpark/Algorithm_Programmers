package Programmers.Basic;

//문자 반복 출력하기
public class Bq30 {
    public static void main(String[] args) {
        Bq30 sol1 = new Bq30();
        System.out.println(sol1.solution("hello",3));
    }
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.substring(i,i+1);
            }
        }

        return answer;
    }
}
