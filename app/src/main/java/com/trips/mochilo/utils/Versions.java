package com.trips.mochilo.utils;


import static android.os.Build.VERSION;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static android.os.Build.VERSION_CODES.KITKAT;
import static android.os.Build.VERSION_CODES.LOLLIPOP;

public class Versions {

    public static boolean hasJellyBean() {
        return VERSION.SDK_INT >= JELLY_BEAN;
    }

    public static boolean hasKitKat() {
        return VERSION.SDK_INT >= KITKAT;
    }

    public static boolean hasLollipop() {
        return VERSION.SDK_INT >= LOLLIPOP;
    }
}
