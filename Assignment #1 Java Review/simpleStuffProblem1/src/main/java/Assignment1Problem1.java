import java.util.Scanner;

/**
 * Daniel Ghita
 * February 4 2022
 */
public class Assignment1Problem1 {
    public static void main(String args[]) {
        Scanner Obj = new Scanner(System.in);
        
        System.out.println("Insert Room Length: ");
        double length = Obj.nextDouble(); //INPUT LENGTH OF ROOM
        
        System.out.println("\nInsert Room Width: ");
        double width = Obj.nextDouble(); //INPUT WIDTH OF ROOM
        
        System.out.println("\nInsert Room Height: ");
        double height = Obj.nextDouble(); //INPUT HEIGHT OF ROOM
        
        System.out.println("\nInsert Door Width: ");
        double widthdoor = Obj.nextDouble(); //INPUT WIDTH OF DOOR
        
        System.out.println("\nInsert Door Height: ");
        double heightdoor = Obj.nextDouble(); //INPUT HEIGHT OF DOOR
        
        System.out.println("\nInsert Window #1 Width: ");
        double widthwindow1 = Obj.nextDouble(); //INPUT WIDTH OF WINDOW #1
        
        System.out.println("\nInsert Window #1 Height: ");
        double heightwindow1 = Obj.nextDouble(); //INPUT HEIGHT OF WINDOW #1
        
        System.out.println("\nInsert Window #2 Width: ");
        double widthwindow2 = Obj.nextDouble(); //INPUT WIDTH OF WINDOW #2
        
        System.out.println("\nInsert Window #2 Height: ");
        double heightwindow2 = Obj.nextDouble(); //INPUT HEIGHT OF WINDOW #2
        
        double wall1 = width * height * 2;
        double wall2 = length * height * 2;
        
        double door = widthdoor * heightdoor;
        
        double window1 = widthwindow1 * heightwindow1;
        double window2 = widthwindow2 * heightwindow2;
        
        double totalarea = (((wall2 + wall1) - door) - window1) - window2;
        
        double cans = (double) (totalarea / 40.0);
        double cansNum = Math.ceil(cans);
        
        double total = cansNum * 52.75;
        
        System.out.print("\nTotal Cost: $" + total + "\n\n");
    }
}
