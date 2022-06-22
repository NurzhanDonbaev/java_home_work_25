package com.company;

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
            Scanner sc = new Scanner(System.in);
            int userTurn = sc.nextInt();
            int copmTurn = rn.nextInt(3) + 1;
            System.out.print("Your turn is ");
            if (userTurn == 1) {
                System.out.println(rock.getName());
            }
            if (userTurn == 2) {
                System.out.println(paper.getName());
            }
            if (userTurn == 3){
                System.out.println(scissors.getName());
            }
            System.out.print("Computer selected:  ");
            if (copmTurn == 1) {
                System.out.println(rock.getName());
            }
            if (copmTurn == 2) {
                System.out.println(paper.getName());
            }
            if (copmTurn == 3){
                System.out.println(scissors.getName());
            }
            gameCount++;
            if (userTurn == rock.getValue() && copmTurn == rock.getValue() || userTurn == paper.getValue() && copmTurn == paper.getValue() || userTurn == scissors.getValue() && copmTurn == scissors.getValue()) {
                drawCount++;
            }
            if (userTurn == paper.getValue() && copmTurn == rock.getValue() || userTurn == scissors.getValue() && copmTurn == paper.getValue() || userTurn == rock.getValue() && copmTurn == scissors.getValue()) {
                userCount++;
            }
            if (userTurn == scissors.getValue() && copmTurn == rock.getValue() || userTurn == paper.getValue() && copmTurn == scissors.getValue() || userTurn == rock.getValue() && copmTurn == paper.getValue()) {
                compCount++;
            }
            percent = ((userCount * 100) / gameCount);
            getHeader1();
            String view = String.format(format, userCount, compCount, drawCount, gameCount, percent + " %");
            System.out.println(view);
            getHeader2();
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
