package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.screens;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Game;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Player;

public class StartingScreen implements KeyboardHandler {

    private final int x;
    private final int y;
    private Picture startingScreen;
    private String path;
    private Game game;
    private Keyboard k;
    private KeyboardEvent space;
    private Player player;



    public StartingScreen(int col, int row, String path) {

        this.x = col;
        this.y = row;
        this.path = path;
        this.startingScreen = new Picture((double)this.x, (double)this.y, path);
        this.startingScreen.draw();


    }

    public void startKey() throws InterruptedException {

        k = new Keyboard(this);
        space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(space);
    }

    @Override
    public void keyPressed(KeyboardEvent event) {

        if (event.equals(space) ) {

            startingScreen.delete();
            game = new Game();
            game.start();
            k.removeEventListener(space);
        }
    }

    public void keyReleased(KeyboardEvent event) {

    }

}
