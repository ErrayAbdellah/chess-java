import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] T = new int[8][8];
        String[] Ca = {"A","B","C","D","E","F","J","H"};
        int count = 0 ;
        //int counter = 1;

//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                T[i][j] = counter;
//                counter++;
//            }
//        }


        for (int i = 0 ; i < T.length ; i++){
             for (int j = 0 ; j < T.length ; j++ ){
                 T[i][j] = count ;
                 count++ ;
             }
         }
//        for (int i = 0 ; i < T.length ; i++){
//            for (int j = 0 ; j < T.length ; j++ ){
//                if (T[i][j]%2==0) {
//                    T[i][j] = 0 ;
//                }
//            }
//        }
        System.out.println("\t  (1)\t (2)   (3)\t (4)   (5)\t (6)   (7)   (8)");
        //System.out.println("\t\t    (0)\t (1)   (2)\t (3)   (4)\t (5)   (6)   (7)");

        for (int i = 0 ; i < T.length ; i++){
            System.out.print("("+Ca[i]+")  ");
            //System.out.print("("+i+")  ");
            for (int j = 0 ; j < T.length ; j++ ){
                if (T[i][j]<10){
                    System.out.print("[ "+T[i][j]+"  ]");
                }else{
                    System.out.print("[ "+T[i][j]+" ]");
                }
            }
            System.out.println();
        }
    }
}

