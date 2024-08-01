public class Quiz6 {
    public static void main(String[] args) {
        Pen ballPen = new BallPen(2,"100%","파랑색");
        Pen sharkPen = new SharkPen(3,"80%","몽블랑");


        System.out.println("볼펜 "+ballPen.toString());
        System.out.println("만년필 "+sharkPen.toString());

    }
}
class Pen{
    private int bold;
    private String rest;
    private String color;

    public Pen(int bold, String rest, String color) {
        this.bold = bold;
        this.rest = rest;
        this.color = color;
    }

    public int getBold() {
        return bold;
    }

    public String getRest() {
        return rest;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{" +
                "bold=" + bold +
                ", rest='" + rest + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

class BallPen extends Pen{

    public BallPen(int bold, String rest, String color) {
        super(bold, rest, color);
    }
}

class SharkPen extends Pen{

    public SharkPen(int bold, String rest, String color) {
        super(bold, rest, color);
    }
}
