package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.position;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.SimpleGfxGrid;

public class SimpleGfxGridPosition implements GridPosition{

    private int col;
    private int row;
    private SimpleGfxGrid grid;
    private Rectangle position;

    public SimpleGfxGridPosition(SimpleGfxGrid var1) {

        this.col = (int)Math.ceil((Math.random() * (double)(var1.getCols() - 2)));
        this.row = (int)Math.ceil((Math.random() * (double)(var1.getRows() - 2)));
        this.grid = var1;
        this.position = new Rectangle((double)(this.col * var1.getCellsize()), (double)(this.row * var1.getCellsize()), (double)var1.getCellsize(), var1.getCellsize());
    }

        public SimpleGfxGridPosition(int var1, int var2, SimpleGfxGrid var3) {

            this.col = var1;
            this.row = var2;
            this.grid = var3;
        }


    @Override
    public void show() {

        this.position.draw();
    }

    @Override
    public void hide() {

        this.position.delete();
    }

    @Override
    public int getCol() {

        return this.col;
    }

    @Override
    public int getRow() {

        return this.row;
    }

    @Override
    public void setPos(int var1, int var2) {

        this.col = var1;
        this.row = var2;
    }


    @Override
    public boolean equals(GridPosition var1) {

        return false;
    }

    @Override
    public int getCellsize() {
        return this.grid.getCellsize();
    }
}
