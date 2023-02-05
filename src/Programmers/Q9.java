package Programmers;

//핸드폰 번호 가리기
public class Q9 {
    public static void main(String[] args) {
        Q9 sol1 = new Q9();
        Q9 sol2 = new Q9();
        System.out.println(sol1.solution("01033334444"));
        System.out.println(sol2.solution("027778888"));
    }
    public String solution(String phone_number) {
        String answer = "";
        String star = "";

        String a1 = phone_number.substring(0, phone_number.length()-4);
        String a2 = phone_number.substring(phone_number.length()-4);
        for (int i = 0; i < phone_number.length()-4; i++) {
            star = star + "*";
        }

        answer = star + a2;
        return answer;
    }
}
