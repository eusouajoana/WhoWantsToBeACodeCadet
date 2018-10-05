public class Main {

    public static void main(String[] args) {

        Board board = new Board();
        board.position();

        int[] key1 = {1,1};

        board.getSquareMap().get("1e1");

        board.paths("1e1",2);


        //System.out.println(board.getSquareMap().get("1e1").getNeighboursList());
        //System.out.println(board.getSquareMap().get("1e1"));
    }
}
