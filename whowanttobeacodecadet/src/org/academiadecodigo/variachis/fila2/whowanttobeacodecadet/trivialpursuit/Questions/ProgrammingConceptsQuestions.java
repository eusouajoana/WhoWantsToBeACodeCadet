package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions;

import java.util.*;

public enum ProgrammingConceptsQuestions implements Question{

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
    HASHCODE("Which of these is a nice key to generate your hashCode from?", new String[]{"Number of asses", "Age", "Color of the hair"}),
    NESTED("Which are the 4 types of Nested Classes?", new String[]{"Inner, Local, Anonymous and Static", "Abstract, Outer, Global, Interior", "Variable, Method, Function, Classy"}),
    STATIC("What are Static properties?", new String[]{"Properties associated with the class, rather than with a specific object", "Properties that don't change", "Daniel's feet during oral presentations"}),
    QUEUE("What is a queue?", new String[]{"A data structure", "FIFO", "The thing you encounter when you go to the bank"}),
    COMPOSITION("What is Composition?", new String[]{"Design technique to implement HAS-A relationship in classes", "Design technique to implement IS-A relationship in classes", "Those texts you wrote in school"}),
    INHERITANCE("What is Inheritance?", new String[]{"Design technique to implement IS-A relationship in classes", "Design technique to implement HAS-A relationship in classes", "When an uncle you didn't even know, dies and you suddenly get rich"}),
    INSTANCE("Which of these classes can't be instantiated?", new String[]{"Abstract classes", "Interfaces", "Static classes"}),
    EXCEPTION("What is an Exception?", new String[]{"An abnormal event which occurs during the execution of a program and disrupts its normal flow", "The things that confirm the rule", "An error"}),
    BRACKETS("What is the true name of these symbols: < > ?", new String[]{"Diamond Brackets", "Diamond Operators", "Angle brackets"}),
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
    GIT("Who inventend GIT?", new String[]{"Linus Torvalds", "Richard Stallman", "A tua prima"});


    private static Set<QuestionSelector> removedQuestions = new HashSet<>();

    private String[] answers;
    private String statement;


    ProgrammingConceptsQuestions(String statement, String[] answers) {
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
