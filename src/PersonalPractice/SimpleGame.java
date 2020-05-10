package PersonalPractice;

import java.util.Scanner;

public class SimpleGame {

    int [] locationCells;
    int numOfHits = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleGame game = new SimpleGame();
        int[] locations = {2,3,4};
        game.setLocationCells(locations);

        while(game.getNumOfHits() < 3) {
            System.out.println("Guess location: ");
            String userGuess = input.nextLine();
            String result = game.checkYourself(userGuess);
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
