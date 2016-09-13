package io.hexlet.java.m101.xo.model;

/**
 * Created by FuchsA on 13.09.2016.
 */
public class Figure extends Object{

    private final String figure;

    public String getFigure() {
        return figure;
    }

    public Figure(final String figure) {

        assert figure != null;

        this.figure = figure;

    }
    @Override
    public String toString(){
        return this.figure;
    }
}
