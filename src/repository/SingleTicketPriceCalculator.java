package repository;

import model.TicketRequest;

public class SingleTicketPriceCalculator extends TicketPriceCalculator{
    public SingleTicketPriceCalculator(double baseFare, double baseDistance, double fareAfterBaseDistance) {
        super(baseFare, baseDistance, fareAfterBaseDistance);
    }

    @Override
    public double calculate(TicketRequest ticketRequest) {
        double distance = calculateDistanceBetweenStations(ticketRequest);
        double cost = calculateCost(distance);
        return cost;
    }
}
