package at.sefa.camera_project;

public class Foto {
    private String name;
    private String date;
    private float size;

    public Foto(String name, String date, float size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }

    public float getSize() {
        return this.size;
    }

    public String getInfo() {
        return "Picture: " + this.name + ", Date: " + this.date + ", Size: " + this.size + " MB";
    }
}
