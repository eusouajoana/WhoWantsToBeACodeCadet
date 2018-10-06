package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

import java.util.List;

public class Game {

    private Player[] players;
    private boolean winner = false;


    //Constructor
    public Game() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        this.players = new Player[]{player1, player2};
    }


    public void start() {

        //Enquanto não houver um vencedor
        while (!winner) {
            //para cada player
            for (Player player : players) {
                //dar uma pergunta
                Question question = Question.giveQuestion();
                //player choose uma answer random
                String answer = player.choose(question.getAnswers());

                //enquanto a resposta for certa e não chegar a score 10
                while (answer.equals(question.getRightAnswer()) && !player.isWinner()) {
                    //aumentar o score
                    player.isRightAnswer();
                    //perguntar se score já é 10 (vencedor), se sim, sair do loop
                    if (isWinner(player)) {
                        break;
                    }

                    //se não, nova pergunta e resposta
                    question = Question.giveQuestion();
                    answer = player.choose(question.getAnswers());
                }
            }
        }
    }


    public boolean isWinner(Player player) {
        if (player.isWinner()) {
            System.out.println(player.getName() + ": I'm the winner");
            Text text = new Text(20, 30.4D, player.getName() + ": I'm the winner");
            text.setColor(Color.BLACK);
            text.draw();
            return this.winner = true;
        }
        return winner = false;
    }


}
