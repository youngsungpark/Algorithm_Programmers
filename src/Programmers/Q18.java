package Programmers;

//서울에서 김서방 찾기
public class Q18 {
    public static void main(String[] args) {
        Q18 sol1 = new Q18();
        System.out.println(sol1.solution(new String[]{"Jane","Kim"}));
    }
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}
