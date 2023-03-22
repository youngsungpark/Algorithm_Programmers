package Programmers.Basic;

//배열 회전시키기
public class Bq55 {
    public static void main(String[] args) {
        Bq55 sol1 = new Bq55();
        Bq55 sol2 = new Bq55();
        System.out.println(sol1.solution(new int[]{1,2,3},"right"));
        System.out.println(sol2.solution(new int[]{4,455,6,4,-1,45,6},"left"));
    }
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("left")){
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }

            answer[answer.length - 1] = numbers[0];

        } else if (direction.equals("right")) {
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }

            answer[0] = numbers[numbers.length-1];
        }
        return answer;
    }
}
