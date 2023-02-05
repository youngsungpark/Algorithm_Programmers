package Programmers;

//음양 더하기
public class Q7 {
    public static void main(String[] args) {
        Q7 sol1 = new Q7();
        Q7 sol2 = new Q7();
        System.out.println(sol1.solution(new int[]{4,7,12}, new boolean[]{true, false, true}));
        System.out.println(sol2.solution(new int[]{1,2,3}, new boolean[]{false,false,true}));
    }
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i] == true) {
                answer = answer + absolutes[i];
            }
            else {
                answer = answer - absolutes[i];
            }
        }
        return answer;
    }
}
