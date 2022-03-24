public class if_else{
    public static void main(String[] args){
        int a= -8, b= -2, c= -6 ;

        //we want find which is begger number
        // if(a>b && a>c){
        //     System.out.println("a is the bigger number: "+a);
        // }
        // if(b>a && b>c){
        //     System.out.println("b is the bigger number : "+b);
        // }
        // else{
        //     System.out.println("c is the bigger number : " + c);
        // }

        //if can be used any time or it will be present with else also
        //but without if, else is not present;

        //Efficient code using if_else 
        if(a>b){
            if(a>c){
                //a is largest
                System.out.println("a is the largest :"+a);
            }else{
                //c is the largest
                System.out.println("c is the largest : "+c);
            }
        }else{
            if(b>c){
                System.out.println("b is the largest :"+b);
            }else{
                System.out.println("c is the largest : "+c);
            }
        }

    }
}