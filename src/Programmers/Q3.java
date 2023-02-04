package Programmers;

//가운데 글자 가져오기
public class Q3 {
    public static void main(String[] args) {
        Q3 s1 = new Q3();
        Q3 s2 = new Q3();
        System.out.println(s1.solution("abcde"));
        System.out.println(s2.solution("qwer"));
    }
    public String solution(String s) {
        String answer = "";
        int num = s.length();

        if (s.length() % 2 == 0) {
            answer = answer + s.charAt((num-2)/2);
            answer = answer + s.charAt(num/2);
        }
        else {
            answer = answer + s.charAt((num - 1)/2);
        }

        return answer;
    }
}
