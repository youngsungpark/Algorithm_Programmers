package Programmers;

//이상한 문자 만들기
public class Q21 {
    public static void main(String[] args) {
        Q21 sol1 = new Q21();
        System.out.println(sol1.solution("try hello world"));
    }
    public String solution(String s) {
        String[] str = s.split("");
        String answer = "";

        int idx = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) {
                idx = 0;
            }
            else if (idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            }
            else if (idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }

        return answer;
    }
}
