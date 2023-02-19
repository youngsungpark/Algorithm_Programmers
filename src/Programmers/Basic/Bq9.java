package Programmers.Basic;

//배열 두 배 만들기
public class Bq9 {
    public static void main(String[] args) {
        Bq9 sol1 = new Bq9();
        Bq9 sol2 = new Bq9();
        System.out.println(sol1.solution(new int[]{1,2,3,4,5}));
        System.out.println(sol2.solution(new int[]{1,2,100,-99,1,2,3}));
    }
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = 2 * numbers[i];
        }
        return answer;
    }
}
