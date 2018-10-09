package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.Question;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.QuestionSelector;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.SimpleGfxBoard;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Square;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {

    private Player[] players;
    private boolean winner = false;
    private Board board;
    private boolean gameWinner = false;
    private boolean started;
    private SimpleGfxBoard simpleGfxBoard;

    //Constructor
    public Game() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        this.players = new Player[]{player1, player2};
        this.board = new Board();
        this.board.settingSquaresCategory();
        this.simpleGfxBoard = new SimpleGfxBoard(board);

        //teste
        simpleGfxBoard.highlight(board.paths("6e6",5));
    }


    public void start() {

        //Enquanto não houver um vencedor
        while (!gameWinner) {
            //para cada player
            for (Player player : players) {
                turn(player);
            }
        }
    }


    public boolean isGameWinner(Player player) {
        if (player.isWinner()) {
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


    public boolean isStarted() {
        return started;
    }


    public void setStarted(boolean started) {
        this.started = started;
    }


    public void turn(Player player) {
        String actualPosition = player.getActualposition();
        System.out.println(player.getName() + " Actual position : " + player.getActualposition());
        int dice = player.rollDice();

        //board offer the possible paths to choose for the player
        Set<String> possiblePaths = new HashSet<>();
        possiblePaths.addAll(board.paths(actualPosition, dice));

        //player choose a path
        player.choosePath(possiblePaths);
        actualPosition = player.getActualposition();
        System.out.println(player.getName() + " New Position: " + actualPosition);

        //Move cheese to actual position
        player.getCheese().move(board.transformKeyPosition(actualPosition));

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

        //Seeing if the square is special, win a cheese
        if (square.isSpecial() && answer.equals(question.getRightAnswer())) {
            player.winCheese(category);
        }

        if (isGameWinner(player)) {
            win(player);
            return;
        }

        if (answer.equals(question.getRightAnswer()) && !player.isWinner()) {
            turn(player);
        }


    }


    public void win(Player player) {
        System.out.println(player.getName() + ": you win!");
    }

}

