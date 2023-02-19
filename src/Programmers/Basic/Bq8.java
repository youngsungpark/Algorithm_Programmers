package Programmers.Basic;

//머쓱이보다 키 큰 사람
public class Bq8 {
    public static void main(String[] args) {
        Bq8 sol1 = new Bq8();
        Bq8 sol2 = new Bq8();
        System.out.println(sol1.solution(new int[]{149,180,192,170},167));
        System.out.println(sol2.solution(new int[]{180,120,140},190));
    }
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }
        return answer;
    }
}
