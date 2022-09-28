//What is data types? List out it’s types. WAP to Print out a persons name, age, 
//height, gender and is that person below age 18 using different variable types.


package assignment2;
import java.util.Scanner;
public class datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        
        System.out.println("enter age: ");
        int age = sc.nextInt();
        
        System.out.println("Enter height: ");
        float height = sc.nextFloat();
        
        System.out.println("Enter Gender: ");
        char gender = sc.next().charAt(0);
        
        if(age<18){
            System.out.println("Below 18");
        }
            
            else{
                    System.out.println("Not valid");
        }
        
    }
}
