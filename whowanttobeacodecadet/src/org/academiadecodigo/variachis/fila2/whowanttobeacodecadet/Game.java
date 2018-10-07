package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.QuestionSelector;

import java.util.List;

public class Game {

    private Player[] players;
    private boolean gameWinner = false;
    //private QuestionSelector questionSelector;


    //Constructor
    public Game() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        this.players = new Player[]{player1, player2};
       // this.questionSelector = new QuestionSelector();
    }


    public void start() {

        //Enquanto não houver um vencedor
        while (!gameWinner) {
            //para cada player
            for (Player player : players) {

                //escolher uma categoria random
                QuestionSelector.Type category = QuestionSelector.randomCategory();

                //dar uma pergunta random da categoria que saiu
                Object question = QuestionSelector.getRandomQuestions(category);





               // QuestionSelector question  = QuestionSelector.giveQuestion();
                //player choose uma answer random
                String answer = player.choose(question.getAnswers());

                //enquanto a resposta for certa e não chegar a score 10
                while (answer.equals(QuestionSelector.question.getRightAnswer()) && !player.isWinner()) {
                    //aumentar o score
                    player.isRightAnswer();
                    //perguntar se score já é 10 (vencedor), se sim, sair do loop
                    if (isGameWinner(player)) {
                        break;
                    }

                    //se não, nova pergunta e resposta
                    category = QuestionSelector.randomCategory();
                    question = QuestionSelector.getRandomQuestion(category);
                    answer = player.choose(question.getAnswers());
                }
            }
        }
    }




    public boolean isGameWinner(Player player) {
        if (player.isWinner()) {
            System.out.println(player.getName() + ": I'm the winner");
            return this.gameWinner = true;
        }
        return gameWinner = false;
    }


}
