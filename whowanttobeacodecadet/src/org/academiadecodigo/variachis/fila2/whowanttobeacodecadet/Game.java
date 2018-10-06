package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Questions.Question;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Board;

public class Game {

    private Player[] players;
    private boolean winner = false;
    private Board board;

    //Constructor
    public Game() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        this.players = new Player[]{player1, player2};
        this.board = new Board();
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
                if (isWinner(player)) {
                    System.out.println(player.getName() + ": I'm the winner");
                    break;
                }
            }
        }
    }


    public boolean isWinner(Player player) {
        if (player.isWinner()) {

            return this.winner = true;
        }
        return winner = false;
    }


    // getters
    public Board getBoard() {
        return board;
    }

    public Player[] getPlayers() {
        return players;
    }
}
