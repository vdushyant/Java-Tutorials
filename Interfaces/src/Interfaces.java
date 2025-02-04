interface Animal{
    int eyes=2;
    void walk();
}
interface herbivore{

}

class Horse implements Animal,herbivore{
    @Override
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Student{
    String name;
    static String school;
    public static void changeSchool(){
        school="newSchool";
    }
}

public class Interfaces {
    public static void main(String[] args) {


        Horse horse = new Horse();
        horse.walk();

        Student.school="Cathedral";
        Student s1=new Student();
        s1.name="Dushyant";
        System.out.println(s1.school);
    }
}