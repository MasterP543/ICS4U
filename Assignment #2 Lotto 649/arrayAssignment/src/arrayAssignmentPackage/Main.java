/*
A collaborative project by Daniel Ghita and Cameron Waltenbury, using IntelliJ Ultimate's Code With Me feature
Started on February 24, 2022
Finished on February 27, 2022
*/

package arrayAssignmentPackage;

import java.util.Scanner; //Used to allow user input into the application
import java.util.Random; //Used to randomly generate the lottery ticket numbers
import java.util.Arrays; //Used for .deepToString and .toString in order to properly show the array elements

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random(); //Initializes Round Method
        Scanner Obj = new Scanner(System.in); //Initializes Scanner Method

        System.out.println( "Enter The Total Number Of Tickets To Generate:");
        int totalNumTickets = Obj.nextInt(); //Allows user to input an integer value to the console

        int numOfMatches3 = 0;
        int tickCol = 6; //is 6 because there is 6 sets of numbers in the 649
        int[][] randomTickets = new int[totalNumTickets][tickCol]; //next lines initialise the arrays, this one stores the random values of how many tickets you input
        int[] winningTicket = new int[tickCol]; //Array to Store the winning numbers
        int[] numOfMatches = new int[totalNumTickets];

        for (int row = 0; row <= totalNumTickets - 1; row++) { //Goes through each element of the 2D array and assigns a random value between 1 and 49 to each
            for (int col = 0; col <= tickCol - 1; col++) {
                randomTickets[row][col] = rnd.nextInt((49 - 1) + 1) + 1;
            }
        }

        System.out.println("Generated Tickets: " + Arrays.deepToString(randomTickets)); //if double array use .deepToString, this outputs the number tickets in a clear and concise way.


        for (int i = 0; i < winningTicket.length; i++) { // This goes through the 6 numbers in the winning ticket and randomises them
            int randomNum = rnd.nextInt((49 - 1) + 1) + 1;
            winningTicket[i] = randomNum;
        }

        System.out.println("Winning Ticket: " + Arrays.toString(winningTicket)); //if single array use .toString, same as other system.out but for single arrays.

        for (int i = 0; i <= totalNumTickets - 1; i++) { //this part checks each element in the winning ticket to the random ones and tells gives you one in the section that is matching the winning
            int matches = 0; //Temporary value used to store the matches within the for loop
            for(int j = 0; j <= 5; j++) {
                if (winningTicket[0] == randomTickets[i][j]) {
                    matches++;
                }
                if (winningTicket[1] == randomTickets[i][j]) {
                    matches++;
                }
                if (winningTicket[2] == randomTickets[i][j]) {
                    matches++;
                }
                if (winningTicket[3] == randomTickets[i][j]) {
                    matches++;
                }
                if (winningTicket[4] == randomTickets[i][j]) {
                    matches++;
                }
                if (winningTicket[5] == randomTickets[i][j]) {
                    matches++;
                }
            }
            numOfMatches[i] = matches; //Commits each match to an array
        }

        System.out.println("# of Matches Found in Array: " + Arrays.toString(numOfMatches)); //This outputs the number of matches in each array, if one element matches it goes to one, if two it goes to two etc.

        for(int i = 0; i <= numOfMatches.length - 1; i++) {
            if (numOfMatches[i] == 3) {
                numOfMatches3++;
            }
        }
       System.out.println("# of 3 Matches Found in Array: " + numOfMatches3);


        for (int[] i : randomTickets) { //Outputs if a ticket is a winner (THIS WILL PROBABLY NOT HAPPEN BECAUSE IT IS 1 IN ~13M CHANCE)
            if (Arrays.equals(winningTicket, i)){
                System.out.println("There is a Winner!");
            }
        }
    }
}





/* Archive of code that didn't work:

        for (int row = 0; row <= totalNumTickets-1; row++) {
            for( int col=0; col <= tickCol-1; col++) {
                if (winningTicket[col] == randomTickets[row][col]) {
                    winner = true;

                    x++;
                    System.out.println(x);
                }
            }
        }

int[][] x = {{5, 5, 2}, {3, 8, 65},{2, 7, 4}};

int[] y = {2, 7, 4};

for (int[] i : x) {
  if (Arrays.equals(y, i)) {
    System.out.println("match");
  }
}

 */