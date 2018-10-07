package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.MastersQuestions;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.CodeCadetsQuestions;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.ProgrammingConceptsQuestions;
import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.RandomQuestions;

import java.util.*;

public class QuestionSelector {

    public enum Type {
        MASTERS,
        CODE_CADETS,
        PROGRAMMING_CONCEPTS,
        RANDOM;
    }




    // Associar o tipo às suas instâncias
    private static Map<Type, Enum[]> map;
    private static List<Enum> removedQuestions;

    // Criar um mapa que faz essa associação
    public static void init() {
        map = new HashMap<>();
        map.put(Type.MASTERS, MastersQuestions.values());
        map.put(Type.CODE_CADETS, CodeCadetsQuestions.values());
        map.put(Type.PROGRAMMING_CONCEPTS, ProgrammingConceptsQuestions.values());
        map.put(Type.RANDOM, RandomQuestions.values());
    }



    public static void getAllQuestions(Type type) {
        System.out.println(Arrays.toString(map.get(type)));
    }



    //get all answers for a specific question
    public static String[] getAnswers(Type type) {

     Type category = randomCategory();
     Object question = getRandomQuestions(category);

        question.getAnswers();


    }




    public static String getRandomQuestion(Type type) {
        System.out.println(Arrays.toString(map.get(type)));
        return Arrays.toString(map.get(type));
    }


    public static  getRandomQuestions(Type type) {
        switch (type) {
            case MASTERS:
                return MastersQuestions.values()[(int)(Math.random()* MastersQuestions.values().length)];
            case CODE_CADETS:
                return CodeCadetsQuestions.values()[(int)(Math.random()* CodeCadetsQuestions.values().length)];
            case RANDOM:
                return RandomQuestions.values()[(int)(Math.random()* RandomQuestions.values().length)];
            case PROGRAMMING_CONCEPTS:
                return ProgrammingConceptsQuestions.values()[(int)(Math.random()* ProgrammingConceptsQuestions.values().length)];
        }
        return null;
    }




    public static Type randomCategory() {
        // Enfiar todas as classes numa lista
        List<Type> values = new LinkedList<>(map.keySet());
        int randomNumber = (int) (Math.random() * values.size());

        // Tirar uma classe random da lista
        return values.get(randomNumber);

    }


}
