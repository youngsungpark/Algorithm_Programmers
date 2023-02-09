package Programmers;

//콜라츠 추측
public class Q27 {
    public static void main(String[] args) {
        Q27 sol1 = new Q27();
        Q27 sol2 = new Q27();
        Q27 sol3 = new Q27();
        System.out.println(sol1.solution(6));
        System.out.println(sol2.solution(16));
        System.out.println(sol3.solution(626331));
    }
    public int solution(int num) {
        long number = num;
        int answer;
        for(answer = 0; answer < 500; answer++){
            if(number == 1) return answer;
            else{
                if(number % 2 == 0) number /= 2;
                else number = number * 3 + 1;
            }
        }
        return -1;
    }
}
