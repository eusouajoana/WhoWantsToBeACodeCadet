package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.SimpleGfxGrid;

import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //SimpleGfxGrid initialScreen = new SimpleGfxGrid(30 ,30);

        Game game = new Game();

        game.start();
        game.getBoard().transformKeyPosition("6e6");
        System.out.println(game.getBoard().getSquareMap().get("1e1").getCategory());
        //Trivial Pursuit Board Logic

        /*
        Board board = new Board();
        board.position();
        int dice = board.getDice().rollDice();
        board.paths("6e6",dice);
        */
       //Test player changing position
            //System.out.println("Player :"+ game.getPlayers()[i].getName()+ " Actual Position : " + game.getPlayers()[i].getActualposition());

       /* int x = 3;
        while(x > 0) {
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
        } */




    }
}
