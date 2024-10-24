package at.sefa.camera_project;

import java.time.LocalDate;

public class Foto {
    private String name;
    private LocalDate date;  
    private float size;

    public Foto(String name, LocalDate date, float size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getDate() { 
        return this.date;
    }

    public float getSize() {
        return this.size;
    }

    public String getInfo() {
        return String.format("Picture: %s, Date: %s, Size: %.1f MB", 
        name, date.toString(), size);  
    }
}
