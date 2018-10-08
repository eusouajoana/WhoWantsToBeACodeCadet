package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.GfxDice;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.AcademiaQuestions;
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





    }
}
