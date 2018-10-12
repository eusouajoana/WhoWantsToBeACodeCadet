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
    private int currentPlayer = 0;
    private GfxDice gfxDice = new GfxDice();
    private int index;
    private QuestionsGfx questionsGfx = new QuestionsGfx();
    private Question question;
    private QuestionSelector.Type category;
    private String[] answersInPlay;

    //Constructor
    public Game() {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        this.players = new Player[]{player1, player2};
        this.board = new Board();
        this.board.settingSquaresCategory();
        this.simpleGfxBoard = new SimpleGfxBoard(board);
        this.index = -1;

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

    public int rollDice() {
        index = -1;

        int diceValue = players[currentPlayer].rollDice();

        String actualPosition = getCurrentPlayer().getActualposition();

        Set<String> possiblePaths = new HashSet<>();
        possiblePaths.addAll(board.paths(actualPosition, diceValue));
        getCurrentPlayer().setPossiblePaths(board.paths(actualPosition, diceValue));

        simpleGfxBoard.highlight(possiblePaths);
        simpleGfxBoard.cursorInitialPosition(possiblePaths);
        return diceValue;
    }


    public Player nextPlayer() {

        if (currentPlayer == 0) {
            currentPlayer = 1;
        } else {
            currentPlayer = 0;
        }

        Player playercurrent = getCurrentPlayer();
        return playercurrent;
    }

    public Player getCurrentPlayer() {

        return players[currentPlayer];
    }


    public void movePlayerToNext(Player player) {
        List<Integer[]> possiblePathsList = new LinkedList<>();

        //System.out.println(player.getName());
        for (String path : player.getPossiblePaths()) {
            Integer[] position = board.transformKeyPosition(path);
            possiblePathsList.add(position);
        }


        if (!(index == possiblePathsList.size() - 1)) {
            Integer[] nextPosition = possiblePathsList.get(++index);
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
            simpleGfxBoard.moveCursor(nextPosition);
            player.setCurrentPosition(nextPosition);
        }

    }

    public void choosePathGame(Player player) {
        //player choose a path
        player.choosePath(player.getCurrentPosition());
        String actualPosition = player.getActualposition();

        //  player.choosePathGame();
        player.moveCheese(board);
    }

    public void showQuestion() {
        //Question Category according to the actual position of Player
        Square square = board.getSquareMap().get(getCurrentPlayer().getActualposition());
        this.category = square.getCategory();
        this.question = QuestionSelector.getRandomQuestions(category);
        //System.out.println(question.getStatement());
        this.answersInPlay = questionsGfx.showQuestion(question, category);
    }


    public void answer(Question question) {

        if (getCurrentPlayer().getAnswer().equals(question.getRightAnswer())) {
            getCurrentPlayer().setAnswered(true);
            getCurrentPlayer().setRightAnswer(true);

            //aparecer um texto a dizer acertou
           // System.out.println(getCurrentPlayer().getName() + " You're right! You can play again. Press Space to Roll Dice!");
            //player continua a jogar (libera o dado, escolhe caminho, etc)

            Square square = board.getSquareMap().get(getCurrentPlayer().getActualposition());
            if (square.isSpecial()) {
                getCurrentPlayer().winCheese(square.getCategory());
                if(isGameWinner(getCurrentPlayer())) {


                }
                //aparecer mensagem Ganhou um queijinho
            }
            questionsGfx.hideQuestion();
            return;
        }

        getCurrentPlayer().setAnswered(false);
        getCurrentPlayer().setRightAnswer(false);
        //aparece uma mensagem

        questionsGfx.hideQuestion();
    }

    public int getIntCurrentPlayer() {
        return currentPlayer;
    }

    public Question getQuestion() {
        return question;
    }

    public QuestionsGfx getQuestionsGfx() {
        return questionsGfx;
    }

    public QuestionSelector.Type getCategory() {
        return category;
    }

    public String[] getAnswersInPlay() {
        return answersInPlay;
    }

    public SimpleGfxBoard getSimpleGfxBoard() {
        return simpleGfxBoard;
    }
}
