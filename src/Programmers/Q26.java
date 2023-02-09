package Programmers;

//제일 작은 수 제거하기
public class Q26 {
    public static void main(String[] args) {
        Q26 sol1 = new Q26();
        Q26 sol2 = new Q26();
        System.out.println(sol1.solution(new int[]{4,3,2,1}));
        System.out.println(sol2.solution(new int[]{10}));
    }
    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int[] answer = new int[arr.length - 1];

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                continue;
            }
            answer[idx++] = arr[i];
        }
        return answer;
    }
}
