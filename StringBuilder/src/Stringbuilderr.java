public class Stringbuilderr {
    public static void main(String[] args) {

        StringBuilder sb =new StringBuilder("hello");
//        System.out.println(sb);
//
//        //char at index 0
//        System.out.println(sb.charAt(0));
//
//        //Set char at 0
//        sb.setCharAt(0,'p');
//        System.out.println(sb);
//
//        //insert char
//        sb.insert(0,'s');
//        System.out.println(sb);
//
//        //Delete char or substring
//        sb.delete(2,3);
//        System.out.println(sb);
//
//        //Append
//        sb.append(" Stark");
//        System.out.println(sb);

        //Problem 1
        for(int i=0;i<sb.length()/2;i++){
            int front =i;
            int back =sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}