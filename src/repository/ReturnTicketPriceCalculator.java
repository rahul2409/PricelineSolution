package repository;

import model.TicketRequest;

public class ReturnTicketPriceCalculator extends TicketPriceCalculator{
    private final double discount;
    public ReturnTicketPriceCalculator(double baseFare, double baseDistance, double fareAfterBaseDistance, double discount) {
        super(baseFare, baseDistance, fareAfterBaseDistance);
        this.discount = discount;
    }

    @Override
    public double calculate(TicketRequest ticketRequest) {
        double distance = calculateDistanceBetweenStations(ticketRequest) * 2;
        double cost =(1 - discount) * calculateCost(distance);
        return cost;
    }
}
