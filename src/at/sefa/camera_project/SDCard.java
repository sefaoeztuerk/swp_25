package at.sefa.camera_project;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity; 
    private List<Foto> photos; 
    private float usedSpace; 

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.photos = new ArrayList<>();
        this.usedSpace = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public float getAvailableSpace() {
        return capacity - usedSpace;
    }

    public void savePhoto(Foto foto) {
        if (usedSpace + foto.getSize() <= capacity) {
            photos.add(foto);
            usedSpace += foto.getSize(); 
        } else {
            System.out.println("Error: Not enough space to save the photo.");
        }
    }

    public List<Foto> getPhotos() {
        return photos; 
    }
}
