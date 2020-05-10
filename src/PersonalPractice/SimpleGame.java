package PersonalPractice;

import java.util.Scanner;

public class SimpleGame {

    private int [] locationCells;
    private int numOfHits = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleGame game = new SimpleGame();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        game.setLocationCells(locations);
        int numberOfGuesses = 0;

        boolean isAlive = true;


        while(isAlive) {
            numberOfGuesses++;
            System.out.println("Guess location: ");
            String userGuess = input.nextLine();
            String result = game.checkYourself(userGuess);

            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numberOfGuesses + " guesses");
            }
        }

    }

    public void setLocationCells(int [] locs) {
        this.locationCells = locs;
    }

    public int getNumOfHits() {
        return this.numOfHits;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int cell: locationCells) {
            if( guess == cell ) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }



}
