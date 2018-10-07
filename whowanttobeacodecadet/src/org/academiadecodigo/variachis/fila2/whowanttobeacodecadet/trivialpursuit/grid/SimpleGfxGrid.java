package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.position.GridPosition;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.position.SimpleGfxGridPosition;

public class SimpleGfxGrid implements Grid{

    private int cols;
    private int rows;
    public static final int PADDING = 10;
    public static final int CELLSIZE = 10;
    private Rectangle grid;
    private Picture board;


    public SimpleGfxGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.grid = new Rectangle(10, 10, (double)(cols * CELLSIZE), (double)(rows * CELLSIZE));
        this.board = new Picture(200, 80,"/img/board2.png");
        this.init();
    }


    @Override
    public void init() {
        this.grid.draw();
        this.board.draw();
    }


    @Override
    public GridPosition makeGridPosition() {
        return new SimpleGfxGridPosition(this);
    }


    @Override
    public GridPosition makeGridPosition(int cols, int rows) {

        return new SimpleGfxGridPosition(cols, rows, this);
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
