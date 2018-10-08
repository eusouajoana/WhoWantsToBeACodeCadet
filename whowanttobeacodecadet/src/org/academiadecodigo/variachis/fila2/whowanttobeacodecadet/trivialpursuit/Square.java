package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit;

import org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions.QuestionSelector;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Square {

    //------------- Properties ----------------------------

    //Knowing Neighbours
    private Set<String> neighboursList;


    //Question category of the square
    private QuestionSelector.Type category;

    //ID of the square
    private int[] id;
    private boolean special;


    //------------- Constructor -------------------------

    public Square() {
        this.neighboursList = new HashSet<>();

        // this.row = row;
        // this.col = col;
        // this.id = new int[]{row,col};
    }

    //------------- Methods ------------------------------


    public Set<String> getNeighboursList() {
        return neighboursList;
    }

    @Override
    public String toString() {
        return "Square{" +
                "neighboursList=" + neighboursList +
                '}';
    }

    public void setCategory(QuestionSelector.Type category) {
        this.category = category;
    }

    public QuestionSelector.Type getCategory() {
        return category;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }
    public boolean isSpecial(){
        return special;
    }
}

