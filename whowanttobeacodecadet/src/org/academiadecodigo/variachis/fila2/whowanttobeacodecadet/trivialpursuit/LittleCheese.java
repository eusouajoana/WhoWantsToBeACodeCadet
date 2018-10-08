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

    //constructor for the cheese
    public LittleCheese(Color color) {
        outerRectangle = new Rectangle(578, 462, 45, 45);
        outerRectangle.setColor(color);
        outerRectangle.fill();

        cheeses[0] = new Rectangle(583, 467, 17, 17);
        cheeses[1] = new Rectangle(600, 467, 17, 17);
        cheeses[2] = new Rectangle(583, 484, 17, 17);
        cheeses[3] = new Rectangle(600, 484, 17, 17);

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


}
