package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit;

import java.util.*;

public class Board {

    //Properties
    private Map<String, Square> squareMap;


    // ------- Constructor -----------

    public Board() {
        this.squareMap = new HashMap<>();

        /*for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square(0, 0);
        }*/
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

                    //instantiate a square
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
                    System.out.println(key);
                    //System.out.println(vector[0]+" "+vector[1]);
                    continue;
                }

                //empty rows
                if (j != 1 && j != 6 && j != 11) {
                    continue;
                }

                int[] vector = {i, j};

                //teste key
                String key = i + "e" + j;

                //instantiate a square
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
                System.out.println(key);
                squareMap.put(key, square);
                //System.out.println(vector[0]+" "+vector[1]);
            }

        }


    }
    //getter of the map property
    public Map<String, Square> getSquareMap() {
        return squareMap;
    }


    public Set<String> paths(String actualposition, int dice) {

        //Set container to hold the final possibilities of positions
        Set<String> finalPositions = new HashSet<>();

        // setting initial position
        String position = actualposition;
        System.out.println("Initial Position : " + position);
        String previousPosition = position;

        //setting initial neighbours list
        List<String> neighboursList = squareMap.get(position).getNeighboursList();
        System.out.println("First Neighbour List : " + neighboursList);

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
                System.out.println("Neighbours : " +  position);
                // add position to final position
                finalPositions.add(position);
                System.out.println("***** final Possible Position :"+ finalPositions);

                //add neighbours of neighbour to a big list of new neighbours
                newNeighbours.addAll(squareMap.get(position).getNeighboursList());
                System.out.println("--BIG list to be re-asked :" + newNeighbours);

                //store the list of positions to pass as previous positions
                listPreviousPositions.add(position);
            }

            neighboursList.clear();
            neighboursList.addAll(newNeighbours);
            previousPosition = position;

            dice--;
        }

        finalPositions.remove(actualposition);
        System.out.println("*-*-*-*-*- Final Positions " + finalPositions + "*-*-*-*-*-");

        return finalPositions;

    }

}
