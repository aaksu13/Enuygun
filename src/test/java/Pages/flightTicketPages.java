package Pages;
import Objects.flightTicketObjects;
import Base.baseMethods;
import org.openqa.selenium.WebElement;

import java.util.List;

public class flightTicketPages extends baseMethods {

    public void ahmetChoosesRato(String whereFrom, String toWhere) {
        setUp();
        findElementByWaiting(flightTicketObjects.whereFromInput).sendKeys(whereFrom);
        clickElement(flightTicketObjects.suggestionItem);
        findElementByWaiting(flightTicketObjects.toWhereInput).sendKeys(toWhere);
        clickElement(flightTicketObjects.suggestionItem);
    }

    public void ahmetChoosesDepartureDate (String departureDate){
        clickElement(flightTicketObjects.oneWaySelection);
        clickElement(flightTicketObjects.dateInput);
        List<WebElement> date = driver.findElements(flightTicketObjects.dateSelection);
        for (int i = 0;i<date.size();i++){
            String value = date.get(i).getAttribute("aria-label");
            if (value.equals(departureDate)){
                date.get(i).click();
                break;
            }
        }
    }

    public void ahmetChoosesReturnDate (String returnDate){
        List<WebElement> date = driver.findElements(flightTicketObjects.dateSelection);
        for (int i = 0;i<date.size();i++){
            String value = date.get(i).getAttribute("aria-label");
            if (value.equals(returnDate)){
                date.get(i).click();
                break;
            }
        }
    }

    public void ahmetChoosesNonStopFlight() {
        clickElement(flightTicketObjects.nonStop);
    }

    public void ahmetChoosesTheNumberOfPassengers(String passengersCount){

        clickElement(flightTicketObjects.passengerButton);
        List<WebElement> passengers = driver.findElements(flightTicketObjects.passengersCount);
        List<WebElement> incPassenger = driver.findElements(flightTicketObjects.incPassenger);
        int visibleCount = Integer.parseInt(passengers.get(0).getText());
        int expectedCount = Integer.parseInt(passengersCount);

        for (int i=visibleCount;i<expectedCount;i++){
            incPassenger.get(0).click();
        }

    }

    public void ahmetChoosesTheTicketClass(String ticketClassValue){
        List<WebElement> ticketClass = driver.findElements(flightTicketObjects.ticketClass);
        if (ticketClassValue.equals("Ekonomi")){
            ticketClass.get(0).click();
        }
        else if (ticketClassValue.equals("Business")){
            ticketClass.get(1).click();
        }

    }

    public void ahmetPressesTheSearchButton(){
        clickElement(flightTicketObjects.searchButton);
    }

    public String ahmetSeesTheFlightTicketPage(){
        return(findElementByWaiting(flightTicketObjects.flightTicketPage).getText());
    }
}
