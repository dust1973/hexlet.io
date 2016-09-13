package io.hexlet.java.m101.xo.model;

/**
 * Created by FuchsA on 13.09.2016.
 */
public class Field {

    public String[][] figures = new String[3][3];



    public int getSize() {
        // BEGIN
        return figures.length;
        // END
    }

    public String getFigure(final Point point) {
        // BEGIN (write your solution here)
        return figures[point.x][point.y];
        // END
    }

    public void setFigure(final Point point, final String figure) {
        // BEGIN (write your solution here)
        figures[point.x][point.y] = figure;
        // END
    }

}
