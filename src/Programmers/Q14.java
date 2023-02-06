package Programmers;

//나누어 떨어지는 숫자 배열
public class Q14 {
    public static void main(String[] args) {
        Q14 sol1 = new Q14();
        System.out.println(sol1.solution(new int[]{5,9,7,10},5));
    }
    public int[] solution(int[] arr, int divisor) {

        int count = 0;
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;              // arr이 divisor로 나눠진 갯수
            }
        }
        if (count == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[number] = arr[i];
                number++;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = i+1; j < answer.length; j++) {
                if (answer[i] > answer[j]) {
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}
