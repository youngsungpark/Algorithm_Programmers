package Programmers;

import java.util.Arrays;
import java.util.Collections;

//정수 내림차순으로 배치하기
public class Q24 {
    public static void main(String[] args) {
        Q24 sol1 = new Q24();
        System.out.println(sol1.solution(118372));
    }
    public long solution(long n) {
        long answer = 0;

        String s = Long.toString(n);
        String[] sarray = s.split("");
        Arrays.sort(sarray, Collections.reverseOrder());

        String str = "";
        for (int i = 0; i < sarray.length; i++) {
            str += sarray[i];
        }
        answer = Long.parseLong(str);

        return answer;
    }
}
