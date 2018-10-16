package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.board;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Player;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.QuestionSelector;

public class Cheese implements Movable {


    //cheese has a player and a color
    private Rectangle outerRectangle;
    private Rectangle[] littleCheeses = new Rectangle[4];
    private Player player;
    private int[] actualPosition;

    //constructor for the cheese
    public Cheese(Color color) {
        this.actualPosition = new int[]{6,6};
        outerRectangle = new Rectangle(423, 429, 43, 43);
        outerRectangle.setColor(color);

        littleCheeses[0] = new Rectangle(426, 432, 18, 18);
        littleCheeses[1] = new Rectangle(444, 432, 18, 18);
        littleCheeses[2] = new Rectangle(426, 450, 18, 18);
        littleCheeses[3] = new Rectangle(444, 450, 18, 18);


    }

    public void printCheese(){

        outerRectangle.fill();

        for (Rectangle rectangle : littleCheeses) {
            rectangle.setColor(Color.BLACK);
            rectangle.draw();
        }
    }

    //movement of the cheese
    public void translate(double dx, double dy) {
        outerRectangle.translate(dx, dy);

        for (Rectangle rectangle : littleCheeses) {
            rectangle.translate(dx, dy);
        }
    }


    public void hide() {
        outerRectangle.delete();
        for (Rectangle rectangle : littleCheeses) {
            rectangle.delete();
        }
    }


    public void move(Integer[] chosenPosition) {
        int previousRow = actualPosition[0];
        int previousCol = actualPosition[1];
        int row = chosenPosition[0];
        int col = chosenPosition[1];

        int y = (row - previousRow) * 54;
        int x = (col - previousCol) * 54;

        translate(x, y);

        this.actualPosition[0] = chosenPosition[0];
        this.actualPosition[1] = chosenPosition[1];

    }

    public void paintLittleCheese(QuestionSelector.Type type){

        switch (type){
            case MASTERS:
                littleCheeses[0].setColor(Color.GREEN);
                littleCheeses[0].fill();
            break;
            case ACADEMIADECODIGO:
                littleCheeses[1].setColor(Color.RED);
                littleCheeses[1].fill();
                break;
            case CODE_CADETS:
                littleCheeses[2].setColor(Color.YELLOW);
                littleCheeses[2].fill();
                break;
            case PROGRAMMING_CONCEPTS:
                littleCheeses[3].setColor(Color.BLUE);
                littleCheeses[3].fill();
                break;
        }
    }



}
