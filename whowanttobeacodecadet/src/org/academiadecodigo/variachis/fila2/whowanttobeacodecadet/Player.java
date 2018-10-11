package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Cheese;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Dice;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.QuestionSelector;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {
    private String name;
    private int score;
    private boolean winner;
    private boolean rightAnswer;
    private String actualposition;
    private Cheese cheese;
    private Set<QuestionSelector.Type> littleCheese;
    //private Keyboard keyboard;
    private Set<String> possiblePaths;
    private Integer[] currentPosition;
    private String answer;
    private boolean answered;


    //Constructor
    public Player(String name) {
        this.name = name;
        this.actualposition = "6e6";
        this.littleCheese = new HashSet<>();
        this.cheese = name.equals("player1") ? new Cheese(Color.PINK) : new Cheese(Color.LIGHT_GRAY);
        //this.keyboard = new Keyboard(this);
    }


    public String getName() {
        return name;
    }


    public boolean isRightAnswer() {
        return rightAnswer;
    }

    public void setWrongAnswer(){
        rightAnswer = false;
    }

    public void setRightAnswer(){
        rightAnswer = true;
    }



    public String choose(List<String> answers) {
        int indexAnswer = (int) (Math.random() * 3);
        String answer = answers.get(indexAnswer);
        System.out.println(name + " answer: " + answer);
        return answer;
    }


    public boolean isWinner() {
        if (littleCheese.size() == 4) {
            return winner = true;
        }
        return false;
    }

    //Player can roll Dice to generate a random number [1 - 6]
    public int rollDice() {
        return Dice.rollDice();
    }

    //Player can choose his path according to the dice result
    //TODO transform this method to choose through keyboard!!!
    public void choosePath(Integer[] currentPosition) {
        System.out.println("actual" + actualposition);
        System.out.println("current position 0:" + currentPosition[0]);
        actualposition =
                currentPosition[0] + "e"
                        + currentPosition[1];

    }

    public String getActualposition() {
        return actualposition;
    }

    public void winCheese(QuestionSelector.Type type) {
        cheese.paintLittleCheese(type);
        littleCheese.add(type);
        isWinner();
    }

    public Cheese getCheese() {
        return cheese;
    }


    public void moveCheese(Board board) {
        cheese.move(board.transformKeyPosition(actualposition));
    }


    public void setPossiblePaths(Set<String> possiblePaths) {
        System.out.println("player: " + this.getName() + " " + possiblePaths);
        this.possiblePaths = possiblePaths;
    }


    public Set<String> getPossiblePaths() {
        System.out.println("player: " + this.getName() + " " + possiblePaths);
        return possiblePaths;
    }

    public void setCurrentPosition(Integer[] currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Integer[] getCurrentPosition() {
        return currentPosition;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }


    public String getAnswer() {
        return answer;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }

    public boolean isAnswered() {
        return answered;
    }
}
