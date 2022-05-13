package de.easyride.fahreranwendung.akteure;

public class Mitarbeiter extends Person{
    private final int mitarbeiterNummer;

    public Mitarbeiter(String name, int mitarbeiterNummer){
        super(name);

        this.mitarbeiterNummer = mitarbeiterNummer;

    }
}
