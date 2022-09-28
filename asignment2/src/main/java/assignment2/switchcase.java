//4. WAP to ask gender from user. Use if…else condition to print if that 
//use is male, female, gay, lesbian or invalid.
//Reference:  https://www.w3schools.com/java/java_conditions.asp

package assignment2;

import java.util.Scanner;
public class switchcase {
     public static void main(String[] args) {
         String  gender;
         Scanner sn = new Scanner(System.in); 
         
         
//        
         System.out.println("Enter the gender: ");
         gender = sn.nextLine();
         
         

 //String gender;
       // Scanner scan = new Scanner(System.in);

//        System.out.println("What is your gender, male of female?");
//        gender = scan.nextLine();


        if(gender.equals("m"))
        {
            System.out.println("A Memale" );
        }
        else if(gender.equals("f"))
        {
            System.out.println("A Female.");
        }
        else if( gender.equals("l")){
            System.out.println("Lasbin");
        }
        else if(gender.equals("g")){
            System.out.println("Gay");
        }
        else{
            System.out.println("Invalid");
        }
    }
         
         
    }

