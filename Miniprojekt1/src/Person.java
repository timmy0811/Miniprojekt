public abstract class Person {
    private final String name;
    private String telefonNummer;
    private String emailAdresse;

    public Person(String name, String telefonNummer, String emailAdresse){
        this.name = name;
        this.telefonNummer = telefonNummer;
        this.emailAdresse = emailAdresse;
    }

    public Person(String name) {
        this.name = name;
    }
}
