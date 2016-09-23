package serenitylabs.tutorials.trains.ui;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by aatchoud on 9/24/2016.
 */
public class OutBoundJourneySummary {
    public static final Target ORIGIN = Target.the("Origin")
                                                .locatedBy(".planner-header__origin");
    public static final Target DESTINATION = Target.the("Destination")
                                                .locatedBy(".planner-header__destination");
}
