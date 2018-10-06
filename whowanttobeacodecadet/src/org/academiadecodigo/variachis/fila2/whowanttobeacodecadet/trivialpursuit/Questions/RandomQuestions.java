package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions;

import java.util.*;

public enum RandomQuestions {

    ACADEMY_NAME("What is the correct name of the Academy?", new String[]{"<Academia de Código_>", "<Academia do Código_>", "< Escola do código_>"}),
    BEST_BOOTCAMP("Where's the best bootcamp of <Academia de Código_>?", new String[]{"FUNdão", "TECHceira", "LisBOA and Porto"}),
    NAME_BOOTCAMP8("What could have been the name of the 8th bootcamp?", new String[]{"Shellshichas", "SailorBit.Js", "Atomic20"}),
    NAME_8BOOTCAMP("What is the name of the 8th bootcamp?", new String[]{"Sshavages", "SausageParty", "Pusshies"}),
    NAME_11BOOTCAMP("What is the name of the 11th bootcamp?", new String[]{"Enuminatti", "Boolefighters", "Hexallents"}),
    NAME_14BOOTCAMP("What is the name of the 14th bootcamp?", new String[]{"Haltistas", "Sshpesshials", "Sshtupids"}),
    NAME_16BOOTCAMP("What os the name of the 16th bootcamp?", new String[]{"Stormrooters", "Haltistas", "Bitlers"}),
    FUNDAO_CAPITAL("Which is Fundão's capital city?", new String[]{"Casino Fundanense", "Bizas", "Rock Pizza"}),
    BRITNEY_SPEARS("What is the best song by Britney Spears?", new String[]{"Toxic", "One more time", "I'm not a girl not yet a woman"}),
    FUNDAO_MAYOR("Who is the mayor of Fundão?", new String[]{"Paulo Fernandes", "Luís Gavinhos", "Paulo Águas"}),
    TRYING("Which of the following is the best catchphrase?", new String[]{"Do you want to be my psvm?", "Can your offer() me your queue?", "I like you T t parametrization"}),
    EXCITING("What excites a programmer the most?", new String[]{"The body of a method", "A naked human body", "A dead body"});


    private static Set<QuestionSelector> removedQuestions = new HashSet<>();

    private String[] answers;
    private String statement;


    RandomQuestions(String statement, String[] answers) {
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


}
