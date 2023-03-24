package Programmers.Basic;

//369게임
public class Bq57 {
    public static void main(String[] args) {
        Bq57 sol1 = new Bq57();
        Bq57 sol2 = new Bq57();
        System.out.println(sol1.solution(3));
        System.out.println(sol2.solution(29423));
    }
    public int solution(int order) {
        int answer = 0;
        String str = "" + order;
        String[] strArr = str.split("");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("3") | strArr[i].equals("6") | strArr[i].equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}
