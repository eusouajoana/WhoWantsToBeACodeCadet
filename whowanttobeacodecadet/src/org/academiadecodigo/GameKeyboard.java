package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Game;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Player;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.GfxDice;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.Question;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.QuestionSelector;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.SimpleGfxBoard;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.QuestionsGfx;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.SimpleGfxGrid;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.screens.StartingScreen;

public class GameKeyboard implements KeyboardHandler {


    private Game game;
    private Player player;
    private SimpleGfxBoard simpleGfxBoard;
    private Rectangle cursor;
    private GfxDice gfxDice;
    private boolean firstTurn;
    private StartingScreen startingScreen;
    private QuestionsGfx questionsGfx;
    private Text textFinal;
    private Rectangle win;

    private Rectangle rect1;
    private Rectangle rect2;
    private Rectangle rect;
    private Text text;
    private Text text1;
    private Text text2;
    private Text text3;
    private Text text4;


    public GameKeyboard() {
        this.game = new Game();
        this.gfxDice = new GfxDice();
        game.nextPlayer();
        this.player = game.getCurrentPlayer();
        this.firstTurn = true;
        this.startingScreen = new StartingScreen(10, 10, "resources/img/startscreen.png");
        this.questionsGfx = game.getQuestionsGfx();
        Rectangle win = new Rectangle(76, 363, 725, 200);
        win.setColor(Color.ORANGE);
        Text textFinal = new Text(106, 370, game.getCurrentPlayer().getName() + ": YOU WIN!");
        textFinal.setColor(Color.BLUE);
        textFinal.grow(19, 15);
    }


    public void keyboardInit() {
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down);

       /* KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);*/

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(space);

        KeyboardEvent enter = new KeyboardEvent();
        enter.setKey(KeyboardEvent.KEY_ENTER);
        enter.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(enter);

        KeyboardEvent one = new KeyboardEvent();
        one.setKey(KeyboardEvent.KEY_1);
        one.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(one);

        KeyboardEvent two = new KeyboardEvent();
        two.setKey(KeyboardEvent.KEY_2);
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(two);

        KeyboardEvent three = new KeyboardEvent();
        three.setKey(KeyboardEvent.KEY_3);
        three.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(three);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                game.movePlayerToNext(game.getCurrentPlayer());
                break;

            case KeyboardEvent.KEY_DOWN:
                game.movePlayerToPrevious(game.getCurrentPlayer());
                break;

            case KeyboardEvent.KEY_SPACE:
                if (!game.isStarted()) {
                    startingScreen.getPictureStartingScreen().delete();
                    new SimpleGfxGrid(87, 70);
                    game.setStarted(true);
                    Player player1 = game.getPlayers()[0];
                    Player player2 = game.getPlayers()[1];
                    player1.getCheese().printCheese();
                    player2.getCheese().printCheese();
                    return;
                }


                //if(game.getCurrentPlayer().isAnswered() || firstTurn) {

                try {
                    gfxDice.printDice(game.rollDice());
                    firstTurn = false;
                    game.getCurrentPlayer().setAnswered(false);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //}
                break;
            case KeyboardEvent.KEY_ENTER:
                game.choosePathGame(game.getCurrentPlayer());
                game.getSimpleGfxBoard().getCursor().delete();
                game.showQuestion();
                game.getSimpleGfxBoard().deleteHighlights();

                break;

            case KeyboardEvent.KEY_1:
                game.getCurrentPlayer().setAnswer(game.getAnswersInPlay()[0]);
                game.answer(game.getQuestion());
                if (!game.getCurrentPlayer().isRightAnswer()) {
                    game.nextPlayer();
                    player = game.getCurrentPlayer();
                }
                if (game.isGameWinner(game.getCurrentPlayer())) {
                    win.fill();
                    textFinal.draw();
                }
                break;

            case KeyboardEvent.KEY_2:
                game.getCurrentPlayer().setAnswer(game.getAnswersInPlay()[1]);
                game.answer(game.getQuestion());
                if (!game.getCurrentPlayer().isRightAnswer()) {
                    game.nextPlayer();
                    player = game.getCurrentPlayer();
                }
                break;

            case KeyboardEvent.KEY_3:
                game.getCurrentPlayer().setAnswer(game.getAnswersInPlay()[2]);
                game.answer(game.getQuestion());
                if (!game.getCurrentPlayer().isRightAnswer()) {
                    game.nextPlayer();
                    player = game.getCurrentPlayer();
                }
                break;
        }
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


    public void sleep(int time) {
        try {
            Thread.sleep(time);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
