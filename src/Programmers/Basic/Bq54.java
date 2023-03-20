package Programmers.Basic;

//가장 큰 수 찾기
public class Bq54 {
    public static void main(String[] args) {
        Bq54 sol1 = new Bq54();
        Bq54 sol2 = new Bq54();
        System.out.println(sol1.solution(new int[]{1,8,3}));
        System.out.println(sol2.solution(new int[]{9,10,11,8}));
    }
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxNum = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                index = i;
            }
        }
        answer[0] = maxNum;
        answer[1] = index;

        return answer;
    }
}
