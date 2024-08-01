import java.util.ArrayList;
import java.util.List;

public class Quiz7 {
    public static void main(String[] args) {
          Human human = new Human();
          Tiger1 tiger = new Tiger1();
          ArrayList<Animal> list1 = new ArrayList<>();
          list1.add(human);
        list1.add(tiger);
          list1.get(0).sleep();
          list1.get(0).run();
          list1.get(0).rootin();
        System.out.println();
        list1.get(1).sleep();
        list1.get(1).run();
        list1.get(1).rootin();





    }
}

class Animal{
    public void sleep(){
        System.out.println("밤에는 잠을 잡니다.");

    }
    public void run(){
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void rootin(){
        System.out.println("사람이 책을 읽습니다.");
    }




}

class Human extends Animal{


    public void run(){
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void rootin(){
        System.out.println("사람이 책을 읽습니다.");
    }



}

class Tiger1 extends Animal{
    public void run(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void rootin(){
        System.out.println("호랑이가 사냥을 합니다.");
    }

}
