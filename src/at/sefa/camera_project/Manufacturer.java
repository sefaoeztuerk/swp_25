package at.sefa.camera_project;

public class Manufacturer {
    private String name;
    private String country;

    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }

    public String getInfo() {
        return String.format("Manufacturer: %s, Country: %s", this.name, this.country);
    }
}
