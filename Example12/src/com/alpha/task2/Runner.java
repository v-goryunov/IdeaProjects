package com.alpha.task2;

public class Runner {

    public  void run () {

//        String[] deck = new String[52];

        Card[] cards = new Card[52];

            for (Suit suit : Suit.values()) {
                System.out.println(" ");

                for (Rank rank : Rank.values()) {
//                    System.out.println(rank);
                    System.out.println((rank.ordinal() + 1) + ")" + rank + " " + suit);
                }
            }

//        System.out.println(Card);



}

}

