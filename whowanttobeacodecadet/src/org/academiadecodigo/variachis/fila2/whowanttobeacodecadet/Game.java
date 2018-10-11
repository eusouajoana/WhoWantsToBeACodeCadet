package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.GfxDice;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.Question;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.QuestionSelector;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.SimpleGfxBoard;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Square;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.QuestionsGfx;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Game {

    private Player[] players;
    private boolean winner = false;
    private Board board;
    private boolean gameWinner = false;
    private boolean started;
    private SimpleGfxBoard simpleGfxBoard;
    private Keyboard keyboard;
    private int currentPlayer = -1;
    private GfxDice gfxDice = new GfxDice();
    private int index;
    private QuestionsGfx questionsGfx = new QuestionsGfx();

    //Constructor
    public Game() {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        this.players = new Player[]{player1, player2};
        this.board = new Board();
        this.board.settingSquaresCategory();
        this.simpleGfxBoard = new SimpleGfxBoard(board);
        this.index = 0;
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


    public void turn(Player player, Question question) {

        if (!player.getAnswer().equals(question.getRightAnswer())) {
            //show animation saying player got the wrong answer
            nextPlayer();
            return;
        }


        if (player.getAnswer().equals(question.getRightAnswer()) && !player.isWinner()) {

        }

        if (isGameWinner(player)) {
            win(player);
            return;
        }

    }


    public void win(Player player) {
        System.out.println(player.getName() + ": you win!");
    }


    public int rollDice() {
        index = -1;

        int diceValue = players[currentPlayer].rollDice();

      /*  try {
            GfxDice.printDice(diceValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } */

        String actualPosition = getCurrentPlayer().getActualposition();

        Set<String> possiblePaths = new HashSet<>();
        possiblePaths.addAll(board.paths(actualPosition, diceValue));
        getCurrentPlayer().setPossiblePaths(board.paths(actualPosition,diceValue));

        simpleGfxBoard.highlight(possiblePaths);
        simpleGfxBoard.cursorInitialPosition(possiblePaths);
        System.out.println("dice do game" + diceValue);
        return diceValue;
    }


    public Player nextPlayer() {
        currentPlayer = currentPlayer + 1 == (players.length - 1) ? 0 : currentPlayer + 1;
        return getCurrentPlayer();
    }

    public Player getCurrentPlayer() {
        return players[currentPlayer];
    }


    public void movePlayerToNext(Player player) {
        List<Integer[]> possiblePathsList = new LinkedList<>();

        System.out.println(player.getName());
        for (String path : player.getPossiblePaths()) {
            Integer[] position = board.transformKeyPosition(path);
            possiblePathsList.add(position);
        }



        if (!(index == possiblePathsList.size() - 1)) {
            Integer[] nextPosition = possiblePathsList.get(++index);

            System.out.println("entrei no if!!");
            //player.setCurrentPosition(possiblePathsList.get(++index));
            simpleGfxBoard.moveCursor(nextPosition);
            player.setCurrentPosition(nextPosition);
        }
    }


    public void movePlayerToPrevious(Player player) {
        List<Integer[]> possiblePathsList = new LinkedList<>();

        for (String path : player.getPossiblePaths()) {
            Integer[] position = board.transformKeyPosition(path);
            possiblePathsList.add(position);
        }

        if (!(index == 0)) {
            Integer[] nextPosition = possiblePathsList.get(--index);

            System.out.println("entrei no if!!");
            //player.setCurrentPosition(possiblePathsList.get(++index));
            simpleGfxBoard.moveCursor(nextPosition);
            player.setCurrentPosition(nextPosition);
        }

    }

    public void choosePathGame(Player player) {
        //player choose a path
        player.choosePath(player.getCurrentPosition());
        String actualPosition = player.getActualposition();
        System.out.println(player.getName() + " New Position: " + actualPosition);

        //  player.choosePathGame();
        player.moveCheese(board);
    }

    public String[] showQuestion(Player player) {
        //Question Category according to the actual position of Player
        Square square = board.getSquareMap().get(player.getActualposition());
        QuestionSelector.Type category = square.getCategory();
        System.out.println("New category: " + category);

        //dar uma pergunta random da categoria da Posição do Player
        Question question = QuestionSelector.getRandomQuestions(category);
        System.out.println(question.getStatement());
        return questionsGfx.showQuestion(question, category);


    }


    public void answer(Player player, Question question) {

        //TODO mudar esse método (random) para escolher pelo teclado
        String answer = player.choose(question.getAnswers());

        Square square = board.getSquareMap().get(player.getActualposition());
        //Seeing if the square is special, win a cheese
        if (square.isSpecial() && answer.equals(question.getRightAnswer())) {
            player.winCheese(square.getCategory());
        }

        getCurrentPlayer().setAnswered(true);
    }

    public int getIntCurrentPlayer(){
        return currentPlayer;
    }

}
