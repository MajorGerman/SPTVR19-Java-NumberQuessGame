package sptvr19.java.numberquessgame;
import java.util.Random;
import java.util.Scanner;
        
class App {
    
    public void run() {
        System.out.println("||| Quess the Number! |||");
        System.out.println(" ||| by Georg Laabe |||");
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int max_number;
        int min_number;
        
        System.out.print("\n\nInput the minimum: ");
        min_number = scan.nextInt();    
        
        System.out.print("Input the maximum: ");
        max_number = scan.nextInt();
        
        System.out.print("\nInput the amount of tries: ");
        int tries = scan.nextInt();
 
        int quessed_number = rand.nextInt(max_number-min_number+1)+min_number;
        System.out.println("\nNumber is quessed!");
        System.out.println("---------------------");
        
        int your_number;
        int attempts = 1;
        
        do {
            
            System.out.print("\nInput your number: ");
            your_number = scan.nextInt();
            
            if (your_number < quessed_number) {
                System.out.println("Quessed number is bigger than inputed!");
                attempts += 1;
                tries -= 1;
            } else if (your_number > quessed_number) {
                System.out.println("Quessed number is smaller than inputed!");
                attempts += 1;
                tries -= 1;
            } else {
                System.out.println("\n ~~~ Congratulations! You guessed it! ~~~");
                System.out.println(" ~~~ Attempts done: " + attempts + " ~~~");
                break;
            }
            
        } while (tries > 0);
        
        if (tries <= 0) {
            System.out.println("\n ~~~ You lose! The quessed number was: " + quessed_number + " ~~~");
        }
    }
}
