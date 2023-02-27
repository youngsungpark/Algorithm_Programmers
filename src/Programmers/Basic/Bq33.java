package Programmers.Basic;

//배열의 유사도
public class Bq33 {
    public static void main(String[] args) {
        Bq33 sol1 = new Bq33();
        Bq33 sol2 = new Bq33();
        System.out.println(sol1.solution(new String[]{"a","b","c"},new String[]{"com","b","d","p","c"}));
        System.out.println(sol2.solution(new String[]{"n","omg"},new String[]{"m","dot"}));
    }
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    cnt++;
                }
            }
        }

        if (cnt == 0) {
            answer = 0;
        }
        else {
            answer = cnt;
        }

        return answer;
    }
}
