package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {


        boolean running = true;
        while(running) {
            System.out.println(returnMenuDisplay());
            int response = promptUserForChoice();
            running = executeUserChoice(response);

        }

    }

    private static String returnMenuDisplay() {
        String choices = "What woud you like to do?\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";
        return choices;
    }

    private static int promptUserForChoice() {
        Input input = new Input();
        System.out.println("Enter your choice: ");
        return input.getInt(0, 5);
    }

    private static boolean executeUserChoice(int choice) {
        boolean continueRunningApp = true;

        switch (choice) {
            case 0:
                continueRunningApp = false;
                break;
            case 1:
                System.out.println("\n");
                for(Movie movie: MoviesArray.findAll()) {
                    System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                }
                System.out.println("\n");
                break;
        }
        return continueRunningApp;
    }

}
