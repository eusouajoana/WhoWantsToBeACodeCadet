package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit;

public class Dice {

    public int rollDice(){

        int result = (int) (Math.random() * 6) + 1;

        return result;
    }
}
