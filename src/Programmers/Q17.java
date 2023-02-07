package Programmers;

//문자열 다루기 기본
public class Q17 {
    public static void main(String[] args) {
        Q17 sol1 = new Q17();
        Q17 sol2 = new Q17();
        System.out.println(sol1.solution("a234"));
        System.out.println(sol2.solution("1234"));
    }
    public boolean solution(String s) {

        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            try{
                int x = Integer.parseInt(s);
                answer = true;
                return answer;
            }
            catch (NumberFormatException ex) {
                answer = false;
                return answer;
            }
        }
        else {
            answer = false;
            return answer;
        }
    }
}
