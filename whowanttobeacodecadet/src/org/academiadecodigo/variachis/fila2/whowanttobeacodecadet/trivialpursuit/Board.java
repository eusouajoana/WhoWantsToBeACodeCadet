package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit;

public class Board {

    //Properties
    private Square[] squares;


    // ------- Constructor -----------

    public Board(){
        this.squares = new Square[57];
        for(int i = 0; i < squares.length;i++){
            squares[i] = new Square(0,0);
        }
    }

    public void position(){
        //iteration through squares array
       for(int x = 0; x < squares.length;x++) {

           //rows
           for (int i = 1; i <= 11; i++) {
               if (!(i > 1 && i < 6) || !(i > 6 && i < 11)) {
                   continue;
               }
                squares[x].setRow(i);
               //cols
               for (int j = 1; j <= 11; j++) {
                   if (!(j > 1 && j < 6) || !(j > 6 && j < 11)) {
                       continue;
                   }
                    squares[x].setCol(j);
               }

           }
       }

    }








}
