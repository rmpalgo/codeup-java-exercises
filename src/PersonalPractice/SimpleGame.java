package PersonalPractice;

public class SimpleGame {

    int [] locationCells;
    int numOfHits = 0;

    public static void main(String[] args) {

    }

    public void setLocationCells(int [] locs) {
        this.locationCells = locs;
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
