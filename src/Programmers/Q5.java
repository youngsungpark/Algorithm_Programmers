package Programmers;

//문자열을 정수로 바꾸기
public class Q5 {
    public static void main(String[] args) {
        Q5 s1 = new Q5();
        Q5 s2 = new Q5();
        System.out.println(s1.solution("1234"));
        System.out.println(s2.solution("-1234"));
    }
    public int solution(String s) {
        int answer = 0;
        try {
            answer = Integer.parseInt(s);

        }
        catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        return answer;
    }
}
