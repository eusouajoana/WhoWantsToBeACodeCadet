package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit;

import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Question;

public class Square {

    //------------- Properties ----------------------------

    //Knowing Neighbours
    private Square [] neighbours;


    //Question category of the square
    private Category category;

    //ID of the square
    private int[] id;

    //Position
    private int col;
    private int row;

    //------------- Constructor -------------------------

    public Square(int row,int col){
        this.row = row;
        this.col = col;
        this.id = new int[]{row,col};
    }

    //------------- Methods ------------------------------


    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
