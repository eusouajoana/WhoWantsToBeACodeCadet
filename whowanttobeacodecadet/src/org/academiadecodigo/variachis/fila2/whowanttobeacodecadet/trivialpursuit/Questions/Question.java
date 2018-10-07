package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions;

import java.util.*;

public interface Question {

    //my question can get it's answers
    List<String> getAnswers();


    //get the right answer for my question
    String getRightAnswer();





    /*private static Set<Question> removedQuestions = new HashSet<>();

    private String[] answers;
    private String statement;


    Question(String statement, String[] answers) {
        this.statement = statement;
        this.answers = answers;
    }


    public String getStatement() {
        return statement;
    }


    public String getRightAnswer() {
        return answers[0];
    }


    public List<String> getAnswers() {
        List<String> answers = new LinkedList<>();
        Collections.addAll(answers, this.answers);
        Collections.shuffle(answers);
        return answers;
    }


    public static void remove(Question question) {
        removedQuestions.add(question);
    }


    public static Question giveQuestion() {
        Question question = getRandom();
        return removedQuestions.contains(question) ? giveQuestion() : question;
    }


    private static Question getRandom() {
        return Question.values()[(int) (Math.random() * Question.values().length)];
    }
*/

}


