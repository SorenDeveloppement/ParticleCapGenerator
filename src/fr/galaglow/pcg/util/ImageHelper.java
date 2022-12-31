package fr.galaglow.pcg.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ImageHelper {

    public BufferedImage openImage(File image) {
        BufferedImage img;
        try {
            return img = ImageIO.read(image);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public BufferedImage resizeImage(File image) {
        BufferedImage img = openImage(image);
        BufferedImage outputImage = new BufferedImage(70, 100, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(img, 0, 0, null);
        return outputImage;
    }

    public int[] getPixelRGBColor(int pixelX, int pixelY, File image) {
        BufferedImage img = resizeImage(image);
        Color c = new Color(img.getRGB(pixelX, pixelY));
        return new int[]{c.getRed(), c.getGreen(), c.getBlue()};
    }

    public int[][][] getAllPixels(File image) {
        int[][][] pixelsList = new int[70][100][3];
        BufferedImage img = resizeImage(new File(image.toURI()));
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                Color c = new Color(img.getRGB(i, j));
                pixelsList[i][j] = new int[]{c.getRed(), c.getGreen(), c.getBlue()};
            }
        }
        return pixelsList;
    }

}
