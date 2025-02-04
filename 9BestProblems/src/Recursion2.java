import java.util.HashSet;
import java.util.Scanner;

public class Recursion2 {

    public static int first = -1;
    public static int last = -1;

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//    public static boolean[] map = new boolean[26];

    public static void TowerofHanoi(int n,String src, String helper, String destination){
         if(n==1){
             System.out.println("Transferred disk"+ n +" from "+src + " to " + destination);
             return;
         }

        TowerofHanoi(n-1,src,destination,helper);
        System.out.println("Transferred disk "+ n +" from "+src + " to " + destination);
        TowerofHanoi(n-1,helper,src,destination);
    }

    public static void printStringInReverse(String str, int length){
             if(length<0){
                 return;
             }
        System.out.print(str.charAt(length));
        printStringInReverse(str,length-1);
        return;
    }

    public static void findOccurance(String str, int idx, char element){
        if(idx==str.length()){
            System.out.println("The first occurence of element is = "+first);
            System.out.println("The last Occurence of element is ="+last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        findOccurance(str,idx+1,'a');
        return;
    }

    public static void checkSort(int[] arr, int idx, int n){
        if(idx==n){
            System.out.println("Array is Sorted");
            return;
        }
        if(arr[idx]>=arr[idx+1]){
            System.out.println("Array is not Sorted");
            return;
        }
        else{
        checkSort(arr,idx+1,n);
        }
        return;
    }

    public static void moveX(String str, String newStr, int idx, int count){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newStr = newStr + "x";
            }
            System.out.println(newStr);
            return;
        }

        if(str.charAt(idx)=='x'){
            count++;
        }
        else{
            newStr = newStr + str.charAt(idx);
        }
        moveX(str,newStr,idx+1, count);
    }


    public static void removeDuplicates(String str, int idx, String newStr, boolean[] map){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str,idx+1,newStr, map);
        }
        else{
            newStr+= currChar;
            map[currChar-'a']= true;
            removeDuplicates(str,idx+1,newStr, map);
        }
        return;
    }

    public static void subsequences(String str, int idx, String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        int currChar = str.charAt(idx);

        subsequences(str,idx+1,newStr+currChar);//Wants to be included

        subsequences(str,idx+1,newStr);//Dont want to be included
        return;
    }

    public static void uniqueSubsequences(String str, int idx, String newStr,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                set.add(newStr);
                System.out.println(newStr);
                return;
            }
        }

        int currChar = str.charAt(idx);

        uniqueSubsequences(str,idx+1,newStr+currChar, set);//Wants to be included

        uniqueSubsequences(str,idx+1,newStr,set);//Dont want to be included
        return;
    }

    public static void keypadCombinations(String str, int idx, String Combinations){
        if(idx==str.length()){
            System.out.println(Combinations);
            return;
        }

        char currChar=str.charAt(idx);
        String mapping =  keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            keypadCombinations(str,idx+1,Combinations+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Tower of Hanoi
//        int n=sc.nextInt();
//        TowerofHanoi(n,"S","H","D");

        //Print String in Reverse
//        String str = sc.next();
//        int length = str.length();
//        printStringInReverse(str,length-1);

        //Find the first and last occurence of an element in a string
//        String str=sc.next();
//        findOccurance(str,0,'a');

        //Check if the array is sorted or not
//        int n=sc.nextInt();
//        int[] arr= new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        checkSort(arr,0,n-1);

        //Move all x to the end of the string
//        String str= sc.next();
//        String newStr="";
//        moveX(str,newStr,0,0);

        //Remove duplicates in a string
//        String str = sc.next();
//        boolean[] map = new boolean[26];
//         removeDuplicates(str,0,"",map);


        //Print all the subsequences of the string
//        String str=sc.next();
//        subsequences(str,0,"");

        //Print all the unique subsequences of the string
//        String str = sc.next();
//        HashSet<String> set = new HashSet<>();
//        uniqueSubsequences(str,0,"",set);

        //Print all Keypad Combinations
        String str=sc.next();
        keypadCombinations(str,0,"");
    }
}