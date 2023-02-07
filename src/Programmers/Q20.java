package Programmers;

import java.util.HashMap;

//완주하지 못한 선수
public class Q20 {
    public static void main(String[] args) {
        Q20 sol1 = new Q20();
        Q20 sol2 = new Q20();
        Q20 sol3 = new Q20();
        System.out.println(sol1.solution(new String[]{"leo","kiki","eden"},new String[]{"eden","kiki"}));
        System.out.println(sol2.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(sol3.solution(new String[]{"mislav", "stanko", "mislav", "ana"},new String[]{"stanko", "ana", "mislav"}));
    }
    public String solution(String[] participant, String[] completion) {
        String answer ="";
        HashMap<String, Integer> hm = new HashMap<>();
        for(String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for(String player : completion) hm.put(player, hm.get(player) -1);
        for(String key : hm.keySet()) {
            if(hm.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;

    }
}
