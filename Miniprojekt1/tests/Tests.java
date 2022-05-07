import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("NewClassNamingConvention")
public class Tests {
    Fahrer fahrer1 = new Fahrer("Kevin", 668, 69);
    Routenverwaltung rv = new Routenverwaltung(fahrer1);
    Haltepunkt hpEnd = new Haltepunkt("FHDW");
    Haltepunkt hpAnfang = new Haltepunkt("HBF");
    Route route1 = new Route(hpAnfang, hpEnd);

    @Test
    void testNaestenHaltepunktAnzeigen(){
        List<Haltepunkt> zwischenStops = new ArrayList<>();
        zwischenStops.add(new Haltepunkt("Marienstraße"));
        zwischenStops.add(new Haltepunkt("Braunschweiger Platz"));

        route1.setZwischenStops(zwischenStops);
        rv.setRoute(route1);

        assertEquals(rv.nächstenHaltepunktEinsehen().getAdresse(), "Marienstraße");
        rv.haltePunktBestätigen();
        assertEquals(rv.nächstenHaltepunktEinsehen().getAdresse(), "Braunschweiger Platz");
    }

    @Test
    void testletzenHaltepunktEinsehen(){
        List<Haltepunkt> zwischenStops = new ArrayList<>();
        zwischenStops.add(new Haltepunkt("Marienstraße"));
        zwischenStops.add(new Haltepunkt("Braunschweiger Platz"));

        route1.setZwischenStops(zwischenStops);
        rv.setRoute(route1);

        assertEquals(rv.letztenHaltepunktEinsehen().getAdresse(), "FHDW");
    }

}