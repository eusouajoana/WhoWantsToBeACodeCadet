package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

public class Game {

    //Properties

    private Player [] players;
    private Question question;
    private boolean winner = false;

    //Constructor
    public Game(){

        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        this.players = new Player[] {player1,player2};
    }

    //------------- Methods ------------------------

    //Method CheckWinner
    public boolean checkWinner(){

        return winner = true;
    }

    //Mehod Start
    public void start(){

        //While do jogo
        while(!winner){


           //while repetição das respostas

           for(Player player: players) {

               while (player.isRightAnswer() && !player.isWinner()) {
                   //******** Alternar entre os Players **********
                   player.answer(question);
               }

               if(player.isWinner()) {
                   this.winner = true;
                   break;
               }
           }
           
        }


    }


}
