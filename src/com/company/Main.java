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
        for (int i = 0; i < 10; i++) {
            Random rn = new Random();
            Scanner sc = new Scanner(System.in);
            int userTurn = sc.nextInt();
            int copmTurn = rn.nextInt(3) + 1;
            gameCount++;
            System.out.println("yuo");
            if (userTurn == rock.getValue() && copmTurn == rock.getValue() || userTurn == paper.getValue() && copmTurn == paper.getValue() || userTurn == scissors.getValue() && copmTurn == scissors.getValue()) {
                drawCount++;
            }
            if (userTurn == paper.getValue() && copmTurn == rock.getValue() || userTurn == scissors.getValue() && copmTurn == paper.getValue() || userTurn == rock.getValue() && copmTurn == scissors.getValue()) {
                userCount++;
            }
            if (userTurn == scissors.getValue() && copmTurn == rock.getValue() || userTurn == paper.getValue() && copmTurn == scissors.getValue() || userTurn == rock.getValue() && copmTurn == paper.getValue()) {
                compCount++;
            }
        }

    }
}
