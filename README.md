TRIVIAL PURSUIT <Academia de código_> Edition

A new edition of the famous board game Trivial Pursuit. This time it about the <Academia de Código_>!

You have four amazing categories: 
<Code Cadets>
Programming concepts 
<Master Coders>
<Academia de Código_>



Rules:

public void turnPlayer1() {
   if (question(category).getRightAnswer() == player.chooseAnswer()) {
       if (player.getPosition() == board.getSpecialPosition()){
           player.winCheese(category);
       }
       
       if (player.getLittleCheeses().length == 4) {
           player.winGame();
           return;
       }
       turnPlayer1();
  return;
   }
   question(category).getRightAnswer() != player.chooseAnswer()) {
       turnPlayer2();
   }
}



Keyboard commands:


Press <SPACE> to start the game;

Press <SPACE> to roll dice;

Press <UP> or <DOWN> to pre-select a possible square to move to;

Press <ENTER> to select it and move the cheese;

Press <1>, <2> or <3> to select the correct answer.

