package Programmers;

//자연수 뒤집어 배열로 만들기
public class Q23 {
    public static void main(String[] args) {
        Q23 sol1 = new Q23();
        System.out.println(sol1.solution(12345));
    }
    public int[] solution(long n) {
        String s = String.valueOf(n);
        String[] sarray = s.split("");
        int[] answer = new int[sarray.length];

        for (int i = 0; i < sarray.length; i++){
            answer[i] = Integer.parseInt(sarray[sarray.length - 1 - i]);
        }
        return answer;
    }
}
