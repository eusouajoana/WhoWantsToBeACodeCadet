package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit;

public class Coordinates {

    private int row;
    private int col;


    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public boolean equals(Object c){

        if(!(c instanceof Coordinates)){
            return false;
        }

        Coordinates coord = (Coordinates) c;

        if (row == coord.getRow() && col == coord.getCol()){
            return true;
        }
        return false;
    }
}
