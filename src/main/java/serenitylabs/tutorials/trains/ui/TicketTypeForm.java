package serenitylabs.tutorials.trains.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by aatchoud on 9/23/2016.
 */
public class TicketTypeForm {

    public static final Target FROM = Target.the("Departure Station")
                                            .located(By.id("depart-from")) ;
    public static final Target TO = Target.the("Destination Station")
                                            .locatedBy("#going-to");
    public static final Target BUY_TICKETS = Target.the("Buy Tickets button")
                                            .locatedBy(".planner__submit");
    public static final Target CLOSE_COOKIE = Target.the("Close cookie button")
                                            .locatedBy("//span[@class='button__text' and contains(.,'Close this')]");
    //cls-1

}
