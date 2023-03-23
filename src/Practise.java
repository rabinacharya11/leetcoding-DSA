import java.util.Scanner;


public class Practise {

    public static void main(String[] args) {
    System.out.print( solution(121)  );


    }


    static boolean solution(int number) {
        int inputNumber = number ;

        int reversedNumber = 0 ;

         while(number!=0) {

            int remainder = number%10;
            number  = number/10;

            reversedNumber = reversedNumber * 10 + remainder ;
        }


         if(reversedNumber == inputNumber) {
             return  true;
         }
         return false ;
    }
}
