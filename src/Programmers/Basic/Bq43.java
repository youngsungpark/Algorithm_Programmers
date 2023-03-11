package Programmers.Basic;

//암호 해독
public class Bq43 {
    public static void main(String[] args) {
        Bq43 sol1 = new Bq43();
        Bq43 sol2 = new Bq43();
        System.out.println(sol1.solution("dfjardstddetckdaccccdegk",4));
        System.out.println(sol2.solution("pfqallllabwaoclk",2));
    }
    public String solution(String cipher, int code) {
        String answer = "";
        int codeLength = cipher.length()/code;
        for (int i = 1; i <= codeLength; i++) {
            answer += cipher.substring(code * i - 1, code * i);
        }
        return answer;
    }
}
