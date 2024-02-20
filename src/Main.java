import model.Station;
import model.TicketRequest;
import repository.PriceCalculator;
import repository.TicketPriceCalculator;
import repository.TicketPriceCalculatorManager;

public class Main {
    /*You have given a set of railway stations with their distance (assume they have an equal distance for now).
You have to calculate the ticket price between source and destination stations on the below conditions.

The ticket will have a minimum base price of 50 rs for 100 km

After 100 km you have to charge 3 rs per km

If the user book a return trip we have to provide a discount of 20% on the overall fare.

Stations (In order)
 delhi - mathura - agra - gwalior - dewas - indore

Distance
100km between each station

Assumptions
Equal distance between stations

Delhi, Agra, return => 200 * 2 => 50 +(300) *3 = 950 - discount 760
    * */
    public static void main(String[] args) {
        TicketPriceCalculatorManager ticketPriceCalculator = new TicketPriceCalculatorManager();

        TicketRequest request = new TicketRequest(Station.DELHI, Station.AGRA, false);
        System.out.println("The ticket price is " + ticketPriceCalculator.calculate(request));

        TicketRequest request2 = new TicketRequest(Station.DELHI, Station.AGRA, true);
        System.out.println("The ticket price is " + ticketPriceCalculator.calculate(request2));
    }
}