package Programmers.Basic;

//로그인 성공?
public class Bq48 {
    public static void main(String[] args) {
        Bq48 sol1 = new Bq48();
        Bq48 sol2 = new Bq48();
        Bq48 sol3 = new Bq48();
        System.out.println(sol1.solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(sol2.solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));
        System.out.println(sol3.solution(new String[]{"rabbit04", "98761"}, new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}));
    }
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    answer = "login";
                }
                else {
                    answer = "wrong pw";
                }
            }
        }
        return answer;
    }
}
