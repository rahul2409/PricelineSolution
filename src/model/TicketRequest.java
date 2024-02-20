package model;

public record TicketRequest(Station source, Station destination, boolean isReturn) {
}
