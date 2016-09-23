package serenitylabs.tutorials.trains.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import serenitylabs.tutorials.trains.ui.MainMenu;
import serenitylabs.tutorials.trains.ui.Navigate;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Created by aatchoud on 9/21/2016.
 */
public class ChosenTo implements Task {

    public ChosenTo() {
    }

    @Override
    @Step("{0} has chosen to buy some tickets")
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Navigate.to(MainMenu.buyTickets)
            );
    }

    public static Performable bookTheTickets() {
        return instrumented(ChosenTo.class);
    }


}
