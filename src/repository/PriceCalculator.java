package repository;

import model.TicketRequest;

public interface PriceCalculator {
    double calculate(TicketRequest ticketRequest);
}
