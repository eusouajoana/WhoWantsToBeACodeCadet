package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.screens;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Game;

public class StartingScreen implements KeyboardHandler {

    private final int x;
    private final int y;
    private Picture startingScreen;
    private String path;
    private Game game;
    private Keyboard k;
    private KeyboardEvent event;

    public StartingScreen(int var1, int var2, String var3) {

        this.x = var1;
        this.y = var2;
        this.path = var3;
        this.startingScreen = new Picture((double)this.x, (double)this.y, var3);
        this.startingScreen.draw();
    }

    public void startKey() {

        this.k = new Keyboard(this);
        this.event = new KeyboardEvent();
        this.event.setKey(32);
        this.event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.k.addEventListener(this.event);
    }

    public void keyPressed(KeyboardEvent var1) {

        if (var1.getKey() == 32) {

            this.startingScreen.delete();
            this.game = new Game();
            this.game.start();
            this.k.removeEventListener(this.event);
        }
    }

    public void keyReleased(KeyboardEvent var1) {

    }

}
