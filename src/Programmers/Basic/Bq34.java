package Programmers.Basic;

//삼각형의 완성조건 (1)
public class Bq34 {
    public static void main(String[] args) {
        Bq34 sol1 = new Bq34();
        Bq34 sol2 = new Bq34();
        Bq34 sol3 = new Bq34();
        System.out.println(sol1.solution(new int[]{1,2,3}));
        System.out.println(sol2.solution(new int[]{3,6,2}));
        System.out.println(sol3.solution(new int[]{199,72,222}));
    }
    public int solution(int[] sides) {
        int answer = 0;

        for (int i = 0; i < sides.length; i++) {
            for (int j = i+1; j < sides.length; j++) {
                if (sides[i] > sides[j]) {
                    int temp = sides[i];
                    sides[i] = sides[j];
                    sides[j] = temp;
                }
            }
        }

        if (sides[2] < sides[0] + sides[1]) {
            answer = 1;
        }
        else {
            answer = 2;
        }

        return answer;
    }
}
