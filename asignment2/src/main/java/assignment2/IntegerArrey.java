
package assignment2;

import java.util.Scanner;
public class IntegerArrey {
    public static void main(String[] args) {
        int a=0,i=0;
        Scanner sn = new Scanner(System.in);
        int arr[] = new int [5];
        System.out.println("Enter " + arr.length + "integer values: ");
        for( i= 0;i<arr.length;i++){
            arr[i] = sn.nextInt();
        }
        //For Display
        System.out.println("Array elemnts are: ");
        for( a =0;a<arr.length;a++){
            System.out.println(arr[a]);
        }
        
    }
    
}
