package Programmers.Basic;

//숨어있는 숫자의 덧셈 (1)
public class Bq38 {
    public static void main(String[] args) {
        Bq38 sol1 = new Bq38();
        Bq38 sol2 = new Bq38();
        System.out.println(sol1.solution("aAb1B2cC34oOp"));
        System.out.println(sol2.solution("1a2b3c4d123"));
    }
    public int solution(String my_string) {
        int answer = 0;

        String[] arr = my_string.replaceAll("[a-z|A-Z]","").split("");

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                answer += Integer.parseInt(arr[i]);
            }
        }

        return answer;
    }
}
