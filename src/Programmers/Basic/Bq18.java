package Programmers.Basic;

//옷가게 할인 받기
public class Bq18 {
    public static void main(String[] args) {
        Bq18 sol1 = new Bq18();
        Bq18 sol2 = new Bq18();
        System.out.println(sol1.solution(150000));
        System.out.println(sol2.solution(580000));
    }
    public int solution(int price) {
        int answer = 0;
        if (price < 100000) {
          answer = price;
        } else if (price >= 100000 && price < 300000) {
            answer = (int) (price * 0.95);
        } else if (price >= 300000 && price < 500000) {
            answer = (int) (price * 0.9);
        } else if (price >= 500000) {
            answer = (int) (price * 0.8);
        }
        return answer;
    }
}
