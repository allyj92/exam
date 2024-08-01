public class Quiz1 {
    public static void main(String[] args) {
        int math = 90;
        int eng = 70;
        int kor = 100;

        System.out.println(total(math,eng,kor));
        System.out.println(avg(math,eng,kor));


    }



    public static double total(int math, int eng,int kor){
        int totalScore = (math+eng+kor);
        return totalScore;
    }

    public static double avg(int math, int eng,int kor){
        double avgScore =  (total(math,eng,kor)/3);
        return avgScore;
    }
}


