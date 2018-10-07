package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions;

import java.util.*;

public enum CodeCadetsQuestions {

    FELIPE_COUNTRY("Where's Felipe from?", new String[]{"Braziuziu", "Argentina", "Peru"}),
    CRIS_CITY("Where's Cristiano from?", new String[]{"Texas City", "Tortosendo City", "Teixoso"}),
    SARA_DOG("What's Sara's dog name?", new String[]{"Gropy", "Snoopy", "Foguete"}),
    SARA_WORD("What's Sara's favorite word?", new String[]{"Fossssca-sssse", "Piuto", "Pissscina"}),
    FELIPE_WIFE("What's the name of Felipe's wife?", new String[]{"Patrícia", "Luana", "Thais"}),
    DANIEL_DAUGHTER("What's the name of Daniel's daughter", new String[]{"Lara", "Laura", "Daniela"}),
    VITOR_FROM("Where is Vitor from?", new String[]{"Batalha", "Leiria", "Abrantes"}),
    DAVID_LOVES("What does David love?", new String[]{"Javascript", "His daughter", "His wife"}),
    IVO("What is Ivo proud of?", new String[]{"He lost 10kg in 1 and half months", "He is a father of a little man called Ivo Júnior", "He bombates code"}),
    FILIPE_FROM("Where's Filipe from?", new String[]{"Feira", "KDK", "Puerto carago"}),
    IVO_LUNCH("What does Ivo like for lunch?", new String[]{"Sliced cucumber", "A pizza with extra cheese", "Sausages"}),
    MIGUEL_LOVES("What does Miguel love?", new String[]{"Barracas", "Valadas", "Gazetas"}),
    JOAO_AFRAID("What is João afraid of)", new String[]{"The male touch", "Scary clowns", "No tobacco"}),
    GUSTAVO_NICKNAME("What's Gustavo's nickname?", new String[]{"Pirilampo mágico", "Zuca", "Lady baby"}),
    RAFAEL_WHO("Who was Rafael?", new String[]{"A pussy", "A philosopher", "A macho man"}),
    JOANA_AFRAID("What's Joana afraid of?", new String[]{"Midgets", "Clowns", "Code exercises"}),
    JOANA_SNEEZE("How many times does Joana usually sneeze?", new String[]{"7 times", "5 times", "1 time"}),
    NAME_RUI("What's Rui's name on Saturday?", new String[]{"Samantha", "Samanta", "Sammanta"}),
    CID_AGE("What's Cid's age?", new String[]{"1000", "45", "20"}),
    CRIS_BAND("What's Cristiano's favorite music band?", new String[]{"Metallica", "Guns&Roses", "Maria Leal"}),
    ROLAO_FAVORITE("What's Rolão's favorite thing?", new String[]{"Dick gifs", "Dick videos", "Dick photos"}),
    JERONIMO_FUNDAO("What's Jeronimo's job on Fundão?", new String[]{"Jihadist", "<Code Cadet>", "Belly dancer"}),
    RODRIGO_SECRET("What's Rodrigo's best kept secret?", new String[]{"He weighted 242 pounds", "He was a ballet dancer", "He was married"}),
    CID_FAVORITE("What's Cid's favorite thing?", new String[]{"Kittens", "Puppies", "People"}),
    CID_RISKY("What's the riskiest thing Cid has ever done?", new String[]{"Jump from a plane with a parachute", "Bungee-jumping", "Drag races"}),
    CRIS_MOVIE("What's Cristiano's favorite movie?", new String[]{"The Shawshank Redemption", "Pulp Fiction", "A canção de Lisboa"}),
    MIGUEL_PENIS("What does Miguel call his penis?", new String[]{"Cánhão", "Bacamarte", "Mastodonte"}),
    FELIPE_HAIDRESSER("What did Felipe's hairdresser used to say to him?", new String[]{"Porque você fica escondendo esse rostinho de Tom Cruise?", "Você tem olho de lince", "Vamo virar e depilar sua bunda"}),
    TIAGO_FOLAR("How does Tiago eat his Folar de Chaves?", new String[]{"À lambão", "With chocolate ice cream", "With butter and salted ham"}),
    FELIPE_WORD("Which new word did Felipe learn on the bootcamp?", new String[]{"Cona", "Crica", "Snaita"}),
    DANIEL_GIRLFRIEND("What's the name of Daniel's platonic girlfriend?", new String[]{"Lolita", "Samantha", "Marlene"}),
    QUITERES("What did Quiteres do when he was 16 years old?", new String[]{"He run over 3 people", "He went to a stripper club", "He was abducted by aliens"}),
    RAFAEL_CRUSH("Who was Rafael's biggest crush when he was a kid?", new String[]{"Hermione", "Bulma", "Snow White"}),
    DANCER("Who is the best Variachi's dancer?", new String[]{"Miguel", "Gustavo", "Daniel"}),
    TIAGO_DREAM("What's Tiago's lifelong dream?", new String[]{"To be a serial killer", "To be a ballerina", "To be a butcher"}),
    IVO_DO("What does Ivo do?", new String[]{"He bombates code", "He punches the mac everyday", "He watches videos only wearing underpants"}),
    PALMA_FETISH("What's Palma's newest fetish?", new String[]{"Imagining Sara and Joana in a lesbian relationship", "Watching migdet porn", "Getting a boner with programming videos"}),
    VITOR_CRUSH("Which is Vitor's favorite Anime?", new String[]{"Hunter x Hunter", "One punch man", "One piece"});


    private static Set<QuestionSelector> removedQuestions = new HashSet<>();

    private String[] answers;
    private String statement;


    CodeCadetsQuestions(String statement, String[] answers) {
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

