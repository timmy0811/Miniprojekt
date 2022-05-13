package de.easyride.fahreranwendung.akteure;

public class Fahrer extends Mitarbeiter{
    private final int fahrerNummer;

    public Fahrer(String name, int fahrerNummer, int mitarbeiterNummer){
        super(name, mitarbeiterNummer);

        this.fahrerNummer = fahrerNummer;
    }
}
