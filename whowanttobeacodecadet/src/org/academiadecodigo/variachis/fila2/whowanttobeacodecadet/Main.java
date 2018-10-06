package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        game.start();


        //Trivial Pursuit Board Logic

       Board board = new Board();
        board.position();
        board.paths("6e1",2);
    }
}
