package dev.lpa;

public class Main {

    public static void main(String[] args) {

        var nationalROParks = new Park[]{
                new Park("Parcul Natural Bucegi","45.40588207568744, 25.451656846260477"),
                new Park("Parcul Natural Putna-Vrancea","45.91402201125173, 26.66505606580208"),
                new Park("Parcul National Piatra Craiului","45.571034041655984, 25.232739681931648")
        };

        var nationalRORivers = new River[]{
                new River("Dunarea","45.35011604331585, 28.018415665252594","44.128796082130556, 27.384156708158056"),
                new River("Prut","47.141706648582705, 27.7828013324995"),
                new River("Siret","45.56744626419269, 27.646931991339926"),
                new River("Putna","45.621376681788185, 27.471296103844285")
        };

        var parkLayer = new Layer<>(nationalROParks);
        parkLayer.renderLayer();
        var riverLayer = new Layer<>(nationalRORivers);
        riverLayer.renderLayer();

        
    }

}
