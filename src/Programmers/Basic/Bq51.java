package Programmers.Basic;

//최댓값 만들기 (2)
public class Bq51 {
    public static void main(String[] args) {
        Bq51 sol1 = new Bq51();
        Bq51 sol2 = new Bq51();
        Bq51 sol3 = new Bq51();
        System.out.println(sol1.solution(new int[]{1, 2, -3, 4, -5}));
        System.out.println(sol2.solution(new int[]{0, -31, 24, 10, 1, 9}));
        System.out.println(sol3.solution(new int[]{10, 20, 30, 5, 5, 20, 5}));
    }
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length-1] * numbers[numbers.length-2];

        if (num1 < num2) {
            answer = num2;
        }
        else answer = num1;

        return answer;
    }
}