package hypotenus_finder;

import java.util.Scanner;

public class Hypotenus_Finder {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double a, b, c;
        
        System.out.println("Finding the hypotenus. Please enter two sides");
        System.out.print("First side: ");
        a = input.nextDouble();
        System.out.print("Second side: ");
        b = input.nextDouble();
        c = Math.sqrt ((a*a)+(b*b));
        System.out.println("Hypotenuse is: "+ c);
        
        
      
    }
    
}
