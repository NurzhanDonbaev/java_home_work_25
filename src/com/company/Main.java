package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("To select easy level press 1, for hard level press 2");
        Scanner sc = new Scanner(System.in);
        try {
            int userChois = sc.nextInt();
            if (userChois == 1) {
                getGame();
            }
            if (userChois == 2) {
                getHardGame();
            } else {
                System.out.println("Sorry game has only 2 levels");
            }
        } catch (InputMismatchException e) {
            System.out.println("Possible enter only number format, try again please!");
        }
    }

    public static void getHardGame() {
        Hand rock = Hand.ROCK;
        Hand paper = Hand.PAPER;
        Hand scissors = Hand.SCISSORS;
        Hand lizard = Hand.LIZARD;
        Hand spock = Hand.SPOCK;
        int userCount = 0;
        int compCount = 0;
        int drawCount = 0;
        int percent = 0;
        int gameCount = 0;
        String format = "| %-7s | %-8s | %-9s | %15s | %9s |";
        for (int i = 0; i < 10; i++) {
            Random rn = new Random();
            System.out.println("1 - Rock, 2 - Paper, 3 - Scissors, 4 - Lizard, 5 - spock");
            System.out.print("Please select your turn: ");

            try {
                Scanner sc = new Scanner(System.in);
                int userTurn = sc.nextInt();
                int compTurn = rn.nextInt(5) + 1;
                System.out.print("Your turn is ");
                switch (userTurn) {
                    case 1:
                        System.out.println(rock.getName());
                        break;
                    case 2:
                        System.out.println(paper.getName());
                        break;
                    case 3:
                        System.out.println(scissors.getName());
                        break;
                    case 4:
                        System.out.println(lizard.getName());
                        break;
                    case 5:
                        System.out.println(spock.getName());
                        break;
                    default:
                        System.out.println("Wrong case");
                        break;
                }
                System.out.print("Computer selected:  ");
                if (compTurn == 1) {
                    System.out.println(rock.getName());
                }
                if (compTurn == 2) {
                    System.out.println(paper.getName());
                }
                if (compTurn == 3) {
                    System.out.println(scissors.getName());
                }
                if (compTurn == 4) {
                    System.out.println(lizard.getName());
                }
                if (compTurn == 5) {
                    System.out.println(spock.getName());
                }
                gameCount++;
                if (userTurn == rock.getV() && compTurn == rock.getV()
                        || userTurn == paper.getV() && compTurn == paper.getV()
                        || userTurn == scissors.getV() && compTurn == scissors.getV()
                        || userTurn == lizard.getV() && compTurn == lizard.getV()
                        || userTurn == spock.getV() && compTurn == spock.getV()
                ) {
                    drawCount++;
                }
                if (userTurn == paper.getV() && compTurn == rock.getV()
                        || userTurn == paper.getV() && compTurn == spock.getV()
                        || userTurn == scissors.getV() && compTurn == paper.getV()
                        || userTurn == scissors.getV() && compTurn == lizard.getV()
                        || userTurn == rock.getV() && compTurn == scissors.getV()
                        || userTurn == rock.getV() && compTurn == lizard.getV()
                        || userTurn == spock.getV() && compTurn == scissors.getV()
                        || userTurn == spock.getV() && compTurn == rock.getV()
                        || userTurn == lizard.getV() && compTurn == spock.getV()
                        || userTurn == lizard.getV() && compTurn == paper.getV()
                ) {
                    userCount++;
                } else {
                    compCount++;
                }
                percent = ((userCount * 100) / gameCount);
                getHeader1();
                String view = String.format(format, userCount, compCount, drawCount, gameCount, percent + " %");
                System.out.println(view);
                getHeader2();
            } catch (InputMismatchException e) {
                System.out.println("Possible enter only number format, try again please!");
            }
        }
    }

    public static void getGame() {
        Hand rock = Hand.ROCK;
        Hand paper = Hand.PAPER;
        Hand scissors = Hand.SCISSORS;
        int userCount = 0;
        int compCount = 0;
        int drawCount = 0;
        int percent = 0;
        int gameCount = 0;
        String format = "| %-7s | %-8s | %-9s | %15s | %9s |";
        for (int i = 0; i < 10; i++) {
            Random rn = new Random();
            System.out.println("1 - Rock, 2 - Paper, 3 - Scissors");
            System.out.print("Please select your turn: ");

            try {
                Scanner sc = new Scanner(System.in);
                int userTurn = sc.nextInt();
                int compTurn = rn.nextInt(3) + 1;
                System.out.print("Your turn is ");
                switch (userTurn) {
                    case 1:
                        System.out.println(rock.getName());
                        break;
                    case 2:
                        System.out.println(paper.getName());
                        break;
                    case 3:
                        System.out.println(scissors.getName());
                        break;
                    default:
                        System.out.println("Wrong case");
                        break;
                }
                System.out.print("Computer selected:  ");
                if (compTurn == 1) {
                    System.out.println(rock.getName());
                }
                if (compTurn == 2) {
                    System.out.println(paper.getName());
                }
                if (compTurn == 3) {
                    System.out.println(scissors.getName());
                }
                gameCount++;
                if (userTurn == rock.getV() && compTurn == rock.getV() || userTurn == paper.getV() && compTurn == paper.getV() || userTurn == scissors.getV() && compTurn == scissors.getV()) {
                    drawCount++;
                }
                if (userTurn == paper.getV() && compTurn == rock.getV() || userTurn == scissors.getV() && compTurn == paper.getV() || userTurn == rock.getV() && compTurn == scissors.getV()) {
                    userCount++;
                }
                if (userTurn == scissors.getV() && compTurn == rock.getV() || userTurn == paper.getV() && compTurn == scissors.getV() || userTurn == rock.getV() && compTurn == paper.getV()) {
                    compCount++;
                }
                percent = ((userCount * 100) / gameCount);
                getHeader1();
                String view = String.format(format, userCount, compCount, drawCount, gameCount, percent + " %");
                System.out.println(view);
                getHeader2();
            } catch (InputMismatchException e) {
                System.out.println("Possible enter only number format, try again please!");
            }
        }
    }

    public static void getHeader1() {
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("|   Won   |   Lose   |   Draws   |   Total Games   |   Win %   |");
        System.out.println("|--------------------------------------------------------------|");
    }

    public static void getHeader2() {
        System.out.println("+--------------------------------------------------------------+");
    }
}
