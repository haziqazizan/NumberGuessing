package gameUi;

import java.util.Scanner;

public class GameUi{
    private Scanner sc = new Scanner(System.in);

    private String[] level = {"Easy","Medium","Hard"};

    public void showWelcome(){
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number from 1 and 100");
    }

    public int askDifficulty(){

        System.out.println("\nChoose Difficulty:");
        
        for(int i = 0;i<level.length;i++){
            System.out.println((i+1)+"- "+ level[i]);
        }

        int choice;

        while(true){
            System.out.print("Enter Choice: ");
            choice = sc.nextInt()-1;

            if(choice>=0 && choice<level.length){
                return choice;
            }

            System.out.println("Invalid choice, try again");
        }
    }

    public boolean askAgain(){
        System.out.println("\nDo you want to play again ? ");

        int choice;

        while(true){

            System.out.println("1 - Yes");
            System.out.println("2 - No");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            while(choice>0 && choice<3){
                if(choice==1){
                    return true;
                }
                return false;
            }

            System.out.println("Invalid Choice !");
        }
    }

    public int askGuess(){
        System.out.print("Enter your guess: ");
        return sc.nextInt();
    }

    public void showHigher(int guess){
        System.out.println("Number is higher than "+guess);
    }

    public void showLower(int guess){
        System.out.println("Number is lower than "+guess);
    }

    public void showWin(int chancesLeft){
        System.out.println("You Win! chances left "+chancesLeft);
    }

    public void showLose(int number){
        System.out.println("You Lost! The number was: "+number);
    }
}