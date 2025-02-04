import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //Get bit
        int n=sc.nextInt();
        int pos=sc.nextInt();
//        int bitmask=1<<pos;
//        if((n&bitmask)==0){
//            System.out.println("bit was zero");
//        }
//        else{
//            System.out.println("bit was 1");
//        }

        //Set bit
//        int bitmask = 1<<pos;
//        int newNumber = (n | bitmask);
//        System.out.println(newNumber);

        //Clear bit
//        int bitmask= ~(1<<pos);
//        int newNumber = (n & bitmask);
//        System.out.println(newNumber);

        //Update Bit if to 1 then perform set bit otherwise clear bit for 0
        int operation = sc.nextInt();
        if(operation==1){
            int bitmask=1<<pos;
            int newNumber = n | bitmask;
            System.out.println(newNumber);
        }
        else{
            int bitmask = ~(1<<pos);
            int newNumber = n & bitmask;
            System.out.println(newNumber);
        }
    }
}