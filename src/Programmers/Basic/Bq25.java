package Programmers.Basic;

//배열 뒤집기
public class Bq25 {
    public static void main(String[] args) {
        Bq25 sol1 = new Bq25();
        Bq25 sol2 = new Bq25();
        Bq25 sol3 = new Bq25();
        System.out.println(sol1.solution(new int[]{1,2,3,4,5}));
        System.out.println(sol2.solution(new int[]{1,1,1,1,1,2}));
        System.out.println(sol3.solution(new int[]{1,0,1,1,1,3,5}));
    }
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - 1 - i];
        }

        return answer;
    }
}
