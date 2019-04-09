# TRIVIAL PURSUIT <Academia de Código_> Edition

A new edition of the famous board game Trivial Pursuit. This time it's
the awesome about <Academia de Código_>!

- "Made after only four weeks of diving into the study of code" -


## Categories:
```java
<Code Cadets>
<Programming concepts> 
<Master Coders>
<Academia de Código_>
```

## Rules:
```java
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
```

## Keyboard commands:

```python
Press <SPACE> to start the game;
Press <SPACE> to roll dice;
Press <UP> or <DOWN> to pre-select a possible square to move to;
Press <ENTER> to select it and move the cheese;
Press <1>, <2> or <3> to select the correct answer.
```

