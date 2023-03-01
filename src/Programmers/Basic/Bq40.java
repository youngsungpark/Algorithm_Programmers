package Programmers.Basic;

//모음 제거
public class Bq40 {
    public static void main(String[] args) {
        Bq40 sol1 = new Bq40();
        Bq40 sol2 = new Bq40();
        System.out.println(sol1.solution("bus"));
        System.out.println(sol2.solution("nice to meet you"));
    }
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]","");
        return answer;
    }
}
