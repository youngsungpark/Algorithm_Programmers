package Programmers;

import java.util.ArrayList;
import java.util.List;

//3진법 뒤집기
public class Q29 {
    public static void main(String[] args) {
        Q29 sol1 = new Q29();
        Q29 sol2 = new Q29();
        System.out.println(sol1.solution(45));
        System.out.println(sol2.solution(125));
    }
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 3);
            n /= 3;
        }

        for(int i = 0; i < list.size(); i++){
            answer += list.get(i)*Math.pow(3, list.size()-i-1);
        }
        return answer;
    }
}
