// 1. You've to count the number of digits in a number.
// 2. Take as input "n", the number for which the digits has to be counted.
// 3. Print the digits in that number.
import java.util.*;
public class count_digit{
    public static void main(String[] args){

        // for input
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //9453

        int count = 0;
        // //while condition jb tk
        // while( n != 0){
        //     n = n/10;//945/94//9/0
        //     count++;//1/2/3/4
        // }

        // using for loop condition
        // for(  ; n != 0 ;  ){
        //     n = n/10;
        //     count++;
        // }

        for(  ; n !=0 ; n = n/10, count ++){
            
        }

    

        System.out.println(count);


    }
}