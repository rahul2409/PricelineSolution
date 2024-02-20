package model;

public enum Station {
    // delhi - mathura - agra - gwalior - dewas - indore
    DELHI(0),
    MATHURA(100),
    AGRA(200),
    GWALIOR(300),
    DEWAS(400),
    INDORE(500);

    private double distanceFromBaseStation;

    Station(double distanceFromBaseStation) {
        this.distanceFromBaseStation = distanceFromBaseStation;
    }

    public double getDistanceFromBaseStation() {
        return distanceFromBaseStation;
    }
}
