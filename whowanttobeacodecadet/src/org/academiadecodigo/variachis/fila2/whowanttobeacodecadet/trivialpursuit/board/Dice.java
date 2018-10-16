package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.board;

public class Dice {

    public static int rollDice(){

        int result = (int) (Math.random() * 6) + 1;

        return result;
    }
}
