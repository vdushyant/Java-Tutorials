class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }

    public void color(){
        System.out.println(this.color);
    }

}

class Students{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
//    Student(String name, int age) {//Parameterised Constructor
//        System.out.println("Constructor is called");
//        this.name=name;
//        this.age=age;
//    }

//    Student(Student s1){//Copy Constructor
//        this.name =s1.name;
//        this.age=s1.age;
//    }

}
public class OOPS {
    public static void main(String[] args) {

//        Pen pen1=new Pen();
//        pen1.color="blue";
//        pen1.type="gel";
//
//        Pen pen2=new Pen();
//        pen2.color = "black";
//        pen2.type="ballpoint";
//
//        pen1.color();
//        pen2.color();

        Students s1=new Students();
        s1.name="Dushyant";
        s1.age=21;
        s1.printInfo(s1.name,s1.age);

//        Student s2=new Student(s1);
//        s2.printInfo();


    }
}