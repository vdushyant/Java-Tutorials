import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class TCSQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        sc.nextLine();
        TravelAgencies arr[] = new TravelAgencies[2];
        for(int i=0;i<2;i++){
            int a =sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            String c = sc.nextLine();
            sc.nextLine();
            int d = sc.nextInt();
            boolean e = sc.nextBoolean();

            arr[i]=new TravelAgencies(a,b,c,d,e);
        }
        int result = findAgencyWithHighestPackagePrice(arr);
       System.out.println(result);
       int regNo = sc.nextInt();
       sc.nextLine();
       String packageType = sc.nextLine();
       TravelAgencies res = agencyDetailsForGivenIdAndType(arr,regNo,packageType);
       if(res!=null){
           System.out.println(res.getAgencyName()+":"+res.getPrice());
       }
       else{
           System.out.println("No such agency found.");
       }
       return;
    }

    public static int findAgencyWithHighestPackagePrice(TravelAgencies arr[]){
        TravelAgencies temp = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i].getPrice()> temp.getPrice()){
                temp = arr[i];
            }
        }
        return temp.getPrice();
    }

    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies arr[], int regNo, String packageType){
        TravelAgencies temp = null;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getFlightFacility()==true){
                if(arr[i].getRegNo()==regNo&&arr[i].getPackageType().equalsIgnoreCase(packageType)){
                    temp = arr[i];
                }
            }
        }
        return temp;
    }
}


class TravelAgencies{
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFaciliy;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFaciliy){
        this.regNo=regNo;
        this.agencyName=agencyName;
        this.packageType=packageType;
        this.price=price;
        this.flightFaciliy=flightFaciliy;
    }



    public int getRegNo(){
        return regNo;
    }

    public String getAgencyName(){
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean getFlightFacility(){
        return flightFaciliy;
    }

}
