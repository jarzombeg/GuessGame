package com.company;

class GuessGame { // GuessGame has three instances variables for three Player objects
    com.company.Player p1;
    com.company.Player p2;
    com.company.Player p3;

    public void startGame() { // Create three Player objects and assign them to the three Player instance variables
        p1 = new com.company.Player();
        p2 = new com.company.Player();
        p3 = new com.company.Player();

        int guessp1 = 0; // Declare three variables to hold the three guesses the Player make
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false; // Declare three variables to hold true of false based on the player's answer
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targerNumber = (int) (Math.random()) * 10; // Make target number the players have to guess
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targerNumber);

            p1.guess(); // Call each player's guess() method
            p2.guess();
            p3.guess();

            guessp1 = p1.number; // Get each player's guess (the result of their guess() method running) by accessing the number variable of each player
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targerNumber) { // Check each player's guess to see if it matches the target number. If a player is right, them set that player's variable to be true (remember, we set if false by default)
                p1isRight = true;
            }

            if (guessp2 == targerNumber) {
                p2isRight = true;
            }

            if (guessp3 == targerNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) { // If player one or player two or player three is right,...

                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break;
            } else { // Otherwise,stay in the loop and ask for another guess
                System.out.println("Players will have to try again");
            }
        }
    }
}

class Player {
    int number = 0; //where the guess goes

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}

class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}