import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        //    First Example
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not an adult");
        }

//        Second Example
        int a =sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("A greater than b");
        }
        else{
            System.out.println("A less than b");
        }
//         Switch Case Example
        int button = sc.nextInt();

        switch(button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
                default: System.out.println("Invalid button");
        }
    }
}