package ru.miit.lab3events;

import ru.miit.lab3events.annotation.Change;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * Created by pavlov on 06.03.2017.
 */
public class CollectionManager {
    private Integer radius;

    @Inject @Change
    private Event<Integer> itemRemovedEvent;

    public void change(Integer rad) {
        radius=rad;
        itemRemovedEvent.fire(rad);
    }

    //@Override
    public String toString() {
        return "Circle radius: " + radius;
    }
}
