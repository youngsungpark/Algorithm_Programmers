package Programmers.Basic;

//문자열 정렬하기 (1)
public class Bq45 {
    public static void main(String[] args) {
        Bq45 sol1 = new Bq45();
        System.out.println(sol1.solution("hi12392"));
    }
    public int[] solution(String my_string) {

        my_string = my_string.replaceAll("[a-z]","");

        int[] answer = new int[my_string.length()];

        for(int i =0; i<my_string.length(); i++){
            answer[i] = my_string.charAt(i) - '0';
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
