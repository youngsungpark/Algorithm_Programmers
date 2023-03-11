package Programmers.Basic;

//가위 바위 보
public class Bq44 {
    public static void main(String[] args) {
        Bq44 sol1 = new Bq44();
        Bq44 sol2 = new Bq44();
        System.out.println(sol1.solution("2"));
        System.out.println(sol2.solution("205"));
    }
    public String solution(String rsp) {
        String answer = "";

        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') {
                answer += "0";
            }
            else if (rsp.charAt(i) == '0') {
                answer += "5";
            }
            else if (rsp.charAt(i) == '5') {
                answer += "2";
            }
        }

        return answer;
    }
}
