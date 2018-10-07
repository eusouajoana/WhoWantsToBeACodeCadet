package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions;

import java.util.*;

public enum MastersQuestions {

    FILIPE_CAT_NAME("What does Filipe call his cat?", new String[]{"Lily", "Mix", "Tareco"}),
    FILIPE_SENTENCE("What's Filipe's favorite sentence?", new String[]{"Fasshentido", "Maltinha...", "Ta foder"}),
    SID_SENTENCE("What's Sid's favorite sentence?", new String[]{"Fixe?", "Complhar", "A minha prima"}),
    JORGE_SENTENCE("What's Jorge's favorite sentence?", new String[]{"Vou só fazer um disclaimer", "Não teve piada?", "A tua prima"}),
    SERINGAS_SENTENCE("What's Seringa's favorite sentence?", new String[]{"Curti bué da tua cena", "ssssssssssss", "A gente vamos"}),
    JEDI_MASTERS("Who are the 4 Jedi Masters of <Academia de Código_>?", new String[]{"Jorge, Sérgio, Rodolfo, Antoninho", "Rafael, Soraia, Ferrão, António", "Catarina, Danlo, Brighenti, Sérgio"}),
    SID_ALTEREGO("Who is Sid's alter ego?", new String[]{"Beyoncé", "Chris Cornell", "Tina Turner"}),
    LIES("What is the biggest lie the Masters told us in the Bootcamp?", new String[]{"That 'Simple' Graphics were simple", "That Master Jorge invented LinkedLists", "That we could trust them"}),
    JORGE_SKILL("What's the only skill that Jorge doesn't have?", new String[]{"Make funny jokes", "Build a desk", "Use the mouse"}),
    FILIPE_TEA("What is the pussy tea that Filipe drinks almost every day?", new String[]{"Chá verde hortelã e lima", "Chá de pau de cabinda", "Chá de pés de cereja"}),
    TRIGGER("What are the masters triggered by?", new String[]{"Non idented code", "Stupid questions and wrong answers", "Sagres"}),
    BOOTCAMP_JORGE("What was the name and number of Master Jorge's Bootcamp?", new String[] {"", "", ""}),
    BOOTCAMP_FILIPE("What was the name and number of Master Filipe's Bootcamp?", new String[] {"#8 Sshavages", "#8 Bitlers", "#9 Sshavages"}),
    BOOTCAMP_SID("What was the name and number of Master Sid's Bootcamp?", new String[] {"#14 Haltistas", "#14 Sshpesshials", "#13 Haltistas"}),
    BOOTCAMP_SERINGAS("What was the name and number of Master Seringas' Bootcamp?", new String[] {"#15 Popstars", "#15 TECHceiros", "#13 Popstars"}),
    NAME_JORGE("What is the true first name of our Master Jorge?", new String[] {"Elton", "Helton", "Jesus"}),
    NAME_SERINGAS("What is the real name of Master Seringas?", new String[] {"Luís", "Miguel","Daniel"}),
    GAME_JORGE("What was the name of Master Jorge's game in his bootcamp?", new String[] {"Tanks", "SingStar", "Doom"}),
    PUSSY("What's the pussiest thing ever?", new String[] {"Using the mouse to copy a file", "Being afraid of Master Jorge's 'you're a donkey' look", "Saying Windows is better than Linux"});


    private static Set<QuestionSelector> removedQuestions = new HashSet<>();

    private String[] answers;
    private String statement;


    MastersQuestions(String statement, String[] answers) {
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


    public static void remove(QuestionSelector question) {
        removedQuestions.add(question);
    }

/*
    public static QuestionSelector giveQuestion() {
        QuestionSelector question = getRandom();
        return removedQuestions.contains(question) ? giveQuestion() : question;
    }


    private static QuestionSelector getRandom() {
        return QuestionS.values()[(int) (Math.random() * Question.values().length)];
    }

  */
}
