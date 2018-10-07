package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.Question;
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
                QuestionSelector.init();
                QuestionSelector.Type category = QuestionSelector.randomCategory();
                System.out.println("New category: " + category);

                //dar uma pergunta random da categoria que saiu
                Question question = QuestionSelector.getRandomQuestions(category);
                System.out.println(question.getStatement());

                //player choose uma answer random de todas as answers possíveis
                String answer = player.choose(question.getAnswers());


                //enquanto a resposta for certa e não chegar a score 10 (winner)
                while (answer.equals(question.getRightAnswer()) && !player.isWinner()) {
                    //aumentar o score
                    player.isRightAnswer();
                    //perguntar se score já é 10 (vencedor), se sim, sair do loop
                    if (isGameWinner(player)) {
                        break;
                    }

                    //se não, nova pergunta e resposta
                    category = QuestionSelector.randomCategory();
                    System.out.println("New category: " + category);
                    question = QuestionSelector.getRandomQuestions(category);
                    System.out.println(question.getStatement());
                    answer = player.choose(question.getAnswers());
                }

                if (isGameWinner(player)) {
                    System.out.println(player.getName() + " is the winner!");
                    break;
                }
            }
        }
    }


    public boolean isGameWinner(Player player) {
        if (player.isWinner()) {
            return this.gameWinner = true;
        }
        return gameWinner = false;
    }


}
