package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions;

import java.util.*;

public class QuestionSelector {

    public enum Type {
        MASTERS,
        CODE_CADETS,
        PROGRAMMING_CONCEPTS,
        ACADEMIADECODIGO;
    }


    // Associar o tipo às suas instâncias
    private static Map<Type, Question[]> map;
    private static List<Enum> removedQuestions;

    // Criar um mapa que faz essa associação
    public static void init() {
        map = new HashMap<>();
        map.put(Type.MASTERS, MastersQuestions.values());
        map.put(Type.CODE_CADETS, CodeCadetsQuestions.values());
        map.put(Type.PROGRAMMING_CONCEPTS, ProgrammingConceptsQuestions.values());
        map.put(Type.ACADEMIADECODIGO, AcademiaQuestions.values());
    }


    public static void getAllQuestions(Type type) {
        System.out.println(Arrays.toString(map.get(type)));
    }


    //get all answers for a specific question
    public static List<String> getAnswers(Type type) {

        switch (type) {
            case MASTERS:
                return (getRandomQuestions(Type.MASTERS)).getAnswers();

            case PROGRAMMING_CONCEPTS:
                return (getRandomQuestions(Type.PROGRAMMING_CONCEPTS)).getAnswers();

            case ACADEMIADECODIGO:
                return (getRandomQuestions(Type.ACADEMIADECODIGO)).getAnswers();

            case CODE_CADETS:
                return (getRandomQuestions(Type.CODE_CADETS)).getAnswers();
        }
        return null;
    }


    public static String getRandomQuestion(Type type) {
        System.out.println(Arrays.toString(map.get(type)));
        return Arrays.toString(map.get(type));
    }


    public static Question getRandomQuestions(Type type) {
        switch (type) {
            case MASTERS:
                return MastersQuestions.values()[(int) (Math.random() * MastersQuestions.values().length)];

            case CODE_CADETS:
                return CodeCadetsQuestions.values()[(int) (Math.random() * CodeCadetsQuestions.values().length)];

            case ACADEMIADECODIGO:
                return AcademiaQuestions.values()[(int) (Math.random() * AcademiaQuestions.values().length)];

            case PROGRAMMING_CONCEPTS:
                return ProgrammingConceptsQuestions.values()[(int) (Math.random() * ProgrammingConceptsQuestions.values().length)];
        }
        return null;
    }


    public static Type randomCategory() {

        Type[] value = Type.values();
        int randomNumber = (int) (Math.random() * value.length);

        // Tirar uma classe random da lista
        return value[randomNumber];

    }


}
