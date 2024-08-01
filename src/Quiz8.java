public class Quiz8 {
    public static void main(String[] args) {
    Calc calc = new CalcImpl();
        System.out.println(calc.add(10,5));
        System.out.println(calc.substract(10,5));
        System.out.println(calc.times(10,5));
        System.out.println(calc.divide(10,5));
        System.out.println();
        System.out.println(calc.divide(10,0));
        System.out.println(calc.divide(10,20));
    }
}

interface Calc{
    int Error = -9999;

    public int add(int a, int b);
    public int substract(int a, int b);
    public int times(int a, int b);
    public int divide(int a, int b);

}

class CalcImpl implements Calc{

    @Override
    public int add(int a, int b) {
        if(b>a){
            return Error;
        }
        return a+b;
    }

    @Override
    public int substract(int a, int b) {
        if(b>a){
            return Error;
        }
        return a-b;
    }

    @Override
    public int times(int a, int b) {
        if(b>a){
            return Error;
        }
        return a*b;
    }

    @Override
    public int divide(int a, int b) {
        if(b>a || b==0){
            return Error;
        }
        return a/b;
    }
}