package serenitylabs.tutorials.trains.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

/**
 * Created by aatchoud on 9/21/2016.
 */
public class Navigate implements Interaction {

    private final MainMenu mainMenuOption;
    private BuyTicketPage buyTicketPage;

    public Navigate(MainMenu mainMenuOption) {
        this.mainMenuOption = mainMenuOption;
    }

    @Override
    @Step("{0} navigated to #mainMenuOption")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(buyTicketPage)
        );

    }

    public static Performable to(MainMenu mainMenuOption) {
        return Instrumented.instanceOf(Navigate.class).withProperties(mainMenuOption);
    }
}
