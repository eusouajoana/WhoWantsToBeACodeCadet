package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.position.GridPosition;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.position.SimpleGfxGridPosition;

public class SimpleGfxGrid implements Grid{

    private int cols;
    private int rows;
    public static final int PADDING = 10;
    public static final int CELLSIZE = 24;
    private Rectangle grid;
    private Picture picture;

    public SimpleGfxGrid(int var1, int var2) {

        this.cols = var1;
        this.rows = var2;
        this.grid = new Rectangle(10, 10, (double)(var1 * 24), (double)(var2 * 24));
        this.picture = new Picture(10, 10, "resources/img/ac_logo.png");
        this.init();
    }

    @Override
    public void init() {

        this.grid.draw();
        this.picture.draw();
    }

    @Override
    public GridPosition makeGridPosition() {

        return new SimpleGfxGridPosition(this);
    }

    @Override
    public GridPosition makeGridPosition(int var1, int var2) {

        return new SimpleGfxGridPosition(var1, var2, this);
    }

    public int getCellsize() {

        return 24;
    }

    public int getCols() {

        return this.cols;
    }

    public int getRows() {

        return this.rows;
    }
}
