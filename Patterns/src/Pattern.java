public class Pattern {
    public static void main(String[] args) {

//        pattern 1
//    for(int i=0;i<4;i++){
//        for(int j=0;j<5;j++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//       pattern 2
//        for(int i=0;i<4;i++){
//            for(int j=0;j<5;j++){
//                if(i==0||i==3||j==0||j==4) {
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        pattern 3
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        pattern 4
//        int n=4;
//        for(int i=4;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        pattern 5

//        int n=4;
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=(n-i+1);j<=4;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        pattern 6
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        pattern 7
//        int n=5;
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        pattern 7
//        int n=5;
//        int num=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }

//        pattern 8
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if((i+j)%2==0){
//                    System.out.print("1 ");
//                }
//                else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

//        pattern 9
//        int n=4;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=1;j<=(2 * (n-i));j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //2nd Part
//          for(int i=n;i>=1;i--){
//              for(int j=1;j<=i;j++){
//                  System.out.print("*");
//              }
//              for(int j=1;j<=(2 * (n-i));j++){
//                  System.out.print(" ");
//              }
//              for(int j=1;j<=i;j++){
//                  System.out.print("*");
//              }
//              System.out.println();
//          }

        //pattern 10
//        int n=5;
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //pattern 11
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        //pattern 12
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            if(i!=1){
//                for(int j=2;j<=i;j++){
//                    System.out.print(j);
//                }
//            }
//            System.out.println();
//        }

        //pattern 13
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2 * i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2 * i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
