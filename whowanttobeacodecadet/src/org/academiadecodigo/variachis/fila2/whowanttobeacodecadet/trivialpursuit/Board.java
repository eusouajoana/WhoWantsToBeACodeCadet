package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit;

import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.QuestionSelector;

import java.util.*;

public class Board {

    //Properties
    private Map<String, Square> squareMap;
    private Dice dice;


    // ------- Constructor -----------

    public Board() {
        this.squareMap = new HashMap<>();
        this.dice = new Dice();
        this.position();
    }

    public void position() {

        //rows
        for (int i = 1; i <= 11; i++) {
            //cols
            for (int j = 1; j <= 11; j++) {

                //completed rows
                if (i == 1 || i == 6 || i == 11) {

                    //identifying position of the square in a key
                    String key = i + "e" + j;

                    //instantiating a square
                    Square square = new Square();

                    String leftNeighbour = i + "e" + (j - 1);
                    String upNeighbour = (i - 1) + "e" + j;
                    String rightNeighbour = i + "e" + (j + 1);
                    String downNeighbour = (i + 1) + "e" + j;

                    //adding neighbours to square NeighboursList
                    square.getNeighboursList().add(leftNeighbour);
                    square.getNeighboursList().add(upNeighbour);
                    square.getNeighboursList().add(rightNeighbour);
                    square.getNeighboursList().add(downNeighbour);

                    //putting square in the map
                    squareMap.put(key, square);
                    continue;
                }

                //empty rows
                if (j != 1 && j != 6 && j != 11) {
                    continue;
                }

                int[] vector = {i, j};

                //setting key
                String key = i + "e" + j;

                //instantiating a square
                Square square = new Square();

                String leftNeighbour = i + "e" + (j - 1);
                String upNeighbour = (i - 1) + "e" + j;
                String rightNeighbour = i + "e" + (j + 1);
                String downNeighbour = (i + 1) + "e" + j;


                //adding neighbours to square NeighboursList
                square.getNeighboursList().add(leftNeighbour);
                square.getNeighboursList().add(upNeighbour);
                square.getNeighboursList().add(rightNeighbour);
                square.getNeighboursList().add(downNeighbour);


                //putting square in the map
                squareMap.put(key, square);
            }

        }


    }

    //getter of the map
    public Map<String, Square> getSquareMap() {
        return squareMap;
    }


    //Board offer set of possible paths to the Player according to the dice result
    public Set<String> paths(String actualPosition, int dice) {

        //Print Dice
        System.out.println("*--------------- Board Tests --------------------*");
        System.out.println("Dice Result : " + dice);

        //Set container to hold the final possibilities of positions
        Set<String> finalPositions = new HashSet<>();
        finalPositions.clear();

        // setting initial position
        String position = actualPosition;
        String previousPosition = position;

        //setting initial neighbours list
        Set<String> neighboursList = new HashSet<>();
        neighboursList.addAll(squareMap.get(position).getNeighboursList());

        //big list of new neighbours
        Set<String> newNeighbours = new HashSet<>();

        //List of Previous positions
        Set<String> listPreviousPositions = new HashSet<>();

        //iterating according to dice result
        while (dice > 0){

            finalPositions.clear();

            for(String neighbour : neighboursList){

                if(squareMap.get(neighbour) == null){
                    continue;
                }

                for(String previous : listPreviousPositions){
                    if(neighbour.equals(previous)){
                        previousPosition = previous;
                    }
                }
                if(neighbour.equals(previousPosition)){
                    continue;
                }

                //see neighbours
                position = neighbour;
                // add position to final position
                finalPositions.add(position);

                //add neighbours of neighbour to a big list of new neighbours
                newNeighbours.addAll(squareMap.get(position).getNeighboursList());

                //store the list of positions to pass as previous positions
                listPreviousPositions.add(position);
            }

            neighboursList.clear();
            neighboursList.addAll(newNeighbours);
            previousPosition = position;

            dice--;
        }

        finalPositions.remove(actualPosition);
        System.out.println("*-*-*-*-*- Final Possible Positions " + finalPositions + "*-*-*-*-*-");

        neighboursList.clear();
        newNeighbours.clear();
        listPreviousPositions.clear();


        return finalPositions;

    }

    public Dice getDice() {
        return dice;
    }

    //Method to transform String key Position in a int array
    public List<Integer> transformKeyPosition(String key){

        String[] keyTransform = key.split("");
        System.out.println(keyTransform[0] + " " + keyTransform[1] + " " + keyTransform[2]);
        List<Integer> squarePosition = new LinkedList<>();
        squarePosition.clear();

        for(int i = 0; i < keyTransform.length; i++){
            if(keyTransform[i].equals("e")){
                continue;
            }
            int num = Integer.parseInt(keyTransform[i]);
            squarePosition.add(num);
        }

        System.out.println(squarePosition);

        return squarePosition;
    }

    public void settingSquaresCategory(){

        for(String key: squareMap.keySet()){

            switch(key){
                case "1e1": case "5e1": case "8e1": case "11e2": case "6e5": case "11e6": case "11e10": case "8e11": case "6e10": case"4e11": case"1e8": case"1e5": case"4e6": case"9e6":
                    squareMap.get(key).setCategory(QuestionSelector.Type.ACADEMIA);
                    break;
                case "1e3": case "3e1": case "2e6": case "1e7": case "1e11": case "5e11": case "9e11": case "11e8": case "10e6": case"6e7": case"6e4": case"6e1": case"10e1": case"11e3":
                    squareMap.get(key).setCategory(QuestionSelector.Type.CODE_CADETS);
                    break;
                case "1e2": case "1e6": case "1e10": case "3e11": case "7e11": case "11e11": case "11e7": case "11e4": case "9e1": case"6e2": case"7e6": case"3e6": case"6e9": case"4e1":
                    squareMap.get(key).setCategory(QuestionSelector.Type.MASTERS);
                    break;
                case "6e6":
                    squareMap.get(key).setCategory(QuestionSelector.randomCategory());
                    break;
                default:
                    squareMap.get(key).setCategory(QuestionSelector.Type.PROGRAMMING_CONCEPTS);
            }
        }
    }
}
