package com.project.android.utils;


import static android.os.Build.VERSION;
import static android.os.Build.VERSION_CODES.JELLY_BEAN;
import static android.os.Build.VERSION_CODES.KITKAT;
import static android.os.Build.VERSION_CODES.LOLLIPOP;
import static android.os.Build.VERSION_CODES.M;
import static android.os.Build.VERSION_CODES.N;

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

    public static boolean hasM() {
        return VERSION.SDK_INT >= M;
    }

    public static boolean hasN() {
        return VERSION.SDK_INT >= N;
    }
}
