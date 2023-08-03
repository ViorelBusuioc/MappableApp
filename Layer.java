package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {

    private List<T> listOfElement;

    public Layer(T[] listOfElement) {
        this.listOfElement = new ArrayList<T>(List.of(listOfElement));
    }

    public void addElements(T... elements) {
        listOfElement.addAll(List.of(elements));
    }

    public void renderLayer() {
        for (T element : listOfElement) {
            element.render();
        }
    }
}
