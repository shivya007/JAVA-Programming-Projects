import java.util.*;
public class NumberGame{
    static Scanner sa = new Scanner(System.in);
    public static void Game(){
        // here, random class is used to generate the random number
        Random num = new Random();
        int generated = Math.abs(num.nextInt(100))+1;


        // now its chance of user to guess the number from 1 to 100
        System.out.println("Generate a pseudo-random integer within the range of 1 to 100: ");
        int number = sa.nextInt();
        // first check for the invalid case:
        if(number > 100 || number < 1){
            System.out.println("Input validation failed.");
        }
        // if number is valid then we will go to find the generated number
        else{
            int k = 7;    // number of attempts
            int i = 0;
            int count = 0;  // it counts number of attempts in which user found the generated number correctly
            for( i = 0; i < k-1; i++){
                if(number == generated ){
                    count++;
                    System.out.println("Congratulations, you have successfully identified the correct number.");
                    System.out.println();
                    System.out.println("Your total score based on the number of attempts: "+count);
                    break;
                }
                else if(number < generated){
                    count++;
                System.out.println("Generated number is greater than the "+number);
                System.out.println("Guess the number again");
                number = sa.nextInt();
                }
                else if(number > generated){
                    count++;
                System.out.println("Generated number is lesser than the "+ number);
                System.out.println("Guess the number again");
                number = sa.nextInt();
                }
            }
            // it is the condition when user only have one chance to guess the correct number
            if(i == k-1){
                if(number == generated){
                    count++;
                     System.out.println("Congratulations, you have successfully identified the correct number.");
                    System.out.println("Your total score based on the number of attempts: "+count);
                    return;
                }
                // now, all the chances are finished, it's time to tell the right generated number
                else{
                System.out.println("Your all chances are caught up: ");
                System.out.println("Generated number is: "+generated);
                return;
                }
            }
        }
    }
    public static void main(String args[]){
        Game();
        System.out.println("Press 1 to play this game again or Press 0 to exist: ");
        int user = sa.nextInt();
        if(user == 1){
            Game();
        }
        else{
            System.out.println("Invalid input");
            return;
        }
        sa.close();
    }
}