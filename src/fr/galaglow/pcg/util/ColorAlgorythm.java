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
        }

        return ColorCode.BLACK;
    }
}
