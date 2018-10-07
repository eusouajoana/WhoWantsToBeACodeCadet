package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.position;

public interface GridPosition {

    int getCol();
    int getRow();
    void setPos(int var1, int var2);
    void show();
    void hide();
    boolean equals(GridPosition var1);
    int getCellsize();
}
