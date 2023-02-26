package Programmers.Basic;

//짝수 홀수 개수
public class Bq28 {
    public static void main(String[] args) {
        Bq28 sol1 = new Bq28();
        Bq28 sol2 = new Bq28();
        System.out.println(sol1.solution(new int[]{1,2,3,4,5}));
        System.out.println(sol2.solution(new int[]{1,3,5,7}));
    }
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0){
                answer[0]++;
            }
            else {
                answer[1]++;
            }
        }

        return answer;
    }
}
