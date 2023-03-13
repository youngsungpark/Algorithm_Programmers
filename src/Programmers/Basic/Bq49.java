package Programmers.Basic;

//주사위의 개수
public class Bq49 {
    public static void main(String[] args) {
        Bq49 sol1 = new Bq49();
        Bq49 sol2 = new Bq49();
        System.out.println(sol1.solution(new int[]{1,1,1},1));
        System.out.println(sol2.solution(new int[]{10,8,6},3));
    }
    public int solution(int[] box, int n) {
        int answer = 0;
        answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
        return answer;
    }
}
