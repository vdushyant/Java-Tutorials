import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Recursion {

    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(--n);
    }

    public static void sumOfFirstN(int n,int i,int sum){
        if(i>n){
            System.out.println("The sum of First n natural numbers is = "+ sum);
            return ;
        }
        sum = sum +i;
        sumOfFirstN(n,++i,sum);
        return;
    }

    public static int printFact(int n){
        if(n==1){
            return 1;
        }
        int fact_numb = printFact(n-1);
        int fact = fact_numb * n;
        return fact;
    }

    public static void printFib(int a, int b, int n){
        if(n==0){
            return;
        }
        System.out.println(a);
        printFib(b,a+b,n-1);
    }

    public static int calcPower(int x, int n){
        if(n==0){//Base Case 1
            return 1;
        }
        if(x==0){//Base Case 2
            return 0;
        }
        if(n%2==0){
            return calcPower(x,n/2) * calcPower(x,n/2);
        }
        else{
            return calcPower(x,n/2) * calcPower(x,n/2) * x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Example 1(Print Numbers from n to 1)
//        int n=sc.nextInt();
//        printNumbers(n);

        //Example 2(Print Sum of First n Natural Numbers
//        int n=sc.nextInt();
//        sumOfFirstN(n,1,0);

        //Example 3(Print Factorial of a number N)
//        int n=sc.nextInt();
//        System.out.println(printFact(n));

        //Example 4(Print the fibonacci Sequence uptill nth term)
//        int n=sc.nextInt();
//        printFib(0,1,n);

        //Example 5(Calculate Power of X)
        int x=sc.nextInt();
        int n= sc.nextInt();
        System.out.println(calcPower(x,n));
    }
}