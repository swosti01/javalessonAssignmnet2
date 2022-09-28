
//2. What is operator? List out its types. WAP to find addition, subtraction, 
//multiplication, division, reminder and greater number, input by user.
//Reference:https://www.w3schools.com/java/java_operators.asp

package assignment2;
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        int a,b,sum,substraction,multiplication,remainder ;
        float division;
        
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        a = sn.nextInt();
        b = sn.nextInt();
        
        //for sum
        sum = a+b;
        
        //For subtracting
        substraction = a-b;
        
        //for multiplication
        multiplication = a*b;
        
        //for division
        division = a/b;
        
        //for remainder
        remainder= a%b;
        
        System.out.println("Sum : " +sum);
        System.out.println("Substraction: " +substraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division : " + division);
        System.out.println("Remainder: " + remainder);
        
        if(a>b){
            System.out.println("Greater number is " +a);
        }
        
        else{
            System.out.println("Greater nember is " +b);
        }
        
        
    }
    
}
