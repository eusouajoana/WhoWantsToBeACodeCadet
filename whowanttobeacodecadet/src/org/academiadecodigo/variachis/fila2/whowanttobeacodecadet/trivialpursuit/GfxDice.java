package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GfxDice {

   /* private Picture dice1;
    private Picture dice2;
    private Picture dice3;
    private Picture dice4;
    private Picture dice5;
    private Picture dice6; */

    public void printDice(int diceResult) throws InterruptedException {

        Picture dice1 = new Picture(40, 420, "/img/dice-six-faces-one.png");
        dice1.grow(-220,-220);
        dice1.translate(-220,-220);

        Picture dice2 = new Picture(40, 420, "/img/dice-six-faces-two.png");
        dice2.grow(-220,-220);
        dice2.translate(-220,-220);

        Picture dice3 = new Picture(40, 420, "/img/dice-six-faces-three.png");
        dice3.grow(-220,-220);
        dice3.translate(-220,-220);

        Picture dice4 = new Picture(40, 420, "/img/dice-six-faces-four.png");
        dice4.grow(-220,-220);
        dice4.translate(-220,-220);

        Picture dice5 = new Picture(40, 420, "/img/dice-six-faces-five.png");
        dice5.grow(-220,-220);
        dice5.translate(-220,-220);

        Picture dice6 = new Picture(40, 420, "/img/dice-six-faces-six.png");
        dice6.grow(-220,-220);
        dice6.translate(-220,-220);


        //Rolling Dice Effect
        /*int x = 3;
        while(x > 0){
            dice1.draw();
            Thread.sleep(200);
            dice1.delete();
            dice2.draw();
            Thread.sleep(200);
            dice2.delete();
            dice3.draw();
            Thread.sleep(200);
            dice3.delete();
            dice4.draw();
            Thread.sleep(200);
            dice4.delete();
            dice5.draw();
            Thread.sleep(200);
            dice5.delete();
            dice6.draw();
            Thread.sleep(200);
            dice6.delete();

            x--;
        } */



        //Showing Result
        switch(diceResult){
            case 1: dice1.draw();
                //Thread.sleep(2000);
                //dice1.delete();
                break;
            case 2: dice2.draw();
                //Thread.sleep(2000);
                //dice2.delete();
                break;
            case 3: dice3.draw();
                //Thread.sleep(2000);
                //dice3.delete();
                break;
            case 4: dice4.draw();
                //Thread.sleep(2000);
                //dice4.delete();
                break;
            case 5: dice5.draw();
                //Thread.sleep(2000);
                //dice5.delete();
                break;
            default: dice6.draw();
                //Thread.sleep(2000);
                //dice6.delete();

        }

    }

}
