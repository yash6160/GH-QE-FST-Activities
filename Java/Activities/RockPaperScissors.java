import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        
        int computerIndex = random.nextInt(3);
        String computerChoice = choices[computerIndex];

        
        System.out.println("Enter your choice (Rock, Paper, or Scissors): ");
        String userChoice = scanner.nextLine();

        
        System.out.println("Player chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);

        if(!(userChoice.equalsIgnoreCase(computerChoice))){
            System.out.print("Invalid input! Please enter Rock, Paper, or Scissors.");

        }
        else if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("Result: It's a Tie!");
        } 
        else if (
                (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
                ) {
            System.out.println("Result: Player Wins!");
        } 
        else if  (
                userChoice.equalsIgnoreCase("Rock") ||
                userChoice.equalsIgnoreCase("Paper") ||
                userChoice.equalsIgnoreCase("Scissors")
                ) {
            System.out.println("Result: Computer Wins!");
        } 
        

        
    }
   
}