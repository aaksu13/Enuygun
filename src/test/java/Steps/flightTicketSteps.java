package Steps;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class flightTicketSteps extends Pages.flightTicketPages{

    @Given("Ahmet chooses rato {string} and {string}")
    public void osman_chooses_rato(String whereFrom, String toWhere) throws InterruptedException {
        ahmetChoosesRato(whereFrom,toWhere);
        Thread.sleep(2000);
    }

    @Given("Ahmet chooses round trip date {string} and {string}")
    public void osman_chooses_round_trip_date(String departureDate, String dateOfReturn) throws InterruptedException {
        ahmetChoosesDepartureDate(departureDate);
        Thread.sleep(2000);
        ahmetChoosesReturnDate(dateOfReturn);
        Thread.sleep(2000);
    }

    @Given("Ahmet chooses non-stop flight")
    public void osman_chooses_non_stop_flight() throws InterruptedException {
        ahmetChoosesNonStopFlight();
        Thread.sleep(2000);
    }

    @Given("Ahmet chooses the number of passengers,ticket class {string} and {string}")
    public void osman_chooses_the_number_of_passengers_and_ticket_class(String passengers,String ticketClass) throws InterruptedException {
        ahmetChoosesTheNumberOfPassengers(passengers);
        Thread.sleep(2000);
        ahmetChoosesTheTicketClass(ticketClass);
        Thread.sleep(2000);
    }

    @When("Ahmet presses the search button")
    public void osman_presses_the_search_button() throws InterruptedException {
        ahmetPressesTheSearchButton();
        Thread.sleep(2000);
    }

    @Then("Ahmet sees the flight ticket page")
    public void osman_sees_the_flight_ticket_page() throws InterruptedException {
        Assert.assertEquals("Aramayı Favorilere Ekle",ahmetSeesTheFlightTicketPage());
        Thread.sleep(2000);
    }


}
