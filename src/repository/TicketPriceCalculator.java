package repository;

import model.TicketRequest;

public abstract class TicketPriceCalculator implements PriceCalculator{
    protected final double baseFare;
    protected final double baseDistance;
    protected final double fareAfterBaseDistance;

    public TicketPriceCalculator(double baseFare, double baseDistance, double fareAfterBaseDistance) {
        this.baseFare = baseFare;
        this.baseDistance = baseDistance;
        this.fareAfterBaseDistance = fareAfterBaseDistance;
    }

    public double calculateDistanceBetweenStations(TicketRequest ticketRequest){
        return Math.abs(ticketRequest.source().getDistanceFromBaseStation() - ticketRequest.destination().getDistanceFromBaseStation());
    }

    public double calculateCost(double distance){
        return (baseFare + (distance - baseDistance) * fareAfterBaseDistance);
    }
}
