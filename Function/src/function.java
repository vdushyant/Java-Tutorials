import java.util.Scanner;

public class function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static int calculatSum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static int calculateMultiply(int a,int b){
        int result;
        result=a * b;
        return result;
    }

    public static int calculateFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        function 1
//        String name = sc.next();
//        printMyName(name);

//        function 2
//        int a= sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println(calculatSum(a,b)); ;

        //function 3
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println(calculateMultiply(a,b));

        //function 4
        int n=sc.nextInt();
        System.out.println("The factorial of a number is = "+calculateFactorial(n));
    }
}