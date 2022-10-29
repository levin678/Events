package ru.miit.lab3events;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;


/**
 * Created by Андрей on 18.02.2017.
 */
public class Lab3Start {
    protected static Weld weld;
    protected static WeldContainer container;

    public static void main(String args[]) throws Exception {
        weld = new Weld();
        container = weld.initialize();

        try {

            CollectionManager collectionManager = container.instance().select(CollectionManager.class).get();
            AreaCircle areaCircle = container.instance().select(AreaCircle.class).get();
            PerimeterCircle perimeterCircle = container.instance().select(PerimeterCircle.class).get();


            collectionManager.change(5);
            collectionManager.change(7);

            System.out.println(collectionManager);
            System.out.println(areaCircle);
            System.out.println(perimeterCircle);
        } finally {
            weld.shutdown();
        }
    }
}
