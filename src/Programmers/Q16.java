package Programmers;

//문자열 내 p와 y의 개수
public class Q16 {
    public static void main(String[] args) {
        Q16 sol1 = new Q16();
        Q16 sol2 = new Q16();
        System.out.println(sol1.solution("pPoooyY"));
        System.out.println(sol2.solution("Pyy"));
    }
    boolean solution(String s) {
        int county = 0;
        int countp = 0;
        char ch = ' ';
        boolean answer = true;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == 'p' || ch == 'P')
                countp++;
            else if (ch == 'y' || ch == 'Y') {
                county++;
            }
        }
        if (countp - county != 0) {
            answer = false;
        }
        else {
            answer = true;
        }

        return answer;
    }
}
