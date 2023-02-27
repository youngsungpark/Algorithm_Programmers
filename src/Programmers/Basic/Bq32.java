package Programmers.Basic;

//특정 문자 제거하기
public class Bq32 {
    public static void main(String[] args) {
        Bq32 sol1 = new Bq32();
        Bq32 sol2 = new Bq32();
        System.out.println(sol1.solution("abcdef","f"));
        System.out.println(sol2.solution("BCBdbe","B"));
    }
    public String solution(String my_string, String letter) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (!my_string.substring(i,i+1).equals(letter)) {
                answer += my_string.substring(i,i+1);
            }
        }

        return answer;
    }
}
