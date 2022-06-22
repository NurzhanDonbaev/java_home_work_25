package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getGame();
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
                if (userTurn == rock.getValue() && compTurn == rock.getValue() || userTurn == paper.getValue() && compTurn == paper.getValue() || userTurn == scissors.getValue() && compTurn == scissors.getValue()) {
                    drawCount++;
                }
                if (userTurn == paper.getValue() && compTurn == rock.getValue() || userTurn == scissors.getValue() && compTurn == paper.getValue() || userTurn == rock.getValue() && compTurn == scissors.getValue()) {
                    userCount++;
                }
                if (userTurn == scissors.getValue() && compTurn == rock.getValue() || userTurn == paper.getValue() && compTurn == scissors.getValue() || userTurn == rock.getValue() && compTurn == paper.getValue()) {
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
