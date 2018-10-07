package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Dice;

import java.util.List;
import java.util.Set;

public class Player {
    private String name;
    private int score;
    private boolean winner;
    private boolean rightAnswer;
    private String actualposition;


    //Constructor
    public Player(String name) {
        this.name = name;
        this.actualposition = "6e6";
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

    //Player can roll Dice to generate a random number [1 - 6]
    public int rollDice(){
        return Dice.rollDice();
    }

    //Player can choose his path according to the dice result
    //TODO transform this method to choose through keyboard!!!
    public void choosePath(Set<String> listOfPaths){

        String choosedPosition = new String();

        //choose randomly a new Position
        int randomChoose = (int) (Math.random() * listOfPaths.size());
        int count = 0;
        for(String position : listOfPaths){

            if(randomChoose == count){
                choosedPosition = position;
                break;
            }

                count++;
        }

        actualposition = choosedPosition;
    }

    public String getActualposition() {
        return actualposition;
    }
}
