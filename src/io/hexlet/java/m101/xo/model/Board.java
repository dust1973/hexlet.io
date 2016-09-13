package io.hexlet.java.m101.xo.model;

import java.util.Arrays;

/**
 * Created by FuchsA on 13.09.2016.
 */
public class Board {

    private static final int SIZE_FIELD_X = 3;
    private static final int SIZE_FIELD_Y = 3;
    private Figure[][] figures = new Figure[SIZE_FIELD_X][SIZE_FIELD_Y];

    public void initArray() {

        figures[0][0] = new Figure("O");
        figures[1][1] = new Figure("X");
        figures[2][1] = new Figure("X");
    }
    public void showBoard(){
        System.out.println(Arrays.deepToString(this.figures));

    }

}
