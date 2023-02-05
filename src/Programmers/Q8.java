package Programmers;

//평균 구하기
public class Q8 {
    public static void main(String[] args) {
        Q8 sol1 = new Q8();
        Q8 sol2 = new Q8();
        System.out.println(sol1.solution(new int[]{1,2,3,4}));
        System.out.println(sol2.solution(new int[]{5,5}));
    }
    public double solution(int[] arr) {
        double answer = 0;
        double sum =0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        answer = sum/arr.length;
        return answer;
    }
}
