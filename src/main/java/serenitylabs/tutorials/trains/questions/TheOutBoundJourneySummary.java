package serenitylabs.tutorials.trains.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import serenitylabs.tutorials.trains.ui.OutBoundJourneySummary;

/**
 * Created by aatchoud on 9/24/2016.
 */
public class TheOutBoundJourneySummary {


    public static Question<String> origin() {
        return actor -> Text.of(OutBoundJourneySummary.ORIGIN).viewedBy(actor).asString();
    }

    public static Question<String> destination() {
        return actor -> Text.of(OutBoundJourneySummary.DESTINATION).viewedBy(actor).asString();
    }
}
