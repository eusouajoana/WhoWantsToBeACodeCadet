package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet;

public class QuestionSelector {

    public enum Type {
        MASTERS,
        CODE_CADETS,
        PROGRAMMING_CONCEPTS,
        ACADEMIA_DE_CODIGO;
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
        map.put(Type.ACADEMIA_DE_CODIGO, AcademiaDeCodigoQuestions.values());
    }



    public static void getAllQuestions(Type type) {
        System.out.println(Arrays.toString(map.get(type)));
    }



    public static Type randomCategory() {
        // Enfiar todas as classes numa lista
        List<Type> values = new LinkedList<>(map.keySet());
        int randomNumber = (int) (Math.random() * values.size());

        // Tirar uma classe random da lista
        return values.get(randomNumber);

    }


}
