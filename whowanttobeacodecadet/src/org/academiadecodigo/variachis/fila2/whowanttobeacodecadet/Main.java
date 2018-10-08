package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.GfxDice;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.AcademiaQuestions;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.LittleCheese;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.SimpleGfxBoard;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.SimpleGfxGrid;

import java.util.Set;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //SimpleGfxGrid initialScreen = new SimpleGfxGrid(30 ,30);

        Game game = new Game();
        GfxDice.printDice(5);
        game.start();
        game.getBoard().transformKeyPosition("6e6");
        System.out.println(game.getBoard().getSquareMap().get("1e1").getCategory());

        SimpleGfxGrid grid = new SimpleGfxGrid(87, 70);

        SimpleGfxBoard.makeAllBoard();


        LittleCheese littleCheese = new LittleCheese(Color.RED);


        int[] position = {11, 11};


        int[] pos = {1, 1};

        int[] pos1 = {7,1};


        littleCheese.move(position);

        Thread.sleep(3500);

        littleCheese.move(pos);

        Thread.sleep(3000);

        littleCheese.move(pos1);


        //littleCheese.translate(70 * 5, -70);


    }
}
