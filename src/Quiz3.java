public class Quiz3 {
    public static void main(String[] args) {
        calc(24);
    }
    static public void calc(int num){
        int sum=0;
        for(int i=1; i<=num;i++){
            sum+=i;
        }
        System.out.println("i: " + num+" , sum: " +sum);
    }
}
