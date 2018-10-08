package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Player;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.position.GridPosition;

public class LittleCheese implements Movable {


    //cheese has a player and a color
    private Rectangle outerRectangle;
    private Rectangle[] cheeses = new Rectangle[4];
    private Player player;
    private int[] actualPosition;

    //constructor for the cheese
    public LittleCheese(Color color) {
        this.actualPosition = new int[]{6,6};
        outerRectangle = new Rectangle(423, 429, 43, 43);
        outerRectangle.setColor(color);
        outerRectangle.fill();

        cheeses[0] = new Rectangle(426, 432, 18, 18);
        cheeses[1] = new Rectangle(444, 432, 18, 18);
        cheeses[2] = new Rectangle(426, 450, 18, 18);
        cheeses[3] = new Rectangle(444, 450, 18, 18);

        for (Rectangle rectangle : cheeses) {
            rectangle.setColor(Color.BLACK);
            //rectangle.fill();
            rectangle.draw();
        }
    }

    //movement of the cheese
    public void translate(double dx, double dy) {
        outerRectangle.translate(dx, dy);

        for (Rectangle rectangle : cheeses) {
            rectangle.translate(dx, dy);
        }
    }


    public void hide() {
        outerRectangle.delete();
        for (Rectangle rectangle : cheeses) {
            rectangle.delete();
        }
    }


    public void move(int[] chosenPosition) {
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

}
