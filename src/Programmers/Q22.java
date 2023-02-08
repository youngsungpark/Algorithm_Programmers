package Programmers;

//자릿수 더하기
public class Q22 {
    public static void main(String[] args) {
        Q22 sol1 = new Q22();
        Q22 sol2 = new Q22();
        System.out.println(sol1.solution(123));
        System.out.println(sol2.solution(987));
    }
    public int solution(int n) {
        int answer = 0;

        String s = Integer.toString(n);

        for (int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(s.substring(i, i+1));
        }

        return answer;
    }
}
