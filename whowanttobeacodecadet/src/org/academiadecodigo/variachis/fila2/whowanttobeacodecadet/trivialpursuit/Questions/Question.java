package org.academiadecodigo.variachis.fila2.whowanttobeacodecadet.trivialpursuit.Questions;

import java.util.*;

public interface Question {

    //my question can get it's answers
    List<String> getAnswers();


    //get the right answer for my question
    String getRightAnswer();


    public String getStatement();




}


