package at.sefa.camera_project;

import java.time.LocalDate;

public class Camera {
    private String model;
    private int megapixels; 
    private double weight; 
    private String color; 
    private Lens lens; 
    private SDCard sdCard; 
    private String resolution; 

    public Camera(String model, int megapixels, double weight, String color) {
        this.model = model;
        this.megapixels = megapixels;
        this.weight = weight;
        this.color = color;
        this.resolution = "medium"; 
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public void insertSDCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution; 
    }

    public String takePicture(String pictureName) {
        if (sdCard != null) {
            float pictureSize = getPictureSize(); 
            if (sdCard.getAvailableSpace() >= pictureSize) {
                Foto foto = new Foto(pictureName, LocalDate.now(), pictureSize);
                sdCard.savePhoto(foto);
                return "Picture taken: " + foto.getInfo();
            } else {
                return "Warning: Not enough space on the SD card!";
            }
        } else {
            return "Error: No SD card inserted!";
        }
    }

    private float getPictureSize() {
        switch (resolution) {
            case "small":
                return 2.0f; 
            case "medium":
                return 4.0f; 
            case "large":
                return 6.0f; 
            default:
                return 4.0f; 
        }
    }

    @Override
    public String toString() {
        return String.format("Camera Model: %s, Megapixels: %d, Weight: %.1f g, Color: %s", 
                             model, megapixels, weight, color);
    }
}