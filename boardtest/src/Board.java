import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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

                    //identifying the position of the square
                    int[] vector = {i, j};
                    //teste key
                    String key = i + "e" + j;

                    //instantiate a square
                    Square square = new Square();

                    //identifying square neighbours
                    //int[] leftNeighbour = {i,j-1};
                    //int[] uptNeighbour = {i-1,j};
                    //int[] rightNeighbour = {i,j+1};
                    //int[] downNeighbour = {i+1,j};

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

                //identifying square neighbours
                //int[] leftNeighbour = {i,j-1};
                //int[] uptNeighbour = {i-1,j};
                //int[] rightNeighbour = {i,j+1};
                //int[] downNeighbour = {i+1,j};

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

    public Map<String, Square> getSquareMap() {
        return squareMap;
    }





    public List<String> paths(String actualposition, int dice){

       //LinkedList<String> neighbours1 = squareMap.get(actualposition).getNeighboursList();

       LinkedList<String>[] levelNeighboursList = new LinkedList[10];

       int i = 0;
       String position = actualposition;
       levelNeighboursList[i] = squareMap.get(position).getNeighboursList();
       System.out.println(levelNeighboursList[i]);

       for(int d = dice; d > 0; d--){

           for (String neighbour : levelNeighboursList[i]) {
               //squareMap.get(neighbour).getNeighboursList();

               if (squareMap.get(neighbour) == null) {
                   continue;
               }
               if(neighbour.equals(position)){
                   continue;
               }
               System.out.println(" --- position : " + position);
               System.out.println(" --- neighbour : " + neighbour);
               position = neighbour;

           }

           levelNeighboursList[i+1] = squareMap.get(position).getNeighboursList();
           i++;
       }
        //System.out.println(levelNeighboursList[0] + " \n" + levelNeighboursList[1] + " \n" + levelNeighboursList[2] + " \n" + levelNeighboursList[3] + " \n" + levelNeighboursList[4] + " \n" + levelNeighboursList[5]);


        //-------------------------------------------------
       /*
           for (String neighbour : neighbours1) {

               if (squareMap.get(neighbour) == null) {
                   continue;
               }

               if (dice == 0) {
                   System.out.println(neighbours1);
                   return neighbours1;
               }
               paths(neighbour, dice);
           }  */

       //-------------------------------------------------

               /* for (String neighbour : neighbours1) {
                    //squareMap.get(neighbour).getNeighboursList();

                    if (squareMap.get(neighbour) == null) {
                        continue;
                    }

                    System.out.println(" --- neighbour 1: " + neighbour);
                    //System.out.println(squareMap.get(neighbour).getNeighboursList());
                    List<String> neighbours2 = squareMap.get(neighbour).getNeighboursList();

                    for(String neighbour2: neighbours2){
                        if (squareMap.get(neighbour2) == null) {
                            continue;
                        }
                        if(neighbour2.equals(actualposition)){
                            continue;
                        }
                        System.out.println("neighbour 2: " + neighbour2);
                        //System.out.println(squareMap.get(neighbour2).getNeighboursList());
                    }
                }*/




        return null;
    }


}
