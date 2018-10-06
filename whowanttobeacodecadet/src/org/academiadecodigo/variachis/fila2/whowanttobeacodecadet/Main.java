package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;

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

            String actualPlace = game.getPlayers()[0].getActualposition();
            System.out.println("Actualplace : " + actualPlace);
            int dice1 = game.getPlayers()[0].rollDice();
            System.out.println("dice : " + dice1);
            Set<String> paths = game.getBoard().paths(actualPlace,dice1);
            game.getPlayers()[0].choosePath(paths);

            System.out.println("Player :"+ game.getPlayers()[0].getName()+ " " + game.getPlayers()[0].getActualposition());

        actualPlace = game.getPlayers()[1].getActualposition();
        System.out.println("Actualplace : " + actualPlace);
        dice1 = game.getPlayers()[1].rollDice();
        System.out.println("dice : " + dice1);
        Set<String> paths1 = game.getBoard().paths(actualPlace,dice1);
        game.getPlayers()[1].choosePath(paths1);

        System.out.println("Player :"+ game.getPlayers()[1].getName()+ " " + game.getPlayers()[1].getActualposition());


    }
}
