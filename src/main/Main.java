package main;

import gui.Window;
import utils.Punto;

public class Main {
    public static void main(String[] args) {
        Punto[] figura = {
                new Punto(0, 0), new Punto(6, 5), new Punto(13, 0), new Punto(19, 5), new Punto(25, 0),
                new Punto(31, 5), new Punto(38, 0), new Punto(44, 5), new Punto(50, 0), new Punto(56, 5),
                new Punto(63, 0), new Punto(69, 5), new Punto(75, 0), new Punto(81, 5), new Punto(88, 0),
                new Punto(94, 5), new Punto(100, 0), new Punto(108, 6), new Punto(110, 13), new Punto(118, 19),
                new Punto(120, 25), new Punto(128, 31), new Punto(130, 38), new Punto(138, 44), new Punto(140, 50),
                new Punto(138, 56), new Punto(130, 63), new Punto(128, 69), new Punto(120, 75), new Punto(118, 81),
                new Punto(110, 88), new Punto(108, 94), new Punto(100, 100), new Punto(94, 95), new Punto(88, 100),
                new Punto(81, 95), new Punto(75, 100), new Punto(69, 95), new Punto(63, 100), new Punto(56, 95),
                new Punto(50, 100), new Punto(44, 95), new Punto(38, 100), new Punto(31, 95), new Punto(25, 100),
                new Punto(19, 95), new Punto(13, 100), new Punto(6, 95), new Punto(0, 100), new Punto(5, 94),
                new Punto(0, 88), new Punto(5, 81), new Punto(0, 75), new Punto(5, 69), new Punto(0, 63),
                new Punto(5, 56), new Punto(0, 50), new Punto(5, 44), new Punto(0, 38), new Punto(5, 31),
                new Punto(0, 25), new Punto(5, 19), new Punto(0, 13), new Punto(5, 6), new Punto(0, 0),
        };

        new Window("Proyecto", figura);
    }
}
