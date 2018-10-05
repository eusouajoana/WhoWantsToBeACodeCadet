package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

import java.util.*;

public enum Question {

    FILIPE_CAT_NAME("What does Filipe call his cat?", new String[]{"Lily", "Mix", "Tareco"}),
    FELIPE_COUNTRY("Where's Felipe from?", new String[]{"Braziuziu", "Argentina", "Peru"}),
    CRIS_CITY("Where's Cristiano from?", new String[]{"Texas City", "Tortosendo City", "Teixoso"}),
    SARA_DOG("What's Sara's dog name?", new String[]{"Gropy", "Snoopy", "Foguete"}),
    SARA_WORD("What's Sara's favorite word?", new String[]{"Fossssca-sssse", "Piuto", "Pissscina"}),
    FILIPE_SENTENCE("What's Filipe's favorite sentence?", new String[]{"Fasshentido", "Maltinha...", "Ta foder"}),
    SID_SENTENCE("What's Sid's favorite sentence?", new String[]{"Fixe?", "Complhar", "A minha prima"}),
    JORGE_SENTENCE("What's Jorge's favorite sentence?", new String[]{"Vou só fazer um disclaimer", "Não teve piada?", "A tua prima"}),
    SERINGAS_SENTENCE("What's Seringa's favorite sentence?", new String[]{"Curti bué da tua cena", "ssssssssssss", "A gente vamos"}),
    JEDI_MASTERS("Who are the 4 Jedi Masters of <Academia de Código_>?", new String[]{"Jorge, Sérgio, Rodolfo, Antoninho", "Rafael, Soraia, Ferrão, António", "Catarina, Danlo, Brighenti, Sérgio"}),
    SID_ALTEREGO("Who is Sid's alter ego?", new String[]{"Beyoncé", "Chris Cornell", "Tina Turner"}),
    FELIPE_WIFE("What's the name of Felipe's wife?", new String[]{"Patrícia", "Luana", "Thais"}),
    DANIEL_DAUGHTER("What's the name of Daniel's daughter", new String[]{"Lara", "Laura", "Daniela"}),
    VITOR_FROM("Where is Vitor from?", new String[]{"Batalha", "Leiria", "Abrantes"}),
    DAVID_LOVES("What does David love?", new String[]{"Javascript", "His daughter", "His wife"}),
    ROLAO_FRIEND("Who is Rolão's best friend?", new String[]{"Robin", "Rute", "The code"}),
    ACADEMY_NAME("What is the correct name of the Academy?", new String[]{"<Academia de Código_>", "<Academia do Código_>", "< Escola do código_>"}),
    FILIPE_FROM("Where's Filipe from?", new String[]{"Feira", "KDK", "Puerto carago"}),
    BEST_BOOTCAMP("Where's the best bootcamp of <Academia de Código_>?", new String[]{"FUNdão", "TECHceira", "LisBOA and Porto"}),
    IVO_LUNCH("What does Ivo like for lunch?", new String[]{"Sliced cucumber", "A pizza with extra cheese", "Sausages"}),
    MIGUEL_LOVES("What does Miguel love?", new String[]{"Barracas", "Valadas", "Gazetas"}),
    JOAO_AFRAID("What is João afraid of)", new String[]{"The male touch", "Scary clowns", "No tobacco"}),
    GUSTAVO_NICKNAME("What's Gustavo's nickname?", new String[]{"Pirilampo mágico", "Zuca", "Lady baby"}),
    RAFAEL_WHO("Who was Rafael?", new String[]{"A pussy", "A philosopher", "A macho man"}),
    JOANA_AFRAID("What's Joana afraid of?", new String[]{"Midgets", "Clowns", "Code exercises"}),
    JOANA_SNEEZE("How many times does Joana usually sneeze?", new String[]{"7 times", "5 times", "1 time"}),
    NAME_BOOTCAMP8("What could have been the name of the 8th bootcamp?", new String[]{"Shellshichas", "SailorBit.Js", "Atomic20"}),
    NAME_RUI("What's Rui's name on Saturday?", new String[]{"Samantha", "Samanta", "Sammanta"}),
    CID_AGE("What's Cid's age?", new String[]{"1000", "45", "20"}),
    CRIS_BAND("What's Cristiano's favorite music band?", new String[]{"Metallica", "Guns&Roses", "Maria Leal"}),
    ROLAO_FAVORITE("What's Rolão's favorite thing?", new String[]{"Dick gifs", "Dick videos", "Dick photos"}),
    JORGE_SKILL("What's the only skill that Jorge doesn't have?", new String[]{"Make jokes", "Build a desk", "Use the mouse"}),
    JERONIMO_FUNDAO("What's Jeronimo's job on Fundão?", new String[]{"Jihadist", "<Code Cadet>", "Belly dancer"}),
    RODRIGO_SECRET("What's Rodrigo's best kept secret?", new String[]{"He weighted 242 pounds", "He was a ballet dancer", "He was married"}),
    CID_FAVORITE("What's Cid's favorite thing?", new String[]{"Kittens", "Puppies", "People"}),
    CID_RISKY("What's the riskiest thing Cid has ever done?", new String[]{"Jump from a plane with a parachute", "Bungee-jumping", "Drag races"}),
    CRIS_MOVIE("What's Cristiano's favorite movie?", new String[]{"The Shawshank Redemption", "Pulp Fiction", "A canção de Lisboa"}),
    MIGUEL_PENIS("What does Miguel call his penis?", new String[]{"Cánhão", "Bacamarte", "Mastodonte"}),
    FELIPE_HAIDRESSER("What did Felipe's hairdresser used to say to him?", new String[]{"Porque você fica escondendo esse rostinho de Tom Cruise?", "Você tem olho de lince", "Vamo virar e depilar sua bunda"}),
    TIAGO_FOLAR("How does Tiago eat his Folar de Chaves?", new String[]{"À lambão", "With chocolate ice cream", "With butter and salted ham"}),
    FELIPE_WORD("Which new word did Felipe learn on the bootcamp?", new String[]{"Cona", "Crica", "Snaita"}),
    FILIPE_TEA("What is the pussy tea that Filipe drinks almost every day?", new String[]{"Chá verde limão", "Chá de pau de cabinda", "Chá de pés de cereja"}),
    DANIEL_GIRLFRIEND("What's the name of Daniel's platonic girlfriend?", new String[]{"Lolita", "Samantha", "Marlene"}),
    NAME_8BOOTCAMP("What is the name of the 8th bootcamp?", new String[]{"Sshavages", "SausageParty", "Pusshies"}),
    NAME_11BOOTCAMP("What is the name of the 11th bootcamp?", new String[]{"Enuminatti", "Boolefighters", "Hexallents"}),
    NAME_14BOOTCAMP("What is the name of the 14th bootcamp?", new String[]{"Haltistas", "Sshpesshials", "Sshtupids"}),
    NAME_16BOOTCAMP("What os the name of the 16th bootcamp?", new String[]{"Stormrooters", "Haltistas", "Bitlers"}),
    TRANSISTOR("What's is a transistor?", new String[]{"A device used to amplify or switch electronic signals and electrical power", "Only God knows (and by God I mean master Jorge)", "A little device that acts like a switch"}),
    NAME_THREAD("What's the name of our Thread of detail?", new String[]{"António Castro", "Catarina Campino", "Antoninho"}),
    SIGNAL("What's the main advantage of difference of digital signals over analog signals?", new String[]{" Immunity to noise interference", "More quality of sound or image", "It's the fucking same"}),
    NAME_HEAD("What's the name of our Head of detail?", new String[]{"Catarina Campino", "António Castro", "Rui Ferrão"}),
    ELECTRIC_CURRENT("What is the definition of electric current?", new String[]{"A flow of electric charge.", "Electrons and protons travelling in space", "Neutrons being neutral"}),
    BINARY("How do we write the number 69 in binary?", new String[]{"01000101", "10010100", "01011010"}),
    HEXADECIMAL("How do we write the numbers 45 and 69 in hexadecimal?", new String[]{" 2D and 45", "F0 and 20", "4B and FF"}),
    BOOLEAN("What do we call a variable that can be either true or false?", new String[]{"Boolean", "Boole", "Boolenean (Go Rafael!)"}),
    LOGIC_GATES("What is a Logic Gate?", new String[]{"A device implementing a boolean logical operation on one or more binary inputs and producing a single binary output", "Who knows?", "A former leader of a right wing party"}),
    ALAN_TURING("Who was Alan Turing", new String[]{"A gay jew", "The father of computer science", "A tua prima"}),
    ADA_LOVELACE("Who was Ada Lovalace", new String[]{"Our mother of programming", "Just a little thief", "A tua prima"}),
    RICHARD_STALLMAN("What is the most famous song by Richard Stallman?", new String[]{"Free Software Song", "Hakuna Matata", "Estupidamente apaixonado"}),
    PROGRAMMING_LAGUAGES("Which of these are Programming Languages?", new String[]{"Hugo, JADE, ChucK, Flavors, LilyPond, Curry, Mesa, Pure", "Java, Farfetch, Dartrix, Assembly, C#, C++, Fortress, Celebi", "LegoScript, VisualBasic, Donphan, Ada, Dunsparce, Ninjask, GEORGE, Viper"}),
    LORDS_JAVA("Who is the mister of Java?", new String[]{"James Gosling", "Dennis Ritchie", "Jorge Jesus"}),
    TEXT_EDITOR("What is your favorite text editor?", new String[]{"VIM", "emacs", "Microsoft Office Word 4ever"}),
    FILESYSTEM("What does the FileSystem do?", new String[]{"Defines the structure and the rules used to read, write and maintain data on a disk", "Ask Jorge", "It goes to Sr. Zé and buys beer"}),
    PROCESS("What is a process?", new String[]{"A program in execution in memory", "Understanding master Jorge's jokes", "A sequence of instructions"}),
    FUNDAO_CAPITAL("Which is Fundão's capital city?", new String[]{"Casino Fundanense", "Bizas", "Rock Pizza"}),
    PALMA_FETISH("What's Palma's newest fetish?", new String[]{"Imagining Sara and Joana in a lesbian relationship", "Watching migdet porn", "Getting a boner with programming videos"}),
    GIT("Who inventend GIT?", new String[]{"Linus Torvalds", "Richard Stallman", "A tua prima"}),
    TRIGGER("What are the masters triggered by?", new String[]{"Non idented code", "Stupid questions and wrong answers", "Sagres"}),
    JAVA("What type of language is Java?", new String[]{"Compiled/Interpreted", "Compiled", "Interpreted"}),
    JVM("What is the JVM?", new String[]{"Your new best friend", "A virtual machine that enables a computer to run Java programs as well as programs written in other languages and compiled to Java bytecode", "Witchcraft"}),
    STRING("Which of these is a String?", new String[]{"'2'", "True", "Java"}),
    ARRAY("What is an array?", new String[]{"A container object that holds a fixed number of values of a single type", "A cool place where you can hold many variables", "The super class of QuimbARRAYers"}),
    INTERFACE("What is an interface?", new String[]{"Polymorphism on steroids", "Stuff you can implement in your classes", "Gifts from the misters of Java"}),
    ELSE("What is/are the forbidden word(s) when writing code?", new String[]{"Else", "Rage quit", "Fuck this shit"}),
    IDE("What is an IDE?", new String[]{"A set of programming tools for writing applications", "Where you write your shitty code", "Our lord and savior"}),
    OBJECTS("What is an object?", new String[]{"Entities that encapsulate state and behaviour", "Everything is an object", "Something your own, like a dildo"}),
    METHOD("What is a method?", new String[]{"In a class, is where you define how an object must perform a functionality", "A method is a function defined in a class.", "A pain in the bum"}),
    CONSTRUCTOR("What's the use of a constructor?", new String[]{"A method called whenever we create a new object", "Where baby instances come from", "They're like the storks of Java"}),
    ENCAPSULATION("What is encapsulation?", new String[]{"Hiding data and implementation from the outside and providing methods to its access", "When you lock yourself on the bathroom, crying", "Putting an object in a time capsule"}),
    PILLARS("Which are the 4 'plhares' of OOP?", new String[]{"Abstraction, Encapsulation, Inheritance, Polymorphism", "Identation, identation, identation, identation", "Beer, Profanity, Rage quit, Weed"}),
    VITOR_CRUSH("Which is Vitor's favorite Anime?", new String[]{"Hunter x Hunter", "One punch man", "One piece"}),
    BRITNEY_SPEARS("What is the best song by Britney Spears?", new String[]{"Toxic", "One more time", "I'm not a girl not yet a woman"}),
    STATIC("What are Static properties?", new String[]{"Properties associated with the class, rather than with a specific object", "Properties that don't change", "Daniel's feet during oral presentations"}),
    FUNDAO_MAYOR("Who is the mayor of Fundão?", new String[]{"Paulo Fernandes", "Luís Gavinhos", "Paulo Águas"}),
    COMPOSITION("What is Composition?", new String[]{"Design technique to implement HAS-A relationship in classes", "Design technique to implement IS-A relationship in classes", "Those texts you wrote in school"}),
    INHERITANCE("What is Inheritance?", new String[]{"Design technique to implement IS-A relationship in classes", "Design technique to implement HAS-A relationship in classes", "When an uncle you didn't even know, dies and you suddenly get rich"}),
    INSTANCE("Which of these classes can't be instantiated?", new String[]{"Abstract classes", "Interfaces", "Static classes"}),
    EXCEPTION("What is an Exception?", new String[]{"An abnormal event which occurs during the execution of a program and disrupts its normal flow", "The things that confirm the rule", "An error"}),
    TRYING("Which is the best catchphrase?", new String[]{"Do you want to be my psvm?", "Can your offer() me your queue?", "I like you T t parametrization"}),
    BRACKETS("What is the true name of these symbols: < > ?", new String[]{"Diamond Brackets", "Diamond Operators", "Angle brackets"}),
    TIAGO_DREAM("What's Tiago's lifelong dream?", new String[]{"To be a serial killer", "To be a ballerina", "To be a butcher"}),
    QUEUE("What is a queue?", new String[]{"A data structure", "FIFO", "The thing you encounter when you go to the bank"}),
    IVO_DO("What does Ivo do?", new String[]{"He bombates code", "He punches the mac everyday", "He watches videos only wearing underpants"}),
    HASHCODE("Which of these is a nice key to generate your hashCode from?", new String[]{"Number of asses", "Age", "Color of the hair"}),
    NESTED("Which are the 4 types of Nested Classes?", new String[]{"Inner, Local, Anonymous and Static", "Abstract, Outer, Global, Interior", "Variable, Method, Function, Classy"}),
    LIES("What is the biggest lie the masters told us in the Bootcamp?", new String[]{"That 'Simple' Graphics were simple", "That Master Jorge invented LinkedLists", "That we could trust them"}),
    EXCITING("What excites a programmer the most?", new String[]{"The body of a method", "A naked human body", "A dead body"}),
    QUITERES("What did Quiteres do when he was 16 years old?", new String[]{"He run over 3 people", "He went to a stripper club", "He was abducted by aliens"}),
    RAFAEL_CRUSH("Who was Rafael's biggest crush when he was a kid?", new String[]{"Hermione", "Bulma", "Snow White"}),
    DANCER("Who is the best Variachi's dancer?", new String[]{"Miguel", "Gustavo", "Daniel"});


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


    public static Question giveQuestion() {
        Question question = getRandom();
        return removedQuestions.contains(question) ? giveQuestion() : question;
    }


    private static Question getRandom() {
        return Question.values()[(int) (Math.random() * Question.values().length)];
    }

}
