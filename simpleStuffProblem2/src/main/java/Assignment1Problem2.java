import java.util.Scanner;

/**
 * Daniel Ghita
 * February 6 2022
 */
public class Assignment1Problem2 {
    public static void main(String args[]) {
        
    Scanner Obj = new Scanner(System.in);
    
    System.out.println("Insert Radius:");
    double radius = Obj.nextDouble(); //INPUT RADIUS HERE
    System.out.println("\nInsert Height:");
    double height = Obj.nextDouble(); //INPUT HEIGHT HERE
    double pi = Math.PI;
    
    double slant = Math.sqrt(Math.pow(radius,2) + Math.pow(height, 2));
    
    double volume = (double) Math.round(((pi * Math.pow(radius, 2) * height) / 3) * 100.0)/100.0; //calculates volume and rounds to 2 decimal places
    double surfaceArea = (double) Math.round(((pi * Math.pow(radius, 2)) + (pi * radius * slant)) * 100.0) /100.0; //calculates surface area and rounds to 2 decimal places
    
    System.out.println("\nCalculated Surface Area: " + surfaceArea);
    System.out.print("Calculated Volume: " + volume);
    }
}
