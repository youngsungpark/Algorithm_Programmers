package Programmers.Basic;

//문자열 뒤집기
public class Bq27 {
    public static void main(String[] args) {
        Bq27 sol1 = new Bq27();
        Bq27 sol2 = new Bq27();
        System.out.println(sol1.solution("jaron"));
        System.out.println(sol2.solution("bread"));
    }
    public String solution(String my_string) {
        String answer = "";

        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.substring(i, i+1);
        }

        return answer;
    }
}