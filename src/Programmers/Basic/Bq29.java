package Programmers.Basic;

//배열 자르기
public class Bq29 {
    public static void main(String[] args) {
        Bq29 sol1 = new Bq29();
        Bq29 sol2 = new Bq29();
        System.out.println(sol1.solution(new int[]{1,2,3,4,5},1,3));
        System.out.println(sol2.solution(new int[]{1,3,5},1,2));
    }
    public int[] solution(int[] numbers, int num1, int num2) {
        int num = num2 - num1 + 1;
        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            answer[i] = numbers[num1 + i];
        }

        return answer;
    }
}
