//WAP to find maximum, minimum, square root, absolute 
//and random number using a math class.
package assignment2;

//import java.util.Scanner;
public class mathclass {
    public static void main(String[] args) {
        int x = 5,y = 10;
        
//        Scanner sn = new Scanner(System.in);
//        System.out.println("Enter the numbers: ");
//        
        //for maximum number
        System.out.println("Maximum number is : " + Math.max(x,y));
        
        //for minimum
        System.out.println("Minimum number is : " + Math.min(x,y));
        
        //For squareroot 
        System.out.println("Square root of x is : " + Math.sqrt(x));
        
        System.out.println("Square root of y is : " +Math.sqrt(y));
        
        //for absolute value
        System.out.println("Absolute value of x is : " + Math.abs(x));
        
        System.out.println("Absolute value of y is : " + Math.abs(y));
        
        System.out.println("Absolute value of (-100) is : " +Math.abs(-100));
        
        //for random number 
        System.out.println("Random Number of is : " + Math.random());
    }
}

