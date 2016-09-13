package io.hexlet.java.m101.xo.controller;

/**
 * Created by FuchsA on 13.09.2016.
 */
import io.hexlet.java.m101.xo.model.Field;
import io.hexlet.java.m101.xo.model.Point;

public class MoveController {

    public boolean applyFigure(final Field field,
                               final Point point,
                               final String figure) {
        // BEGIN
        if (field.getFigure(point) != null)
            return false;
        field.setFigure(point, figure);
        return true;
        // END
    }

}

