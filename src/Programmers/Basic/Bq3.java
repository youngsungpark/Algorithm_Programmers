package Programmers.Basic;

//중복된 숫자 개수
public class Bq3 {
    public static void main(String[] args) {
        Bq3 sol1 = new Bq3();
        Bq3 sol2 = new Bq3();
        System.out.println(sol1.solution(new int[]{1,1,2,3,4,5},1));
        System.out.println(sol2.solution(new int[]{0,2,3,4},1));
    }
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i< array.length; i++ ) {
            if (array[i]-n == 0) {
                answer++;
            }
        }
        return answer;
    }
}
