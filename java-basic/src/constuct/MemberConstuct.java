package constuct;

public class MemberConstuct {
    String name;
    int age;
    int grade;

    MemberConstuct(String name, int age){
        this(name, age, 50);
    }

    MemberConstuct(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
