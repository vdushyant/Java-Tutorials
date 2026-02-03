import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Your name is "+name);

        //Concatenation
//        String firstName=sc.next();
//        String lastName=sc.next();
//        String fullName=firstName+lastName;
//        System.out.println(fullName);

        //String Builder for Performance instead of 2nd Approach
//        String[] strings =
//                new String[]{"one", "two", "three", "four", "five"};
//
//        StringBuilder temp  = new StringBuilder();
//        for(String string : strings) {
//            temp.append(string);
//        }
//        String result = temp.toString();
//        System.out.println(result);

        //2nd Approach -> (The problem with this approach is that every iteration string builder copies the
        // result and apppend the item and then create a new string object.
//        String[] strings  = {"one","Two","Three","Four","Five"};
//        String result = "";
//        for(var str:strings){
//            result = result+str;
//        }
//
//        System.out.println(result);

        //Length
//        System.out.println(fullName.length());

        //chatAt
//        for(int i=0;i<fullName.length();i++){
//            System.out.println(fullName.charAt(i));
//        }

        //Index Of
//        String theString = "is this good or is this bad?";
//        String substring = "is";
//
//        int index = theString.indexOf(substring);
//        while(index != -1) {
//            System.out.println(index);
//            index = theString.indexOf(substring, index + 1);
//        }

        //Compare
        String name1="Tony";
        String name2="Tony";

        //s1>s2 => +ve value
        //s11==s2 => 0
        //s1<s2 => -ve value

        //aahello and aabello

//        if(name1.compareTo(name2)==0){
//            System.out.println("Strings are equal");
//        }
//        else{
//            System.out.println("Strings are not equal");
//        }

//        if(name1==name2){
//            System.out.println("Strings are equal");
//        }
//        else{
//            System.out.println("Strings are not equal");
//        }

//        if(new String("Tony") == new String("Tony"){
//            System.out.println("Strings are equal");
//        }
//        else{
//            System.out.println("Strings are not equal");
//        }

        //Substring
//        String sentence = "My name is Dushyant";
//        //substring(begindex endindex)
//        String name = sentence.substring(11,sentence.length());
//        System.out.println(name);

        //Strings are immutable
//        String name ="Dushyan";
//        name = name+"t";
//        System.out.println(name);
    }
}