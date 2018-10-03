package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import java.util.*;

public enum Question {

    FILIPE_CAT_NAME("What is Filipe's cat name?", new String[]{"lily", "mix", "tareco"}),
    FELIPE_COUNTRY("Where's Felipe from?", new String[]{"Braziuziu", "Argentina", "Peru"});

    private static Set<Question> removedQuestions = new HashSet<>();

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

    public static Question get() {
        Question question = getRandom();
        return removedQuestions.contains(question) ? get() : question;

    }

    private static Question getRandom() {
        return Question.values()[(int) (Math.random() * Question.values().length)];
    }

}
