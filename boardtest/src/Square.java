import java.util.LinkedList;

public class Square {

    //------------- Properties ----------------------------

    //Knowing Neighbours
    private LinkedList<String> neighboursList;


    //Question category of the square
    private Category category;

    //ID of the square
    private int[] id;


    //------------- Constructor -------------------------

    public Square() {
        this.neighboursList = new LinkedList<>();

        // this.row = row;
        // this.col = col;
        // this.id = new int[]{row,col};
    }

    //------------- Methods ------------------------------


    public LinkedList<String> getNeighboursList() {
        return neighboursList;
    }

    @Override
    public String toString() {
        return "Square{" +
                "neighboursList=" + neighboursList +
                '}';
    }
}

