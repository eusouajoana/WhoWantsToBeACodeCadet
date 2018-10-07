package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid;

import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.position.GridPosition;

public interface Grid {

    void init();

    GridPosition makeGridPosition();

    GridPosition makeGridPosition(int var1, int var2);
}
