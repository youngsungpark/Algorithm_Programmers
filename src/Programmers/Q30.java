package Programmers;

//최소직사각형
public class Q30 {
    public static void main(String[] args) {
        Q30 sol1 = new Q30();
        Q30 sol2 = new Q30();
        Q30 sol3 = new Q30();
        System.out.println(sol1.solution(new int[][]{{60,50},{30,70},{60,30},{80,40}}));
        System.out.println(sol2.solution(new int[][]{{10,7},{12,3},{8,15},{14,7},{5,15}}));
        System.out.println(sol3.solution(new int[][]{{14,4},{19,6},{6,16},{18,7},{7,11}}));
    }
    public int solution(int[][] sizes) {
        int answer = 0;
        int finalMax = 1;
        int finalMin = 1;

        for(int i = 0; i < sizes.length; i++){
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);

            finalMax = Math.max(finalMax, max);
            finalMin = Math.max(finalMin, min);
        }
        answer = finalMax * finalMin;
        return answer;
    }
}
