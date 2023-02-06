package Programmers;

//내적
public class Q15 {
    public static void main(String[] args) {
        Q15 sol1 = new Q15();
        Q15 sol2 = new Q15();
        System.out.println(sol1.solution(new int[]{1,2,3,4,},new int[]{-3,-1,0,2}));
        System.out.println(sol2.solution(new int[]{-1,0,1}, new int[]{1,0,-1}));
    }
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }
}
