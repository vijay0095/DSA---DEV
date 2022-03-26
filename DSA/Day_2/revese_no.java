// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line-wise, but in reverse order.

import java.util.*;
public class revese_no{
    public static void main(String[] args){
        //for input
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //reverse the number
        while(n != 0){
            int rem = n%10;// mod used for finding remindar
            System.out.println(rem);
            n = n/10;//  to decrease the number by one digit
        }
        
    }
}