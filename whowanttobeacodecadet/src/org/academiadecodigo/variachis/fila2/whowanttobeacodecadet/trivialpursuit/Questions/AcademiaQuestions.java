package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions;

import java.util.*;

public enum AcademiaQuestions implements Question{

    ACADEMY_NAME("What is the correct name of the Academy?", new String[]{"<Academia de Código_>", "<Academia do Código_>", "< Escola do código_>"}),
    BEST_BOOTCAMP("Where's the best bootcamp of <Academia de Código_>?", new String[]{"FUNdão", "TECHceira", "LisBOA and Porto"}),
    NAME_BOOTCAMP8("What could have been the name of the 8th bootcamp?", new String[]{"Shellshichas", "SailorBit.Js", "Atomic20"}),
    NAME_8BOOTCAMP("What is the name of the 8th bootcamp?", new String[]{"Sshavages", "SausageParty", "Pusshies"}),
    NAME_11BOOTCAMP("What is the name of the 11th bootcamp?", new String[]{"Enuminatti", "Boolefighters", "Hexallents"}),
    NAME_14BOOTCAMP("What is the name of the 14th bootcamp?", new String[]{"Haltistas", "Sshpesshials", "Sshtupids"}),
    NAME_16BOOTCAMP("What os the name of the 16th bootcamp?", new String[]{"Stormrooters", "Haltistas", "Bitlers"}),
    FUNDAO_CAPITAL("Which is Fundão's capital city?", new String[]{"Casino Fundanense", "Bizas", "Rock Pizza"}),
    ROBIN_SKILL("What is Robin's best soft skill?", new String[]{"Blinking his left eye", "Cleaning", "Smoking weed"}),
    FUNDAO_MAYOR("Who is the mayor of Fundão?", new String[]{"Paulo Fernandes", "Luís Gavinhos", "Paulo Águas"}),
    TRYING("Which of the following is the best catchphrase?", new String[]{"Do you want to be my psvm?", "Can your offer() me your queue?", "I like you T t parametrization"}),
    EXCITING("What excites a programmer the most?", new String[]{"The body of a method", "A naked human body", "A dead body"}),
    LAUNCH("What is the foundation date of <Academia de Código_>?", new String[] {"21 de Janeiro de 2015", "15 de Julho de 1987", "25 de Setembro de 2014"}),
    MOTTO("Which of the following is the <Academia de Código_>'s motto?", new String[] {"Código Ergo Sum", "Cogito Ergo Sum", "Carpe Diem"}),
    MOTTO_MEAN("What does the <Academia de Código_> motto mean?", new String[] {"I code, therefore I am", "I think, therefore I am", "I cry, therefore I am"}),
    DURATION("How long are the Bootcamps?", new String[] {"14 weeks", "4 months", "14 years"}),
    COFOUNDERS("Who are the two co-founders of <Academia de Código_>?", new String[] {"Domingos Guimarães && João Magalhães", "Rui Ferrão && Catarina Campino", "Pedro Antoninho && André Machado"}),
    JEDI("How many Jedi Master Coders does <Academia de Código_> currently have?", new String[] {"4", "5", "6"}),
    KEN_CODI("Who is the Obi-Wan KenCodi of <Academia de Código_>?", new String[] {"Rui Ferrão", "Pedro Brighenti", "Pedro Antoninho"}),
    FULLSTACK("What do we like?", new String[] {"Full Stack", "Front-end", "Back-end"}),
    INFINITE_LOOP("What's the only situation when you need an infinite loop?", new String[] {"While !bootcampEnd : Eat, sleep, code, repeat", "While !SrZéclosed: Média, Super, drink, repeat", "While inTheBootcamp: Scream, cry, despair, repeat"}),
    FINISH("What are you when you finish the bootcamp?", new String[] {"A <Junior Fullstack Developer>", "A <Padawan Master Coder>", "A <Human Rag>"});


    private static Set<QuestionSelector> removedQuestions = new HashSet<>();

    private String[] answers;
    private String statement;


    AcademiaQuestions(String statement, String[] answers) {
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
