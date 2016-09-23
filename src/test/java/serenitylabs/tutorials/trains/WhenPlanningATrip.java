package serenitylabs.tutorials.trains;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import org.hamcrest.Matchers;
import org.jruby.RubyBoolean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenitylabs.tutorials.trains.questions.TheOutBoundJourneySummary;
import serenitylabs.tutorials.trains.tasks.ChosenTo;
import serenitylabs.tutorials.trains.tasks.ViewTheAvailableTickets;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

@RunWith(SerenityRunner.class)
public class WhenPlanningATrip {

    Actor tracy;

    @Managed
    WebDriver browser;


    @Before
    public void setUp() {
        tracy = Actor.named("Tracy");
        tracy.can(BrowseTheWeb.with(browser));
    }

    @Test
    public void booking_a_simple_trip() {
        //Tracy goes to buy the tickets
        //Given
        tracy.has(ChosenTo.bookTheTickets());

        //Tracy views the tickets from London Paddington to oxford
        tracy.attemptsTo(
                ViewTheAvailableTickets.from("London Paddington").to("Oxford")
        );

        //Tracy should see that the departure and destination stations are correct
        tracy.should(
                seeThat("the departure station",TheOutBoundJourneySummary.origin(), is("London Paddington")),
                seeThat("the destination station",TheOutBoundJourneySummary.destination(),is("Oxford"))
        );
    }
}
