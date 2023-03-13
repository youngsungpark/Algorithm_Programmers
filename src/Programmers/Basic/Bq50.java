package Programmers.Basic;

//n의 배수 고르기
public class Bq50 {
    public static void main(String[] args) {
        Bq50 sol1 = new Bq50();
        Bq50 sol2 = new Bq50();
        Bq50 sol3 = new Bq50();
        System.out.println(sol1.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}));
        System.out.println(sol2.solution(5, new int[]{1, 9, 3, 10, 13, 5}));
        System.out.println(sol3.solution(12, new int[]{2, 100, 120, 600, 12, 12}));
    }
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                cnt++;
            }
        }

        int[] answer = new int[cnt];
        int count = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[count] = numlist[i];
                count++;
            }
        }
        return answer;
    }
}
