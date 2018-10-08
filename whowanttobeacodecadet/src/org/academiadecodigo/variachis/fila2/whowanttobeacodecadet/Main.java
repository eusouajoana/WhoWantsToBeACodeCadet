package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.GfxDice;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Cheese;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.SimpleGfxBoard;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.SimpleGfxGrid;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //SimpleGfxGrid initialScreen = new SimpleGfxGrid(30 ,30);

        Game game = new Game();
        SimpleGfxGrid grid = new SimpleGfxGrid(87, 70);
        //GfxDice.printDice(5);
        game.start();
        game.getBoard().transformKeyPosition("6e6");
        System.out.println(game.getBoard().getSquareMap().get("1e1").getCategory());



        //SimpleGfxBoard.makeAllBoard();


        //Cheese cheese = new Cheese(Color.RED);



    }
}
