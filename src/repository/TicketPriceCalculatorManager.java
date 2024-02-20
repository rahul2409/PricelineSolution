package repository;

import model.TicketRequest;

public class TicketPriceCalculatorManager {
    private SingleTicketPriceCalculator singleTicketPriceCalculator;
    private ReturnTicketPriceCalculator returnTicketPriceCalculator;

    private final double baseFare = 50;
    private final double baseDistance = 100;
    private final double discount = 0.2;
    private final double fareAfterBaseDistance = 3;
    public TicketPriceCalculatorManager() {
        this.singleTicketPriceCalculator = new SingleTicketPriceCalculator(baseFare, baseDistance, fareAfterBaseDistance);
        this.returnTicketPriceCalculator = new ReturnTicketPriceCalculator(baseFare, baseDistance, fareAfterBaseDistance, discount);
    }

    public double calculate(TicketRequest request){
        return request.isReturn() ? returnTicketPriceCalculator.calculate(request) : singleTicketPriceCalculator.calculate(request);
    }
}
//bhavin.patel@priceline.com