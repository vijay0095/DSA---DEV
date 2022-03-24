// //Data type(primitive  data type)
// int -  number( not include decimal)
// char- a,b, c,$,&,#
// bollean - true/ false
// float- used for decimal
// double- decimal
// long- used for lager range number
// string - whatever you write in double cots ("") work as string

//variable syntax:  Data_type  variable_name

import java.util.*;
public class variable{
    public static void main(String[] args ){
        int V1;//decalartion 
        V1 = 12;// initialization
        
        int V2 = 10;
        // System.out.println(V1);
        
        int add = V1+V2;
        int mod = V1%V2;
        System.out.println("V1 : "+V1+" V2 : "+V2);
        System.out.println("Addition :" + add);
        System.out.println("Remindar :" + mod);// remindar 

        // = is assgin opertor, == is equality
        boolean isEven = (V1%2 == 0);
        System.out.println(isEven);

        //logical operator
        // and(&&) or(||) not(!=)


    }
}