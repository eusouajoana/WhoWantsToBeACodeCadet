package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.Question;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.QuestionSelector;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Square;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {

    private Player[] players;
    private boolean winner = false;
    private Board board;
    private boolean gameWinner = false;
    //private QuestionSelector questionSelector;

    //Constructor
    public Game() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        this.players = new Player[]{player1, player2};
        this.board = new Board();
        this.board.settingSquaresCategory();
        // this.questionSelector = new QuestionSelector();
    }


    public void start() {

        //Enquanto não houver um vencedor
        while (!gameWinner) {
            //para cada player
            for (Player player : players) {

                //get actual position of the player and player roll the dice
                String actualPosition = player.getActualposition();
                System.out.println(player.getName() + " Actual position : " + player.getActualposition());
                int dice = player.rollDice();

                //board offer the possible paths to choose for the player
                Set<String> possiblePaths = new HashSet<>();
                possiblePaths.addAll(board.paths(actualPosition,dice));

                //player choose a path
                player.choosePath(possiblePaths);
                actualPosition = player.getActualposition();
                System.out.println(player.getName() + " New Position: " + actualPosition);

                //Question Category according to the actual position of Player
                Square square = board.getSquareMap().get(player.getActualposition());
                QuestionSelector.Type category = square.getCategory();
                System.out.println("New category: " + category);

                //dar uma pergunta random da categoria da Posição do Player
                Question question = QuestionSelector.getRandomQuestions(category);
                System.out.println(question.getStatement());

                System.out.println(question.getAnswers());

                //player choose uma answer random de todas as answers possíveis
                String answer = player.choose(question.getAnswers());


                //enquanto a resposta for certa e não chegar a score 10 (winner)
                while (answer.equals(question.getRightAnswer()) && !player.isWinner()) {
                    //aumentar o score
                    player.isRightAnswer();
                    //perguntar se score já é 10 (vencedor), se sim, sair do loop
                    if (isGameWinner(player)) {
                        break;
                    }

                    //se não, nova pergunta e resposta

                    //get actual position of the player and player roll the dice
                    actualPosition = player.getActualposition();
                    dice = player.rollDice();
                    //board offer the possible paths to choose for the player
                    possiblePaths.clear();
                    possiblePaths.addAll(board.paths(actualPosition,dice));
                    //player choose a path
                    player.choosePath(possiblePaths);
                    actualPosition = player.getActualposition();
                    System.out.println(player.getName() + " New Position: " + actualPosition);

                    //Question Category according to the actual position of Player
                    square = board.getSquareMap().get(player.getActualposition());
                    category = square.getCategory();
                    System.out.println("New category: " + category);

                    question = QuestionSelector.getRandomQuestions(category);
                    System.out.println(question.getStatement());
                    System.out.println(question.getAnswers());
                    answer = player.choose(question.getAnswers());

                    String[] array = new String[3];
                    question.getAnswers().toArray(array);
                }

                if (isGameWinner(player)) {
                    System.out.println(player.getName() + " is the winner!");
                    break;
                }
            }
        }
    }


    public boolean isGameWinner(Player player) {
        if (player.isWinner()) {

            /*Text text = new Text(20, 30, player.getName() + ": I'm the winner");
            text.setColor(Color.BLACK);
            text.draw();*/
            return this.gameWinner = true;
        }
        return gameWinner = false;
    }


    // getters
    public Board getBoard() {
        return board;
    }

    public Player[] getPlayers() {
        return players;
    }
}
