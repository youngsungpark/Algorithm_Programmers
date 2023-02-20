package Programmers.Basic;

//중앙값 구하기
public class Bq12 {
    public static void main(String[] args) {
        Bq12 sol1 = new Bq12();
        Bq12 sol2 = new Bq12();
        System.out.println(sol1.solution(new int[]{1,2,7,10,11}));
        System.out.println(sol2.solution(new int[]{9,-1,0}));
    }
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++){
                if (array[i]> array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        answer = array[(array.length-1)/2];
        return answer;
    }
}
