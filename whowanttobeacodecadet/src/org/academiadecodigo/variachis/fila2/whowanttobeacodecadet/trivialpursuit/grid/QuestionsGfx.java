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


    public String[] showQuestion(Question question, QuestionSelector.Type category) {
        String[] answers = new String[3];
        answers = question.getAnswers().toArray(answers);

        Rectangle rect2 = new Rectangle(196, 363, 520, 200);
        rect2.setColor(Color.ORANGE);
        rect2.draw();
        rect2.fill();

        Rectangle rect = new Rectangle(183, 350, 520, 200);
        rect.setColor(Color.BLUE);
        rect.draw();
        rect.fill();

        Rectangle rect1 = new Rectangle(188, 358, 505, 28);
        rect1.setColor(Color.ORANGE);
        rect1.draw();
        rect1.fill();

        Text text4 = new Text(210, 370, category.toString() );
        text4.setColor(Color.CYAN);
        text4.draw();
        text4.grow(19, 15);

        Text text = new Text(210, 400, question.getStatement() + "\n TEEESSSTT");
        text.setColor(Color.YELLOW);
        text.draw();
        text.grow(10, 8);

        Text text1 = new Text(210, 440, "1." + answers[0]);
        text1.setColor(Color.YELLOW);
        text1.draw();
        text1.grow(8, 7);

        Text text2 = new Text(210, 480, "2." + answers[1]);
        text2.setColor(Color.YELLOW);
        text2.draw();
        text2.grow(8, 7);

        Text text3 = new Text(210, 520, "3." + answers[2]);
        text3.setColor(Color.YELLOW);
        text3.draw();
        text3.grow(8, 7);

        return answers;
    }
}


