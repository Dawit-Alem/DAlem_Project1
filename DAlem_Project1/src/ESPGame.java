/* 
 Class: CMSC 203 CRN 22824
 Program: Assignment #1
 Instructor: Prof. Ahmed Tarek
 Summary of Description: a program that tests ESP (extrasensory perception) game
 Due Date: 09/10/2024 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Student’s Name: Dawit Alem
*/

// import Scanner and Random class
import java.util.Scanner;
import java.util.Random;

public class ESPGame {
	public static void main(String[] args) {
		
        // Define color constants (7 different colors)
        final String RED = "Red";
        final String GREEN = "Green";
        final String BLUE = "Blue";
        final String ORANGE = "Orange";
        final String YELLOW = "Yellow";
        final String PURPLE = "Purple";
        final String PINK = "Pink";
        
        Scanner scanner = new Scanner(System.in); // Creating scanner object for user input
        Random random = new Random(); // Creating random object to generate random numbers
        
        // Prompt user for personal information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your M#: ");
        String mNumber = scanner.nextLine();
        System.out.print("Describe yourself: ");
        String describeYourSelf = scanner.nextLine();
        System.out.print("Enter Due Date: ");
        String dueDate = scanner.nextLine();
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");

        int totalRounds = 11; // Set the number of rounds to 11
        int correctGuesses = 0; // Set correct guesses to 0
        
        for (int n = 1; n <= totalRounds; n++) {
            // Generate a random number to select a color (between 1 and 7)
            int colorIndex = random.nextInt(7) + 1;
            String selectedColor = "";

            // Map the random number to the color constant
            switch (colorIndex) {
                case 1:
                    selectedColor = RED;
                    break;
                case 2:
                    selectedColor = GREEN;
                    break;
                case 3:
                    selectedColor = BLUE;
                    break;
                case 4:
                    selectedColor = ORANGE;
                    break;
                case 5:
                    selectedColor = YELLOW;
                    break;
                case 6:
                    selectedColor = PURPLE;
                    break;
                case 7:
                    selectedColor = PINK;
                    break;
            }
            
            // Ask the user to guess the color by entering a color name
            System.out.println("Round " + n + "\n\nI am thinking of a color.");
            System.out.print("Is it Red, Green, Blue, Orange, Yellow, Purple, or Pink?\nEnter Your guess: ");
            String userGuess = scanner.nextLine(); // Since the input is one word .trim() is not necessary

            // Validate the user's input
            if (userGuess.toLowerCase().equals(selectedColor.toLowerCase())) {
                System.out.println("Correct! I was thinking of " + selectedColor + ".");
                correctGuesses++;  // Increment correct guesses by 1
            } else {
                System.out.println("Wrong! You entered incorrect color. I was thinking of " + selectedColor + ".");
            }
        }

        // Display the results
        System.out.println("\nGame Over!\n\n");
        System.out.println("You guessed " + correctGuesses + " out of " + totalRounds + " correctly.");

        // Display the user's personal information and favorite color
        System.out.println("\nStudent Name: " + name);
        System.out.println("M#: " + mNumber);
        System.out.println("User Description: " + describeYourSelf);
        System.out.println("Due Date: " + dueDate);
    
        
	}
}
