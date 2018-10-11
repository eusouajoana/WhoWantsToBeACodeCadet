package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Game;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Player;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Questions.Question;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.GfxDice;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.QuestionSelector;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.SimpleGfxBoard;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.Grid;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.SimpleGfxGrid;

public class GameKeyboard implements KeyboardHandler {


    private Game game;
    private Player player;
    private SimpleGfxBoard simpleGfxBoard;


    public GameKeyboard() {
        this.game = new Game();
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
                game.movePlayerToNext(player);
                break;

            case KeyboardEvent.KEY_DOWN:
                game.movePlayerToPrevious(player);
                break;

            case KeyboardEvent.KEY_SPACE:
                if (!game.isStarted()) {
                    new SimpleGfxGrid(87,70);
                    game.setStarted(true);
                    return;
                }

                game.nextPlayer();
                //game.rollDice();
                try{
                    GfxDice.printDice(game.rollDice());
                } catch (InterruptedException e){
                    e.printStackTrace();
                }

                break;

            case KeyboardEvent.KEY_ENTER:
                game.choosePath(player);
                game.showQuestion(player);
                break;

            case KeyboardEvent.KEY_1:
                game.getCurrentPlayer().setAnswer(game.showQuestion(player)[0]);
                break;

            case KeyboardEvent.KEY_2:
                game.getCurrentPlayer().setAnswer(game.showQuestion(player)[1]);
                break;

            case KeyboardEvent.KEY_3:
                game.getCurrentPlayer().setAnswer(game.showQuestion(player)[2]);
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
