public class Quiz5 {
    public static void main(String[] args) {
        Student student1 = new Student(1001,"둘리");
        Student student2 = new Student(1002,"또치");
        Student student3 = new Student(1003,"도우너");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

    }
}

class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [" +
                "studentId=" + id +
                ", studentName=" + name +
                ']';
    }
}
