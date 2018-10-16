package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.screens;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class EndScreen {

    private final int x;
    private final int y;
    private Picture pictureEndScreen;
    private String path;


    public EndScreen(int col, int row, String path) {

        this.x = col;
        this.y = row;
        this.path = path;
        this.pictureEndScreen = new Picture((double) this.x, (double) this.y, path);
        this.pictureEndScreen.draw();
    }
}