package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import java.util.*;

public enum Question {

    FILIPE_CAT_NAME("What does Filipe call his cat?", new String[]{"Lily", "Mix", "Tareco"}),
    FELIPE_COUNTRY("Where's Felipe from?", new String[]{"Braziuziu", "Argentina", "Peru"}),
    CRIS_CITY("Where's Cristiano from?", new String[]{"Texas City", "Tortosendo City", "Teixoso"}),
    SARA_DOG("What's Sara's dog name?", new String[]{"Gropy", "Snoopy", "Foguete"}),
    SARA_WORD("What's Sara's favorite word?", new String[]{"Fossssca-sssse", "Piuto", "Pissscina"}),
    FILIPE_SENTENCE("What's Filipe's favorite sentence?", new String[] {"Fasshentido", "Maltinha...", "Ta foder"}),
    SID_SENTENCE("What's Sid's favorite sentence?", new String[] {"Fixe?", "Complhar", "A minha prima"}),
    JORGE_SENTENCE("What's Jorge's favorite sentence?", new String[] {"Vou só fazer um disclaimer", "Não teve piada?", ""}),
    SERINGAS_SENTENCE("What's Seringa's favorite sentence?", new String[] {"Curti bué da tua cena", "ssssssssssss", "A gente"}),
    JEDI_MASTERS("Who are the 4 Jedi Masters of <Academia de Código_>?", new String[] {"Jorge, ", "", ""}),
    SID_ALTEREGO("Who is Sid's alter ego?", new String[] {"Beyoncé", "Chris Cornell", "Tina Turner"}),
    FELIPE_WIFE("What's the name of Felipe's wife?", new String[] {"Patrícia", "Luana", "Thais"}),
    DANIEL_DAUGHTER("What's the name of Daniel's daughter", new String[] {"Lara", "Laura", "Daniela"}),
    VITOR_FROM("Where is Vitor from?", new String[] {"Batalha", "Leiria", "Abrantes"}),
    DAVID_LOVES("What does David love?", new String[] {"Javascript", "His daughter", "His wife"}),
    ROLAO_FRIEND("Who is Rolão's best friend?", new String[] {"Robin", "Rute", "The code"}),
    ACADEMY_NAME("What is the correct name of the Academy?", new String[] {"<Academia de Código_>", "<Academia do Código_>", "< CodeCademy_>"}),
    FILIPE_FROM("Where's Filipe from?", new String[] {"Caxinas", "KDK", "Puerto carago"}),
    BEST_BOOTCAMP("Where's the best bootcamp of <Academia de Código_>?", new String[] {"FUNdão", "TECHceira", "LisBOA and Porto"}),
    IVO_LUNCH("What does Ivo like for lunch?", new String[] {"Sliced cucumber", "A pizza with extra cheese", "Sausages"}),
    MIGUEL_LOVES("What does Miguel love?", new String[] {"Barracas", "Valadas", "Gazetas"}),
    JOAO_AFRAID("What is João afraid of)", new String[] {"The male touch", "Scary clowns", "No tobbaco"}),
    GUSTAVO_NICKNAME("What's Gustavo's nickname?", new String[] {"Pirilampo mágico", "Zuca", "Lady baby"}),
    RAFAEL_WHO("Who was Rafael?", new String[] {"A pussy", "A philosopher", "A macho man"}),
    JOANA_AFRAID("What's Joana afraid of?", new String[] {"Midgets", "Clowns", "Code exercises"}),
    JOANA_SNEEZE("How many times does Joana usually sneeze?", new String[] {"7 times", "5 times", "1 time"}),



    //perguntas sobre o fundão
    //perguntas sobre conceitos



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
