
class Shape{

    public void area(){
        System.out.println("Displays the area");
    }
        }

        class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
        }

        class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
        }

        class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)+r*r);
    }
        }

        abstract class Animals{
           abstract void walk();
           public void eat(){
               System.out.println("Animal eats");
           }
           Animals() {
               System.out.println("Animal is created");
           }
        }

        class Horses extends Animals{

           Horses(){
               System.out.println("You are creating a new horse");
           }
           public void walk(){
               System.out.println("Walks on 4 Legs");
           }
        }

        class Chicken extends Animals{
            public void walk(){
        System.out.println("Walks on 2 Legs");
    }
}
public class OOPS2 {
    public static void main(String[] args) {

        Horses h1=new Horses();
        h1.walk();
        h1.eat();

    }
}