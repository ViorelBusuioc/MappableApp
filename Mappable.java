package dev.lpa;

import java.util.Arrays;

interface Mappable {

    void render();

    static double[] stringToLatLon(String position) {
        var splits = position.split(",");
        double lat = Double.parseDouble(splits[0]);
        double lng = Double.parseDouble(splits[1]);
        return  new double[] {lat,lng};
    }
}

abstract class Point implements Mappable {

    double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT (" + location() + ")");
    }

    private String location() {
        return Arrays.toString(location);
    }


}

abstract class Line implements Mappable {

    double[][] locations;

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for (var l : locations) {
            this.locations[index++] = Mappable.stringToLatLon(l);
        }
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as LINE (" + locations() + ")");
    }

    private String locations() {
        return Arrays.deepToString(locations);
    }


}


