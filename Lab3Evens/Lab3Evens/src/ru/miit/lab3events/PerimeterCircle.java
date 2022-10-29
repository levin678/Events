package ru.miit.lab3events;

import ru.miit.lab3events.annotation.Change;

import javax.enterprise.event.Observes;

/**
 * Created by pavlov on 06.03.2017.
 */
public class PerimeterCircle {

    public static double perimeter;

    public void PerimeterChange(@Observes @Change Integer rad) {
        perimeter = 2*rad*Math.PI;
    }

    //@Override
    public String toString() {
        return "The perimeter of the circle: " + perimeter;
    }
}
