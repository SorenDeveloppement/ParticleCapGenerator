package fr.galaglow.pcg.util;

public class ColorAlgorythm {
    public ColorCode findNearestColor(int[] color, int difference) {
        if (color[0] <= (ColorCode.BLACK.getRGB()[0] + difference) && color[0] >= (ColorCode.BLACK.getRGB()[0] - difference) && color[1] <= (ColorCode.BLACK.getRGB()[1] + difference) && color[1] >= (ColorCode.BLACK.getRGB()[1] - difference) && color[2] <= (ColorCode.BLACK.getRGB()[2] + difference) && color[2] >= (ColorCode.BLACK.getRGB()[2] - difference)) {
            return ColorCode.BLACK;
        } else if (color[0] <= (ColorCode.WHITE.getRGB()[0] + difference) && color[0] >= (ColorCode.WHITE.getRGB()[0] - difference) && color[1] <= (ColorCode.WHITE.getRGB()[1] + difference) && color[1] >= (ColorCode.WHITE.getRGB()[1] - difference) && color[2] <= (ColorCode.WHITE.getRGB()[2] + difference) && color[2] >= (ColorCode.WHITE.getRGB()[2] - difference)) {
            return ColorCode.WHITE;
        } else if (color[0] <= (ColorCode.BLUE.getRGB()[0] + difference) && color[0] >= (ColorCode.BLUE.getRGB()[0] - difference) && color[1] <= (ColorCode.BLUE.getRGB()[1] + difference) && color[1] >= (ColorCode.BLUE.getRGB()[1] - difference) && color[2] <= (ColorCode.BLUE.getRGB()[2] + difference) && color[2] >= (ColorCode.BLUE.getRGB()[2] - difference)) {
            return ColorCode.BLUE;
        } else if (color[0] <= (ColorCode.RED.getRGB()[0] + difference) && color[0] >= (ColorCode.RED.getRGB()[0] - difference) && color[1] <= (ColorCode.RED.getRGB()[1] + difference) && color[1] >= (ColorCode.RED.getRGB()[1] - difference) && color[2] <= (ColorCode.RED.getRGB()[2] + difference) && color[2] >= (ColorCode.RED.getRGB()[2] - difference)) {
            return ColorCode.RED;
        } else if (color[0] <= (ColorCode.CYAN.getRGB()[0] + difference) && color[0] >= (ColorCode.CYAN.getRGB()[0] - difference) && color[1] <= (ColorCode.CYAN.getRGB()[1] + difference) && color[1] >= (ColorCode.CYAN.getRGB()[1] - difference) && color[2] <= (ColorCode.CYAN.getRGB()[2] + difference) && color[2] >= (ColorCode.CYAN.getRGB()[2] - difference)) {
            return ColorCode.CYAN;
        } else if (color[0] <= (ColorCode.GREEN.getRGB()[0] + difference) && color[0] >= (ColorCode.GREEN.getRGB()[0] - difference) && color[1] <= (ColorCode.GREEN.getRGB()[1] + difference) && color[1] >= (ColorCode.GREEN.getRGB()[1] - difference) && color[2] <= (ColorCode.GREEN.getRGB()[2] + difference) && color[2] >= (ColorCode.GREEN.getRGB()[2] - difference)) {
            return ColorCode.GREEN;
        } else if (color[0] <= (ColorCode.BROWN.getRGB()[0] + difference) && color[0] >= (ColorCode.BROWN.getRGB()[0] - difference) && color[1] <= (ColorCode.BROWN.getRGB()[1] + difference) && color[1] >= (ColorCode.BROWN.getRGB()[1] - difference) && color[2] <= (ColorCode.BROWN.getRGB()[2] + difference) && color[2] >= (ColorCode.BROWN.getRGB()[2] - difference)) {
            return ColorCode.BROWN;
        } else if (color[0] <= (ColorCode.GRIS.getRGB()[0] + difference) && color[0] >= (ColorCode.GRIS.getRGB()[0] - difference) && color[1] <= (ColorCode.GRIS.getRGB()[1] + difference) && color[1] >= (ColorCode.GRIS.getRGB()[1] - difference) && color[2] <= (ColorCode.GRIS.getRGB()[2] + difference) && color[2] >= (ColorCode.GRIS.getRGB()[2] - difference)) {
            return ColorCode.GRIS;
        } else if (color[0] <= (ColorCode.MAGENTA.getRGB()[0] + difference) && color[0] >= (ColorCode.MAGENTA.getRGB()[0] - difference) && color[1] <= (ColorCode.MAGENTA.getRGB()[1] + difference) && color[1] >= (ColorCode.MAGENTA.getRGB()[1] - difference) && color[2] <= (ColorCode.MAGENTA.getRGB()[2] + difference) && color[2] >= (ColorCode.MAGENTA.getRGB()[2] - difference)) {
            return ColorCode.MAGENTA;
        } else if (color[0] <= (ColorCode.ORANGE.getRGB()[0] + difference) && color[0] >= (ColorCode.ORANGE.getRGB()[0] - difference) && color[1] <= (ColorCode.ORANGE.getRGB()[1] + difference) && color[1] >= (ColorCode.ORANGE.getRGB()[1] - difference) && color[2] <= (ColorCode.ORANGE.getRGB()[2] + difference) && color[2] >= (ColorCode.ORANGE.getRGB()[2] - difference)) {
            return ColorCode.ORANGE;
        } else if (color[0] <= (ColorCode.PINK.getRGB()[0] + difference) && color[0] >= (ColorCode.PINK.getRGB()[0] - difference) && color[1] <= (ColorCode.PINK.getRGB()[1] + difference) && color[1] >= (ColorCode.PINK.getRGB()[1] - difference) && color[2] <= (ColorCode.PINK.getRGB()[2] + difference) && color[2] >= (ColorCode.PINK.getRGB()[2] - difference)) {
            return ColorCode.PINK;
        } else if (color[0] <= (ColorCode.YELLOW.getRGB()[0] + difference) && color[0] >= (ColorCode.YELLOW.getRGB()[0] - difference) && color[1] <= (ColorCode.YELLOW.getRGB()[1] + difference) && color[1] >= (ColorCode.YELLOW.getRGB()[1] - difference) && color[2] <= (ColorCode.YELLOW.getRGB()[2] + difference) && color[2] >= (ColorCode.YELLOW.getRGB()[2] - difference)) {
            return ColorCode.YELLOW;
        } else if (color[0] <= (ColorCode.PURPLE.getRGB()[0] + difference) && color[0] >= (ColorCode.PURPLE.getRGB()[0] - difference) && color[1] <= (ColorCode.PURPLE.getRGB()[1] + difference) && color[1] >= (ColorCode.PURPLE.getRGB()[1] - difference) && color[2] <= (ColorCode.PURPLE.getRGB()[2] + difference) && color[2] >= (ColorCode.PURPLE.getRGB()[2] - difference)) {
            return ColorCode.PURPLE;
        }

        return ColorCode.BLACK;
    }
}