package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.LittleCheese;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.SimpleGfxBoard;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.SimpleGfxGrid;

import java.util.Set;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        Game game = new Game();

        game.start();


        //Trivial Pursuit Board Logic

        /*
        Board board = new Board();
        board.position();
        int dice = board.getDice().rollDice();
        board.paths("6e6",dice);
        */
        //Test player changing position
        //System.out.println("Player :"+ game.getPlayers()[i].getName()+ " Actual Position : " + game.getPlayers()[i].getActualposition());

        int x = 3;
        while (x > 0) {
            for (int i = 0; i < game.getPlayers().length; i++) {
                String actualPlace = game.getPlayers()[i].getActualposition();
                System.out.println("Actualplace : " + actualPlace);
                int dice1 = game.getPlayers()[i].rollDice();
                System.out.println("dice : " + dice1);
                Set<String> paths = game.getBoard().paths(actualPlace, dice1);
                game.getPlayers()[i].choosePath(paths);

                System.out.println("Player :" + game.getPlayers()[i].getName() + " " + game.getPlayers()[i].getActualposition());
            }
            x--;
        }


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
