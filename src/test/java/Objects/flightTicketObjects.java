package Objects;

import org.openqa.selenium.By;

public class flightTicketObjects {
    public static By whereFromInput = By.cssSelector("#OriginInput");
    public static By toWhereInput = By.cssSelector("#DestinationInput");
    public static By suggestionItem = By.xpath("//li//div[@class='suggestion_item']");
    public static By oneWaySelection = By.cssSelector("#oneWayCheckbox");
    public static By dateInput = By.cssSelector("#DepartureDate");
    public static By dateSelection = By.xpath("//table//td[contains(@aria-label,'2022')]");
    public static By nonStop = By.cssSelector("#transitFilter");
    public static By passengerButton = By.xpath("//button[@class='default-btn block passenger-select-button']");
    public static By passengersCount = By.xpath("//span[@class='PassengerBox__type__count']");
    public static By incPassenger = By.xpath("//button[@class='active']");
    public static By ticketClass = By.xpath("//div[@class='cabinClassButton']/button");
    public static By searchButton = By.xpath("//button[@class='primary-btn block']");
    public static By flightTicketPage = By.xpath("//button[@data-testid='favorite-search-add-button']");







}
