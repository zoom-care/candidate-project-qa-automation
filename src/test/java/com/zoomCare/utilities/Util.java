package com.zoomCare.utilities;

public class Util {

    public static int randomNumberGenerator(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
