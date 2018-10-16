package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.screens;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class StartingScreen {

    private final int x;
    private final int y;
    private Picture pictureStartingScreen;
    private String path;


    public StartingScreen(int col, int row, String path) {

        this.x = col;
        this.y = row;
        this.path = path;
        this.pictureStartingScreen = new Picture((double) this.x, (double) this.y, path);
        this.pictureStartingScreen.draw();
    }

    public Picture getPictureStartingScreen() {
        return pictureStartingScreen;
    }
}



