package fr.galaglow.pcg.util;

public enum ColorCode {
    BLACK(0, "#000000", 0, 0, 0),
    WHITE(1, "#ffffff", 255, 255, 255),
    GRIS(2, "#c5c5c5", 128, 128, 128),
    BLUE(3, "#0000ff", 0, 0, 255),
    RED(4, "#ff0000", 255, 0, 0),
    GREEN(5, "#00ff00", 0, 255, 0),
    BROWN(6, "#7f3b1e", 127, 59, 30),
    ORANGE(7, "#ff8e06", 255, 142, 6),
    PURPLE(8, "#7a238a", 125, 35, 135),
    YELLOW(9, "#ffcf39", 255, 210, 60),
    PINK(10, "#ffacc8", 235, 150, 180),
    CYAN(11, "#00ffff", 0, 255, 255),
    MAGENTA(12, "#ff00ff", 255, 0, 255);

    private final int number;
    private final String hexadecimal;
    private final int r;
    private final int g;
    private final int b;
    ColorCode(int number, String hexadecimal, int r, int g, int b) {
        this.number = number;
        this.hexadecimal = hexadecimal;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    int getColorNumber() {
        return number;
    }

    String getHexadecimal() {
        return hexadecimal;
    }

    int[] getRGB() {
        return new int[]{r, g, b};
    }
}
