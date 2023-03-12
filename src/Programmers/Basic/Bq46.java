package Programmers.Basic;

//대문자와 소문자
public class Bq46 {
    public static void main(String[] args) {
        Bq46 sol1 = new Bq46();
        Bq46 sol2 = new Bq46();
        System.out.println(sol1.solution("cccCCC"));
        System.out.println(sol2.solution("abCdEfghIJ"));
    }
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}
