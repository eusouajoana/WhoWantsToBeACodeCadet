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


    private Rectangle rect1;
    private Rectangle rect2;
    private Rectangle rect;
    private Text text;
    private Text text1;
    private Text text2;
    private Text text3;
    private Text text4;


    public String[] showQuestion(Question question, QuestionSelector.Type category) {
        String[] answers = new String[3];
        answers = question.getAnswers().toArray(answers);

        this.rect2 = new Rectangle(76, 363, 725, 200);
        rect2.setColor(Color.BLACK);
        rect2.fill();

        this.rect = new Rectangle(66, 350, 720, 200);
        rect.setColor(Color.WHITE);
        rect.fill();

        this.rect1 = new Rectangle(76, 358, 700, 28);
        rect1.setColor(Color.BLACK);
        rect1.fill();

        this.text4 = new Text(106, 370, category.toString());
        text4.setColor(Color.WHITE);
        text4.draw();
        text4.grow(19, 15);

        this.text = new Text(96, 400, question.getStatement());
        text.setColor(Color.BLACK);
        text.draw();
        text.grow(13, 10);

        this.text1 = new Text(96, 440, "1." + answers[0]);
        text1.setColor(Color.BLACK);
        text1.draw();
        text1.grow(10, 9);

        this.text2 = new Text(96, 480, "2." + answers[1]);
        text2.setColor(Color.BLACK);
        text2.draw();
        text2.grow(10, 9);

        this.text3 = new Text(96, 520, "3." + answers[2]);
        text3.setColor(Color.BLACK);
        text3.draw();
        text3.grow(10, 9);

        return answers;
    }



    public void hideQuestion() {
        rect.delete();
        rect1.delete();
        rect2.delete();
        text.delete();
        text1.delete();
        text2.delete();
        text3.delete();
        text4.delete();
    }


}


