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

    public static void main(String[] args) {

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


        Picture picture = new Picture(10, 10, "/Users/codecadet/Desktop/game-repo/whowanttobeacodecadet/resources/img/Wooden-Desk-Wallpapers-001.jpg");
        picture.draw();

        SimpleGfxGrid grid = new SimpleGfxGrid(120, 90);

        //SimpleGfxBoard.makeAllBoard();


        LittleCheese littleCheese = new LittleCheese(Color.YELLOW);

        littleCheese.translate(70 * 5, -70);


    }
}
