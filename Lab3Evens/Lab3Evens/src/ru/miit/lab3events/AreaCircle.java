package ru.miit.lab3events;

import ru.miit.lab3events.annotation.Change;

import javax.enterprise.event.Observes;

/**
 * Created by pavlov on 06.03.2017.
 */
public class AreaCircle {


    public static double area;

    public void AreaChange(@Observes @Change Integer rad) {
        area = rad*rad*Math.PI;
    }

    //@Override
    public String toString() {
        return "The area of the circle: " + area;
    }
}
