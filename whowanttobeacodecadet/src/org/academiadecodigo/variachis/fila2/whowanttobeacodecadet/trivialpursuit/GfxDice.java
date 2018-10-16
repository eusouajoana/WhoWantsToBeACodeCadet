package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GfxDice {

    public void printDice(int diceResult) throws InterruptedException {

        Picture dice1 = new Picture(40, 420, "resources/img/dice-six-faces-one.png");
        dice1.grow(-220,-220);
        dice1.translate(-220,-220);

        Picture dice2 = new Picture(40, 420, "resources/img/dice-six-faces-two.png");
        dice2.grow(-220,-220);
        dice2.translate(-220,-220);

        Picture dice3 = new Picture(40, 420, "resources/img/dice-six-faces-three.png");
        dice3.grow(-220,-220);
        dice3.translate(-220,-220);

        Picture dice4 = new Picture(40, 420, "resources/img/dice-six-faces-four.png");
        dice4.grow(-220,-220);
        dice4.translate(-220,-220);

        Picture dice5 = new Picture(40, 420, "resources/img/dice-six-faces-five.png");
        dice5.grow(-220,-220);
        dice5.translate(-220,-220);

        Picture dice6 = new Picture(40, 420, "resources/img/dice-six-faces-six.png");
        dice6.grow(-220,-220);
        dice6.translate(-220,-220);

        //Showing Result
        switch(diceResult){
            case 1: dice1.draw();

                break;
            case 2: dice2.draw();
                break;
            case 3: dice3.draw();
                break;
            case 4: dice4.draw();
                break;
            case 5: dice5.draw();
                break;
            default: dice6.draw();

        }

    }

}
