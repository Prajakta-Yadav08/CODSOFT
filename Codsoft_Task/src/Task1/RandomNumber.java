/*Task_1 : Number Game

1.Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number.
You can incorporate additional details as follows:
5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.
*/


package Task1;
import java.util.Scanner;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int score = 0;
       int rounds = 0;
       
       do
       {
    	   int number = (int)(Math.random() *100 + 1);
    	   //rSystem.out.println(number);
    	   int attempts = 0;
    	    rounds++;
    	   
    	   System.out.println("Welcome to the Number Guessing Game!");
    	   
    	   System.out.println("Guess a Number between 1 and 100 :");
    	   int guess = sc.nextInt();
    	   
    	   do {
    	   if(guess == number){
    		   System.out.println("Congratulation , you guessed the number in " +attempts + "attempts!");
    		    score += attempts;
    		    break;
    		    
    	   }
    	   else if(guess < number) {
    		   System.out.println("Too low! Try again");
    	   }
    	   else {
    		   System.out.println("Too high! Try again.");
    		   
    	   }
    		   
    	   System.out.println("Enter the number again:");
    	   guess = sc.nextInt();
    	   attempts++;
    	   
    	   if(attempts >= 5) {
    		   System.out.println("Sorry,you ran out of attempts.The number was " +number);
    		   break;
    	   
    	   }
    	   }
    	   while(true);
    		   
    	   
    	   System.out.print("Do you want to play again?(y/n):");
    	   char playAgain = sc.next().charAt(0);
    	   if(playAgain !='y') {
    		   break;
    	   }
    	  
    	   }
    	   while(true);
    	   System.out.println("Thanks for playing! Your final score is " + score);
           sc.close();
       }
   }
      