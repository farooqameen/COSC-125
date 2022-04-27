/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.game;

/**
 *
 * @author Farooq Ameen
 */
public class Settings {

    private int volume;
    private int fieldOfView;
    private String textureQuality;
    private String effectIntensity;
    private String ambientOcclusion;

    Settings() {
        fieldOfView = 60;
        textureQuality = "Low";
        effectIntensity = "Low";
        ambientOcclusion = "Enabled";
    }

    public void displayAll() {
        System.out.println("The current settings are: ");
        displayVolume();
        System.out.println("2. Field of view: " + fieldOfView);
        System.out.println("3. Texture quality: " + textureQuality);
        System.out.println("4. Effect intensity: " + effectIntensity);
        System.out.println("5. Ambient occlusion: " + ambientOcclusion);
    }

    public void displayVolume() {
        System.out.print("1. Volume: ");
        for (int i = 0; i < volume; i++) {
            System.out.print("|");
        }
        for (int i = 0; i < (100 - volume); i++) {
            System.out.print(".");
        }
        System.out.println();
    }

    public void setVolume(int n) {
        if (n >= 0 && n <= 100) {
            volume = n;
        } else {
            System.out.println("Invalid volume.");
        }
    }

    public void setTextureQuality(String s) {
        s = s.toUpperCase();
        switch (s) {
            case ("l") -> textureQuality = "Low";
            case ("m") -> textureQuality = "Medium";
            case ("h") -> textureQuality = "High";
            default -> System.out.println("Invalid texture quality.");

        }
        System.out.println("The texture quality is now: " + textureQuality);
    }

    public void setEffectIntensity(String s) {
        s = s.toUpperCase();
        switch (s) {
            case ("l") -> effectIntensity = "Low";
            case ("m") -> effectIntensity = "Medium";
            case ("h") -> effectIntensity = "High";
            default -> {
                    System.out.println("Invalid effect.");
                    return;
            }

        }
        System.out.println("The effect intensity is now: " + effectIntensity);
    }

    public void setAmbientOcclusion(String s) {
        s = s.toUpperCase();
        switch (s) {
            case ("e") -> ambientOcclusion = "Enabled";
            case ("d") -> ambientOcclusion = "Disabled";
            default -> {
                    System.out.println("Invalid ambient occlusion");
                    return;
            }

        }
        System.out.println("The ambient occlusion is now: " + effectIntensity);
    }

    public void setFieldOfView(int n) {
        if (n >= 60 && n <= 1110) {
            fieldOfView = n;
        } else {
            System.out.println("Invalid field of view.");
        }
    }
}
