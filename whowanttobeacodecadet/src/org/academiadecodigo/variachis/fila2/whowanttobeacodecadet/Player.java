package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import java.util.LinkedList;
import java.util.List;

public class Player {

    private String name;
    private int score;
    private boolean winner;
    private boolean rightAnswer;


    //Constructor
    public Player(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public boolean isRightAnswer() {
        score++;
        System.out.println(score);
        return rightAnswer = true;
    }


    public String choose(List<String> answers) {
        int indexAnswer = (int) (Math.random() * 3);
        String answer = answers.get(indexAnswer);
        System.out.println(name + " answer: " + answer);
        return answer;
    }


    public boolean isWinner() {
        if (score == 10) {
            return winner = true;
        }
        return false;
    }


}
