import java.util.ArrayList;
import java.util.Arrays;

public class Quiz4 {
    public static void main(String[] args) {
    ArrayList<Integer> arrays = new ArrayList<Integer>();
    arrays.add(2);
    arrays.add(4);
    arrays.add(6);
    arrays.add(8);
    arrays.add(10);

        ArrayList<Integer> arrays2 = new ArrayList<Integer>();
        arrays2.add(2);
        arrays2.add(4);



    System.out.println("첫 배열의 합계: "+arraySumCalc(arrays));
    System.out.println("두번째 배열의 합계: " + arraySumCalc(arrays2));


    }
    static public int arraySumCalc(ArrayList<Integer> arr){
        int sum=0;
        if (arr.size()<3){
            return -999;
        }else{
            for(int a:arr){
                sum+=a;
            }

        }
        return sum;

    }
}
