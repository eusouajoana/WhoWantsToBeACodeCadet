package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.screens;

import org.academiadecodigo.GameKeyboard;
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
    private Picture pictureStartingScreen;
    private String path;
    private Game game;
    private Keyboard k;
    private KeyboardEvent space;
    private Player player;



    public StartingScreen(int col, int row, String path) {

        this.x = col;
        this.y = row;
        this.path = path;
        this.pictureStartingScreen = new Picture((double)this.x, (double)this.y, path);
        this.pictureStartingScreen.draw();


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

            pictureStartingScreen.delete();
            GameKeyboard keyboard = new GameKeyboard();
            keyboard.keyboardInit();
            k.removeEventListener(space);
        }
    }

    public void keyReleased(KeyboardEvent event) {

    }

    public Picture getPictureStartingScreen() {
        return pictureStartingScreen;
    }
}
