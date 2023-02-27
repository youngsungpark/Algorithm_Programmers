package Programmers.Basic;

//최댓값 만들기(1)
public class Bq31 {
    public static void main(String[] args) {
        Bq31 sol1 = new Bq31();
        Bq31 sol2 = new Bq31();
        System.out.println(sol1.solution(new int[]{1,2,3,4,5}));
        System.out.println(sol2.solution(new int[]{0,31,24,10,1,9}));
    }
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
}
