import java.util.ArrayList;
import java.util.Scanner;

public class AdvancedRecursion {

    public static void printPermutations(String str, String permutations){
        if(str.length()==0){
            System.out.println(permutations);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            printPermutations(newstr,permutations+currChar);
        }
        return;
    }

    public static int countPaths(int i, int j, int n, int m){
        if(i==n||j==m){
            return 0;
        }

        if(i==n-1&&j==m-1){
            return 1;
        }

        int downPaths=countPaths(i+1,j,n,m);

        int rightPaths=countPaths(i,j+1,n,m);

        return downPaths+rightPaths;
    }

    public static int placeTiles(int n, int m){
        //Conditions i come up with
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        //Mam's Theoretical Conditions
//        if(n==m){
//            return 2;
//        }
//        if(n<m){
//            return 1;
//        }

        int horziontalPlacements = placeTiles(n-1,m);

        int verticalPlacements = placeTiles(n-m,m);
        return horziontalPlacements+verticalPlacements;
    }

    public static int invitePeople(int n){
        if(n<=1){
            return 1;
        }
        int singleInvite=invitePeople(n-1);

        int pairInvite=(n-1) * invitePeople(n-2);

        return singleInvite+pairInvite;
    }

    public static void printSubsets(int n, ArrayList<Integer> subsets){

        if(n==0){
            System.out.println(subsets);
            return;
        }
        //add hoga
        subsets.add(n);
        printSubsets(n-1,subsets);

        //Add nahi hoga
        subsets.remove(subsets.size()-1);
        printSubsets(n-1,subsets);
        return;
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        //Print all permutations of the string
//        String str=sc.next();
//        printPermutations(str,"");

        //Count Total paths in a maze to move from(0,0) to (n,m)
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        System.out.println(countPaths(0,0,n,m));

        //Place tiles of size 1xM in  a floor of size nxm
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        System.out.println(placeTiles(n,m));

        //Number of ways to invite n people to your party
//        int n=sc.nextInt();
//        System.out.println(invitePeople(n));

        //Print all the subsets of a set of first n natural numbers
        int n=sc.nextInt();
        ArrayList<Integer> subsets=new ArrayList<>();
        printSubsets(n,subsets);
    }
}