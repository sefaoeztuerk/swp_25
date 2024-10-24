package at.sefa.camera_project;

public class Lens {
    private Manufacturer manufacturer;
    private float focalLength;

    public Lens(Manufacturer manufacturer, float focalLength) {
        this.manufacturer = manufacturer;
        this.focalLength = focalLength;
    }

    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }

    public float getFocalLength() {
        return this.focalLength;
    }

    public String getInfo() {
        return String.format("Lens by %s, Focal Length: %.1f mm", 
        manufacturer.getName(), focalLength);
    }
}
