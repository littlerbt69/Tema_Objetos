package Examen_2024;

public class Pixel {
    private int red;
    private int green;
    private int blue;
    private boolean defectuoso;

    public Pixel(boolean defectuoso) {
        this.defectuoso = defectuoso;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public boolean isDefectuoso() {
        return defectuoso;
    }
}
