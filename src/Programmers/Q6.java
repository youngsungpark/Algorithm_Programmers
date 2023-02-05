package Programmers;

//없는 숫자 더하기
public class Q6 {
    public static void main(String[] args) {
        Q6 num1 = new Q6();
        Q6 num2 = new Q6();
        System.out.println(num1.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(num2.solution(new int[]{5,8,4,0,6,7,9}));
    }
    public int solution(int[] numbers) {
        int sum = 45;
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer = answer + numbers[i];
        }
        return sum - answer;
    }

}
