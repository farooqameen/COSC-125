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

    int volume;
    int fieldOfView;
    String textureQuality;
    String effectIntensity;
    String ambientOcclusion;

    Settings() {
        fieldOfView = 60;
        textureQuality = "Low";
        effectIntensity = "Low";
        ambientOcclusion = "Enabled";
    }
    void displayAll() {
        System.out.println("The current settings are: ");
        displayVolume();
        System.out.println("2. Field of view: " + fieldOfView);
        System.out.println("3. Texture quality: " + textureQuality);
        System.out.println("4. Effect intensity: " + effectIntensity);
        System.out.println("5. Ambient occlusion: " + ambientOcclusion);
    }

    void displayVolume() {
        System.out.print("1. Volume: ");
        for (int i = 0; i < volume; i++) {
            System.out.print("|");
        }
        for (int i = 0; i < (100 - volume); i++) {
            System.out.print(".");
        }
        System.out.println();
    }

    void setVolume(int n) {
        if (n >= 0 && n <= 100) {
            volume = n;
        } else {
            System.out.println("Invalid volume.");
        }
    }

    void setTextureQuality(String s) {
        s.toUpperCase();
        switch (s) {
            case ("l"):
                textureQuality = "Low";
                break;
            case ("m"):
                textureQuality = "Medium";
                break;
            case ("h"):
                textureQuality = "High";
                break;
            default:
                System.out.println("Invalid texture quality.");
                break;

        }
        System.out.println("The texture quality is now: " + textureQuality);
    }

    void setEffectIntensity(String s) {
        s.toUpperCase();
        switch (s) {
            case ("l"):
                effectIntensity = "Low";
                break;
            case ("m"):
                effectIntensity = "Medium";
                break;
            case ("h"):
                effectIntensity = "High";
                break;
            default:
                System.out.println("Invalid effect.");
                return;

        }
        System.out.println("The effect intensity is now: " + effectIntensity);
    }

    void setAmbientOcclusion(String s) {
        s.toUpperCase();
        switch (s) {
            case ("e"):
                ambientOcclusion = "Enabled";
                break;
            case ("d"):
                ambientOcclusion = "Disabled";
                break;
            default:
                System.out.println("Invalid ambient occlusion");
                return;

        }
        System.out.println("The ambient occlusion is now: " + effectIntensity);
    }
    void setFieldOfView(int n) {
        if (n >= 60 && n <= 1110) {
            fieldOfView = n;
        } else {
            System.out.println("Invalid field of view.");
        }
    }
}
