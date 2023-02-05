package Programmers;

//행렬의 덧셈
public class Q10 {
    public static void main(String[] args) {
        Q10 sol1 = new Q10();
        Q10 sol2 = new Q10();
        System.out.println(sol1.solution(new int[][]{{1,2},{2,3}}, new int[][]{{3,4},{5,6}}));
        System.out.println(sol2.solution(new int[][]{{1},{2}}, new int[][]{{3},{4}}));
    }
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(answer);


        return answer;
    }
}
