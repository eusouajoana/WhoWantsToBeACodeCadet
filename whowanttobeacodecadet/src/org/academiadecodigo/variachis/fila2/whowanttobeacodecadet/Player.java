package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

public class Player {

    //Properties
    private String name;
    private int score;
    private boolean winner;
    private boolean rightAnswer;

    //Constructor
    public Player(String name){
        this.name = name;
    }

    //------------------ Methods ------------------------

    //Method Answer
    public void answer(Question question){

        if(question.isCorrect){
            score++;
            this.rightAnswer = true;
        }
        System.out.println("Errouuuuuu!! Sifufu!");
        this.rightAnswer = false;

    }

    //Method Win
    public boolean isWinner(){

        if (score == 10){
            return winner = true;
        }
        return false;
    }

    //Method isRight
    public boolean isRightAnswer(){
        return rightAnswer;
    }


}
