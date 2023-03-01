package Programmers.Basic;

//문자열안에 문자열
public class Bq39 {
    public static void main(String[] args) {
        Bq39 sol1 = new Bq39();
        Bq39 sol2 = new Bq39();
        Bq39 sol3 = new Bq39();
        System.out.println(sol1.solution("ab6CDE443fgh22iJKlmn1o","6CD"));
        System.out.println(sol2.solution("ppprrrogrammers","pppp"));
        System.out.println(sol3.solution("AbcAbcA","AAA"));
    }
    public int solution(String str1, String str2) {
        int answer = 0;
        if (str1.contains(str2)) {
            answer = 1;
        }
        else {
            answer = 2;
        }
        return answer;
    }
}
