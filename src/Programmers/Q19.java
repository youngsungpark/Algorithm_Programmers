package Programmers;

//수박수박수박수박수박수?
public class Q19 {
    public static void main(String[] args) {
        Q19 sol1 = new Q19();
        Q19 sol2 = new Q19();
        System.out.println(sol1.solution(3));
        System.out.println(sol2.solution(4));
    }
    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            }
            else {
                answer += "박";
            }
        }
        return answer;
    }
}
