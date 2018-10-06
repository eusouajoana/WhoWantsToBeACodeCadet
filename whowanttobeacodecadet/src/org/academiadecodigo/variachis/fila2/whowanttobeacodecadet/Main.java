package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        game.start();


        //Trivial Pursuit Board Logic

       /* Board board = new Board();
        board.position();
        board.paths("1e1",2); */

        // Print <AC_> logo with SimpleGraphics
        Picture pic = new Picture(20, 100, "resources/img/ac_logo.png");
        pic.draw();
    }
}
