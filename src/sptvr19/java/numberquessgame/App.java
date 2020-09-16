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
        
        System.out.print("\n\nInput the maximum: ");
        max_number = scan.nextInt();

        System.out.print("\nYou can not set the negative maximum! ");
 
        int quessed_number = rand.nextInt(max_number);
        System.out.println("\nNumber is quessed!");
        System.out.println("---------------------");
        
        int your_number;
        int attempts = 1;
        
        while(true) {
            
            System.out.print("\nInput your number: ");
            your_number = scan.nextInt();
            
            if (your_number < quessed_number) {
                System.out.println("Quessed number is bigger than inputed!");
                attempts += 1;
                continue;
            } else if (your_number > quessed_number) {
                System.out.println("Quessed number is smaller than inputed!");
                attempts += 1;
                continue;
            } else {
                System.out.println("\n ~~~ Congratulations! You guessed it! ~~~");
                System.out.println("Attempts done: " + attempts);
                break;
            }
            
        }
    }
    
}
