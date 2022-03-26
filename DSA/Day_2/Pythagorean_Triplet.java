// 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
// 2. Take as input three numbers a, b and c.
// 3. Print true if they can form a pythagorean triplet and false otherwise.

import java.util.*;
public class Pythagorean_Triplet{
    public static void main(String[] args){

        //for taking input
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if(a*a == b*b + c*c || c*c == a*a + b*b || b*b == c*c + a*a ){
            System.out.println("true");
        }else{
            System.out.println("false");   
        }
    }
}