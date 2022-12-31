package fr.galaglow.pcg;

import fr.galaglow.pcg.util.ColorAlgorythm;
import fr.galaglow.pcg.util.ImageHelper;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ImageHelper ih = new ImageHelper();
        System.out.println(Arrays.toString(ih.getPixelRGBColor(1, 1, new File("C:\\Users\\soren\\Desktop\\JeuxPygame\\CTF\\assets\\background.png"))));
        int[][][] list =  ih.getAllPixels(new File("C:\\Users\\soren\\Desktop\\JeuxPygame\\CTF\\assets\\background.png"));
        
        ColorAlgorythm ca = new ColorAlgorythm();
        System.out.println(ca.findNearestColor(list[20][30], 50));
    }
}
