
package pkg1.hafta.trianle;

import java.util.Scanner;



public class HaftaTrianle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Base of trianle: ");
        int b = input.nextInt();
        
         System.out.println("Enter Rise of trianle: ");
        int r = input.nextInt();
        
       double m = 0.5 *b*r;
       
        System.out.println("The area is: " + m);
      
    }
    
}
