package Programmers.Basic;

//배열의 평균값
public class Bq17 {
    public static void main(String[] args) {
        Bq17 sol1 = new Bq17();
        Bq17 sol2 = new Bq17();
        System.out.println(sol1.solution(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println(sol2.solution(new int[]{89,90,91,92,93,94,95,96,97,98,99}));
    }
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        answer /= numbers.length;
        return answer;
    }
}
