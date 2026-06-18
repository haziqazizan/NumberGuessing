package game;
import java.util.Random;
import java.util.Scanner;

import gameUi.GameUi;

public class numberGuessing {
    private int target;
    private int difficulty;
    private int chances;

    public final int [] CHANCES = {10,5,3};

    private final GameUi game = new GameUi();
    
    public void start(){
        do{
            target = (int) (Math.random()*100) + 1;
            
            game.showWelcome();
            difficulty = game.askDifficulty();
            chances = CHANCES[difficulty];
            playGame();
        } while(game.askAgain());
        System.out.println("Thank You ! Bye ~");
    }
 
    public void playGame(){
        while(chances>0){
            int guess = game.askGuess();

            if(checkGuess(guess)){
                game.showWin(chances);
                return;
            }

            chances -- ;
        }

        game.showLose(target);


    }
    
    public boolean checkGuess(int guess){
        if(guess > target){
            game.showLower(guess);
            return false;
        } else if(guess < target){
            game.showHigher(guess);
            return false;
        } else {
            return true;
        }
    }
}
