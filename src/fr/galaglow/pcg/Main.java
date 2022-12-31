package fr.galaglow.pcg;

import fr.galaglow.pcg.util.ColorAlgorythm;
import fr.galaglow.pcg.util.ImageHelper;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ImageHelper ih = new ImageHelper();
        System.out.println(Arrays.toString(ih.getPixelRGBColor(1, 1, new File("C:\\Users\\soren\\Desktop\\JeuxPygame\\CTF\\assets\\background.png"))));

        String scanner = new Scanner(System.in).nextLine();
        int[][][] list =  ih.getAllPixels(new File(scanner));
        ColorAlgorythm ca = new ColorAlgorythm();
        // BufferedImage newImage = ih.resizeImage(new File(scanner));
        for (int i = 0; i < 70; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println(ca.findNearestColor(list[i][j], 50));
            }
        }
    }
}
