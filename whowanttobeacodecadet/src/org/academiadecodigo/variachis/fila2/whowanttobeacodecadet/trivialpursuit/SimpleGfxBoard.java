package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.Grid;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid.position.GridPosition;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SimpleGfxBoard {

    private Board board;
    private Cheese cheese;

    private int xRectangle = 418;
    private int yRectangle = 423;
    private int cellsize = 53;
    private Rectangle cursor;
    private int cursorRow;
    private int cursorCol;
    private List<Rectangle> highlights;

    public SimpleGfxBoard(Board board) {
        this.board = board;
        this.highlights = new LinkedList<>();
        //this.cursor = new Rectangle(xRectangle, yRectangle, cellsize, cellsize);
        //cursor.setColor(Color.BLACK);
    }

    //create the graphics board

    public static void makeBoardUp() {
        Rectangle rectangle = new Rectangle(148, 153, 53, 53);
        rectangle.setColor(Color.PINK);
        rectangle.fill();

        Rectangle rectangle1 = new Rectangle(202, 153, 53, 53);
        rectangle1.setColor(Color.BLACK);
        rectangle1.fill();


        Rectangle rectangle2 = new Rectangle(256, 153, 53, 53);
        rectangle2.setColor(Color.PINK);
        rectangle2.fill();

        Rectangle rectangle3 = new Rectangle(310, 153, 53, 53);
        rectangle3.setColor(Color.BLACK);
        rectangle3.fill();

        Rectangle rectangle4 = new Rectangle(364, 153, 53, 53);
        rectangle4.setColor(Color.PINK);
        rectangle4.fill();

        Rectangle rectangle5 = new Rectangle(418, 153, 53, 53);
        rectangle5.setColor(Color.BLACK);
        rectangle5.fill();


        Rectangle rectangle6 = new Rectangle(472, 153, 53, 53);
        rectangle6.setColor(Color.PINK);
        rectangle6.fill();

        Rectangle rectangle7 = new Rectangle(526, 153, 53, 53);
        rectangle7.setColor(Color.BLACK);
        rectangle7.fill();

        Rectangle rectangle8 = new Rectangle(580, 153, 53, 53);
        rectangle8.setColor(Color.PINK);
        rectangle8.fill();

        Rectangle rectangle9 = new Rectangle(634, 153, 53, 53);
        rectangle9.setColor(Color.BLACK);
        rectangle9.fill();

        Rectangle rectangle10 = new Rectangle(688, 153, 53, 53);
        rectangle10.setColor(Color.PINK);
        rectangle10.fill();

    }


    public static void makeBoardLeft() {

        // start 148, 153, 53, 53
        Rectangle rectangle1 = new Rectangle(148, 207, 53, 53);
        rectangle1.setColor(Color.BLACK);
        rectangle1.fill();

        Rectangle rectangle2 = new Rectangle(148, 261, 53, 53);
        rectangle2.setColor(Color.PINK);
        rectangle2.fill();

        Rectangle rectangle3 = new Rectangle(148, 315, 53, 53);
        rectangle3.setColor(Color.BLACK);
        rectangle3.fill();

        Rectangle rectangle4 = new Rectangle(148, 369, 53, 53);
        rectangle4.setColor(Color.PINK);
        rectangle4.fill();

        Rectangle rectangle5 = new Rectangle(148, 423, 53, 53);
        rectangle5.setColor(Color.BLACK);
        rectangle5.fill();

        Rectangle rectangle6 = new Rectangle(148, 477, 53, 53);
        rectangle6.setColor(Color.PINK);
        rectangle6.fill();

        Rectangle rectangle7 = new Rectangle(148, 531, 53, 53);
        rectangle7.setColor(Color.BLACK);
        rectangle7.fill();

        Rectangle rectangle8 = new Rectangle(148, 585, 53, 53);
        rectangle8.setColor(Color.PINK);
        rectangle8.fill();

        Rectangle rectangle9 = new Rectangle(148, 639, 53, 53);
        rectangle9.setColor(Color.BLACK);
        rectangle9.fill();

        Rectangle rectangle10 = new Rectangle(148, 693, 53, 53);
        rectangle10.setColor(Color.PINK);
        rectangle10.fill();
    }


    public static void makeBoardRight() {

        //start 688, 153, 53, 53
        Rectangle rectangle1 = new Rectangle(688, 207, 53, 53);
        rectangle1.setColor(Color.BLACK);
        rectangle1.fill();

        Rectangle rectangle2 = new Rectangle(688, 261, 53, 53);
        rectangle2.setColor(Color.PINK);
        rectangle2.fill();

        Rectangle rectangle3 = new Rectangle(688, 315, 53, 53);
        rectangle3.setColor(Color.BLACK);
        rectangle3.fill();

        Rectangle rectangle4 = new Rectangle(688, 369, 53, 53);
        rectangle4.setColor(Color.PINK);
        rectangle4.fill();

        Rectangle rectangle5 = new Rectangle(688, 423, 53, 53);
        rectangle5.setColor(Color.BLACK);
        rectangle5.fill();

        Rectangle rectangle6 = new Rectangle(688, 477, 53, 53);
        rectangle6.setColor(Color.PINK);
        rectangle6.fill();

        Rectangle rectangle7 = new Rectangle(688, 531, 53, 53);
        rectangle7.setColor(Color.BLACK);
        rectangle7.fill();

        Rectangle rectangle8 = new Rectangle(688, 585, 53, 53);
        rectangle8.setColor(Color.PINK);
        rectangle8.fill();

        Rectangle rectangle9 = new Rectangle(688, 639, 53, 53);
        rectangle9.setColor(Color.BLACK);
        rectangle9.fill();

        Rectangle rectangle10 = new Rectangle(688, 693, 53, 53);
        rectangle10.setColor(Color.PINK);
        rectangle10.fill();
    }


    public static void makeBoardCenterUp() {
        //start 418, 153, 53, 53
        Rectangle rectangle1 = new Rectangle(418, 207, 53, 53);
        rectangle1.setColor(Color.BLACK);
        rectangle1.fill();

        Rectangle rectangle2 = new Rectangle(418, 261, 53, 53);
        rectangle2.setColor(Color.PINK);
        rectangle2.fill();

        Rectangle rectangle3 = new Rectangle(418, 315, 53, 53);
        rectangle3.setColor(Color.BLACK);
        rectangle3.fill();

        Rectangle rectangle4 = new Rectangle(418, 369, 53, 53);
        rectangle4.setColor(Color.PINK);
        rectangle4.fill();

        Rectangle rectangle5 = new Rectangle(418, 423, 53, 53);
        rectangle5.setColor(Color.WHITE);
        rectangle5.fill();


        Rectangle rectangle6 = new Rectangle(418, 477, 53, 53);
        rectangle6.setColor(Color.PINK);
        rectangle6.fill();

        Rectangle rectangle7 = new Rectangle(418, 531, 53, 53);
        rectangle7.setColor(Color.BLACK);
        rectangle7.fill();

        Rectangle rectangle8 = new Rectangle(418, 585, 53, 53);
        rectangle8.setColor(Color.PINK);
        rectangle8.fill();

        Rectangle rectangle9 = new Rectangle(418, 639, 53, 53);
        rectangle9.setColor(Color.BLACK);
        rectangle9.fill();

        Rectangle rectangle10 = new Rectangle(418, 693, 53, 53);
        rectangle10.setColor(Color.PINK);
        rectangle10.fill();
    }


    public static void makeBoardCenterCenter() {

        //start 148, 423, 53, 53
        Rectangle rectangle1 = new Rectangle(202, 423, 52, 52);
        rectangle1.setColor(Color.BLACK);
        rectangle1.fill();

        Rectangle rectangle2 = new Rectangle(256, 423, 52, 52);
        rectangle2.setColor(Color.PINK);
        rectangle2.fill();

        Rectangle rectangle3 = new Rectangle(310, 423, 52, 52);
        rectangle3.setColor(Color.BLACK);
        rectangle3.fill();

        Rectangle rectangle4 = new Rectangle(364, 423, 52, 52);
        rectangle4.setColor(Color.PINK);
        rectangle4.fill();

        Rectangle rectangle7 = new Rectangle(472, 423, 52, 52);
        rectangle7.setColor(Color.BLACK);
        rectangle7.fill();

        Rectangle rectangle8 = new Rectangle(526, 423, 52, 52);
        rectangle8.setColor(Color.PINK);
        rectangle8.fill();

        Rectangle rectangle9 = new Rectangle(580, 423, 52, 52);
        rectangle9.setColor(Color.BLACK);
        rectangle9.fill();

        Rectangle rectangle6 = new Rectangle(634, 423, 52, 52);
        rectangle6.setColor(Color.PINK);
        rectangle6.fill();
    }


    public static void makeBoardCenterDown() {

        //start 148, 693, 53, 53

        Rectangle rectangle1 = new Rectangle(202, 693, 52, 52);
        rectangle1.setColor(Color.BLACK);
        rectangle1.fill();

        Rectangle rectangle2 = new Rectangle(256, 693, 52, 52);
        rectangle2.setColor(Color.PINK);
        rectangle2.fill();

        Rectangle rectangle3 = new Rectangle(310, 693, 52, 52);
        rectangle3.setColor(Color.BLACK);
        rectangle3.fill();

        Rectangle rectangle4 = new Rectangle(364, 693, 52, 52);
        rectangle4.setColor(Color.PINK);
        rectangle4.fill();

        Rectangle rectangle7 = new Rectangle(472, 693, 52, 52);
        rectangle7.setColor(Color.BLACK);
        rectangle7.fill();

        Rectangle rectangle8 = new Rectangle(526, 693, 52, 52);
        rectangle8.setColor(Color.PINK);
        rectangle8.fill();

        Rectangle rectangle9 = new Rectangle(580, 693, 52, 52);
        rectangle9.setColor(Color.BLACK);
        rectangle9.fill();

        Rectangle rectangle6 = new Rectangle(634, 693, 52, 52);
        rectangle6.setColor(Color.PINK);
        rectangle6.fill();
    }


    public static void makeAllBoard() {
        makeBoardUp();
        makeBoardLeft();
        makeBoardCenterUp();
        makeBoardRight();
        makeBoardCenterCenter();
        makeBoardCenterDown();
    }


    public void highlight(Set<String> paths) {

        List<Integer[]> positions = new LinkedList<>();

        for (String path : paths) {
            Integer[] position = board.transformKeyPosition(path);
            positions.add(position);
        }

        for (Integer[] position : positions) {
            if (position == null) {
                continue;
            }
            conversion(position);
        }

    }


    public void conversion(Integer[] possiblePositions) {
        int row = possiblePositions[0];
        int col = possiblePositions[1];

        int x = (147 - cellsize) + col * 54;
        int y = (152 - cellsize) + row * 54;

        Rectangle rectangle = new Rectangle(x, y, cellsize, cellsize);
        rectangle.setColor(Color.YELLOW);
        rectangle.draw();
        highlights.add(rectangle);
    }


    public void cursorInitialPosition(Set<String> paths) {
        List<Integer[]> positions = new LinkedList<>();

        for (String path : paths) {
            Integer[] position = board.transformKeyPosition(path);
            positions.add(position);
        }

        Integer[] cursorPosition = positions.get(0);
        this.cursorRow = cursorPosition[0];
        this.cursorCol = cursorPosition[1];

        int x = (147 - cellsize) + cursorCol * 54;
        int y = (152 - cellsize) + cursorRow * 54;

        this.cursor = new Rectangle(x, y, cellsize, cellsize);
        cursor.setColor(Color.BLACK);
        cursor.fill();

    }

    public Rectangle getCursor() {
        return cursor;
    }

    public void moveCursor(Integer[] nextPosition) {

        int previousRow = cursorRow;
        int previousCol = cursorCol;
        int row = nextPosition[0];
        int col = nextPosition[1];

        int y = (row - previousRow) * 54;
        int x = (col - previousCol) * 54;

        cursor.translate(x, y);

        this.cursorRow = nextPosition[0];
        this.cursorCol = nextPosition[1];

    }

    public List<Rectangle> getHighlights() {
        return highlights;
    }


    public void deleteHighlights() {
        for (Rectangle highlight: highlights) {
            highlight.delete();
        }
        highlights.clear();
    }
}
