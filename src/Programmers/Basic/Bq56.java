package Programmers.Basic;

//외계행성의 나이
public class Bq56 {
    public static void main(String[] args) {
        Bq56 sol1 = new Bq56();
        Bq56 sol2 = new Bq56();
        Bq56 sol3 = new Bq56();
        System.out.println(sol1.solution(23));
        System.out.println(sol2.solution(51));
        System.out.println(sol3.solution(100));
    }
    public String solution(int age) {
        String answer = "";
        String a962 = "abcdefghij";
        String[] ageArray = String.valueOf(age).split("");

        for (int i = 0; i < ageArray.length; i++) {
            answer += a962.charAt(Integer.valueOf(ageArray[i]));
        }

        return answer;
    }
}
