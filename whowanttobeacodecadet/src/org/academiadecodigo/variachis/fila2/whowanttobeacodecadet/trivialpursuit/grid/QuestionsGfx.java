package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.Player;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.KeyHandler;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.Question;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.QuestionSelector;

public class QuestionsGfx {

    private String[] answers;
    private KeyHandler k;


    /*public static void showQuestion(Player player, Question question, QuestionSelector.Type category) {


        String[] answers = new String[3];
        question.getAnswers().toArray(answers);


        KeyHandler k = new KeyHandler(player, question, answers);
        k.start();

        */

    public static void main(String[] args) {


        Picture pic = new Picture(10, 10, "/Users/codecadet/Desktop/game-repo/WhoWantsToBeACodeCadet/whowanttobeacodecadet/resources/img/table3.png");
        pic.draw();


        Rectangle rect2 = new Rectangle(196, 363, 520, 200);
        rect2.setColor(Color.ORANGE);
        rect2.draw();
        rect2.fill();

        Rectangle rect = new Rectangle(183, 350, 520, 200);
        rect.setColor(Color.SOMECOLOR);
        rect.draw();
        rect.fill();

        Rectangle rect1 = new Rectangle(188, 358, 505, 28);
        rect1.setColor(Color.ORANGE);
        rect1.draw();
        rect1.fill();

        //Text text4 = new Text(540, 600, category.toString() );
        Text text4 = new Text(210, 370, "CATEGORIA FIXE");
        text4.setColor(Color.SOMECOLOR);
        text4.draw();
        text4.grow(19,15);

        //Text text = new Text(540, 650, question.getStatement());
        Text text = new Text(210, 400, "Quem faz o melhor arroz de cona?");
        text.setColor(Color.YELLOW);
        text.draw();
        text.grow(10,8);

        //Text text1 = new Text(540, 680, "1." + answers[0]);
        Text text1 = new Text(210, 440, "1. A tua prima");
        text1.setColor(Color.YELLOW);
        text1.draw();
        text1.grow(8,7);

        //Text text2 = new Text(540, 710, "2." + answers[1]);
        Text text2 = new Text(210, 480, "2. A tua mãe");
        text2.setColor(Color.YELLOW);
        text2.draw();
        text2.grow(8,7);

        //Text text3 = new Text(540, 740, "3." + answers[2]);
        Text text3 = new Text(210, 520, "3. O Jorge");
        text3.setColor(Color.YELLOW);
        text3.draw();
        text3.grow(8,7);


    }
}


