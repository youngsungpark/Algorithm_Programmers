package Programmers.Basic;

//배열 원소의 길이
public class Bq26 {
    public static void main(String[] args) {
        Bq26 sol1 = new Bq26();
        Bq26 sol2 = new Bq26();
        System.out.println(sol1.solution(new String[]{"We","are","the","world!"}));
        System.out.println(sol2.solution(new String[]{"I","Love","Programmers."}));
    }
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
