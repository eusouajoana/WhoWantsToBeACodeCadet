package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.SimpleGfxGrid;

public class Main {

    public static void main(String[] args) {


        // Print <AC_> logo with SimpleGraphics
        SimpleGfxGrid grid = new SimpleGfxGrid(30, 30);

        Game game = new Game();

        game.start();


        //Trivial Pursuit Board Logic

       /* Board board = new Board();
        board.position();
        board.paths("1e1",2); */

    }
}
