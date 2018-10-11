package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Player;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.Question;


import java.util.List;

public class KeyHandler implements KeyboardHandler {

    private KeyboardEvent one;
    private KeyboardEvent two;
    private KeyboardEvent three;
    private Question question;
    private Player player;
    private String[] answers;
    private Keyboard k;


    public KeyHandler(Player player, Question question, String[] answers){
        this.player = player;
        this.question = question;
        this.answers = answers;


    }

    public void start() {


        k = new Keyboard(this);

        one = new KeyboardEvent();
        one.setKey(KeyboardEvent.KEY_1);
        one.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(one);

        two = new KeyboardEvent();
        two.setKey(KeyboardEvent.KEY_2);
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(two);

        three = new KeyboardEvent();
        three.setKey(KeyboardEvent.KEY_3);
        three.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(three);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent)  {



        if (keyboardEvent.equals(one)) {
            System.out.println("carreguei na tecla 1 :");
            //player.setAnswer(answers[0]);
            return;
        }


        if (keyboardEvent.equals(two)) {
            System.out.println("carreguei na tecla 2 :");
            //player.setAnswer(answers[1]);
            return;

        }

        if (keyboardEvent.equals(three)) {
            System.out.println("carreguei na tecla 3 :");
            //player.setAnswer(answers[2]);
            return;

        }


    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}
