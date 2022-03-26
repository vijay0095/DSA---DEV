// for loop codition
// for( starting point ; end point ; steps)
// starting or initialisation will run only first time

// for example we want to print hello 5 times using this

import java.util.*;
public class for_loop{
    public static void main(String[] args){

        // for(int i = 1; i<= 5; i++){ // i = i+1
        //     System.out.println("Hello " + i);
        // }

//question 1
        // for(int i = 1; i<= 10; i = i+3){// here i is the controlling variable
        //     System.out.print(i + " ");
        // }



        // check for output for this
        //question1
        // for(int i = 0; i<=10; i = i*1){
        //     System.out.print(i +" ");
        // }
        //output is --> infinite loop


// //question2
// for(int j = 1, i =5; j<= 20; i = i+j , j = i){
//     System.out.print(i+" ");
// }
// // output is 5 6 12

// //question 3
//        int i = 1;
//        for(i = i +1; i<=10 ; i = i+2){
//            System.out.print(i+" ");
//            i = i-1;
//        }
//        //output is 2 3 4 5 6 7 8 9 10

//question 4 : write a code to sum up to 100

int sum = 0;
for(int i= 1; i<=100; i++){
    sum = sum + i;
}
System.out.println(sum);
// here interveiwer will play.. by using that for loop but we have to
// do by won basas without thing any untill no mention
// used formula n(n+1)/2
int n = 100;
System.out.print(n*(n+1)/2);
    }
}