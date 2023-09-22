import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] T = new int[8][8];
        int[] Ca = {1,2,3,4,5,6,7,8};
        int count = 0 ;
        boolean flag = true ;
        //int counter = 1;

//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                T[i][j] = counter;
//                counter++;
//            }
//        }
        String[][] Tb = {
                {"♖","♘","♙","♔","♕","♙","♘","♖"},
                {"♙","♙","♙","♙","♙","♙","♙","♙"},
                {"- "," -","-","-","-","-","-","-"},
                {" -"," -"," -","-","-","-","-","-"},
                {" -"," -"," -","-","-","-","-","-"},
                {" -"," -"," -","-","-","-","-","-"},
                {"♟","♟","♟","♟","♟","♟","♟","♟"},
                {"♜","♞","♝","♚","♛","♝","♞","♜"},
        };

//        for (int i = 0 ; i < Tb.length ; i++){
//            for (int j = 0 ; j < Tb.length ; j++ ){
//                System.out.print("[ "+(Tb[i][j])+" ]");
//            }
//            System.out.println();
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
        System.out.println("\t   (A)\t (B)   (C)\t (D)   (E)\t (F)   (G)   (H)");
        System.out.println("\t\t    (0)\t (1)   (2)\t (3)   (4)\t (5)   (6)   (7)");

        for (int i = 0 ; i < T.length ; i++){
            System.out.print("("+Ca[i]+")  ");
            System.out.print("("+i+")  ");
            for (int j = 0 ; j < T.length ; j++ ){
                if (flag == true)
                {
                    if (T[i][j]%2==0){
                        if (T[i][j]<10){
                            System.out.print("[ "+(T[i][j])+".  ]");
                        }else{
                            System.out.print("[ "+T[i][j]+". ]");
                        }
                    }else {
                        if (T[i][j]<10){
                            System.out.print("[ "+T[i][j]+"  ]");
                        }else{
                            System.out.print("[ "+T[i][j]+" ]");
                        }
                    }
                }else {
                    if (T[i][j]%2==0){
                        if (T[i][j]<10){
                            System.out.print("[ "+T[i][j]+"  ]");
                        }else{
                            System.out.print("[ "+T[i][j]+" ]");
                        }
                    }else {
                        if (T[i][j]<10){
                            System.out.print("[ "+T[i][j]+".  ]");
                        }else{
                            System.out.print("[ "+T[i][j]+". ]");
                        }
                    }
                }

                T[6][0] = 0 ;
                T[5][0] = 48 ;
                //T[7][1] = 0 ;
            }
            if (flag== true){
                flag = false ;
            }else {
                flag = true ;
            }
            System.out.println();
        }

        for(int i = 0 ; i < T.length * T.length ; i++ ){
            if (i%10 == 0)
            System.out.println("i = "+i);
        }




        System.out.println("♞ ♘ "+ T.length);
    }
}

