package movies;

import util.Input;

public class MoviesApplication extends MoviesArray {
    static Input input = new Input();
    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        boolean userContinue = true;
        do {
            System.out.println("Which movie action do you want to take?\n\n0-exit\n1-view movies in the animated category\\3 - view movies in the drama category\\n4 - view movies in the horror category\\n5 - view movies in the sci-fi category\\n6 - add a new movie\\n");
            System.out.println("Enter your choice: ");

                int userInput = input.getInt(0,6);

                if(userInput ==0) {
                    System.out.println("Thanks, Good");
                    System.exit(1);
                } else if (userInput ==1) {
                    for (Movie movie: movies) {
                        System.out.println(movie.getCategory() + "--" + movie.getName());
                    }
                } else if(userInput ==2) {
                    for (Movie movie : movies) {
                        if(movie.getCategory().equals("animated")) {
                            System.out.println(movie.getCategory() + "--" + movie.getName());
                        }
                    }
                } else if (userInput == 3) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getCategory() + " -- " + movie.getName());
                        }
                    }
                } else if (userInput == 4) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getCategory() + " -- " + movie.getName());
                        }
                    }
                } else if (userInput == 5) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getCategory() + " -- " + movie.getName());
                        }
                    }
                } else if (userInput ==6) {
                    System.out.println("Add new movie:\n");
                } else {
                    System.out.println("Try another option");
                }

          //  System.out.println("will you like to continue [Y/N]");
               // userContinue = input.yesNo();

        }while (userContinue);
    }


}
