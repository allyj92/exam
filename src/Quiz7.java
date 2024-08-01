import java.util.ArrayList;
import java.util.List;

public class Quiz7 {
    public static void main(String[] args) {

        ArrayList<Human> list1 = new ArrayList<>();
        list1.add(new Human());
//        Animal animal = list1.add(new Tiger1());


    }
}

class Animal{
    public void sleep(){
        System.out.println("밤에는 잠을 잡니다.");
    }



}

class Human extends Animal{
    public void run(){
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(){
        System.out.println("사람이 책을 읽습니다.");
    }


}

class Tiger1 extends Animal{
    public void run(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
