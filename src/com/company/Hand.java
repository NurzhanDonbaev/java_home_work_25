package com.company;

public enum Hand {
    ROCK(1, "Rock"),
    PAPER(2, "Paper"),
    SCISSORS(3, "Scissors"),
    LIZARD(4, "Lizard"),
    SPOCK(5, "Spock");

    private int value;
    private String name;

    Hand(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
