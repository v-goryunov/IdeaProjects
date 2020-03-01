package com.alpha.task2;

public class Runner {

    public  void run () {

        Card[] cards = new Card[52];

            for (Suit suit : Suit.values()) {
                System.out.println(" ");

                for (Rank rank : Rank.values()) {
                    System.out.println((rank.ordinal() + 1) + ")" + rank + " " + suit);
                }
            }

    }

}

