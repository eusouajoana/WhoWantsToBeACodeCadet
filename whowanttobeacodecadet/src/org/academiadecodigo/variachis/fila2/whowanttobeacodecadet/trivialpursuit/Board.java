package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit;

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
        System.out.println("final positions initial : " + finalPositions);

        // setting initial position
        String position = actualPosition;
        System.out.println("Initial Position : " + position);
        String previousPosition = position;

        //setting initial neighbours list
        Set<String> neighboursList = new HashSet<>();
        neighboursList.addAll(squareMap.get(position).getNeighboursList());
        System.out.println("neighbour list initial: " + neighboursList);

        //big list of new neighbours
        Set<String> newNeighbours = new HashSet<>();
        System.out.println("newNeighbour List initial : " + newNeighbours);

        //List of Previous positions
        Set<String> listPreviousPositions = new HashSet<>();
        System.out.println("listPrevious positions initial : " +listPreviousPositions);

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
}
