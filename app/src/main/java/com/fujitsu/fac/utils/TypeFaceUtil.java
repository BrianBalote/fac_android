package com.fujitsu.fac.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by balote on 26/09/2017.
 */

public class TypeFaceUtil {

    private static Typeface fujitsuSansBold = null;
    private static Typeface fujitsuSansLight = null;
    private static Typeface fujitsuSansLightItalic = null;
    private static Typeface fujitsuSansMedium = null;
    private static Typeface fujitsuSansMediumItalic = null;
    private static Typeface fujitsuSansRegular = null;

    private TypeFaceUtil() {
    }

    public static Typeface getFujitsuSansBold(Context c) {
        if(fujitsuSansBold == null) {
            fujitsuSansBold = Typeface.createFromAsset(c.getAssets(), "FujitsuSansBold.ttf");
        }
        return  fujitsuSansBold;
    }

    public static Typeface getFujitsuSansLight(Context c) {
        if(fujitsuSansLight == null) {
            fujitsuSansLight = Typeface.createFromAsset(c.getAssets(), "FujitsuSansLight.ttf");
        }
        return  fujitsuSansLight;
    }

    public static Typeface getFujitsuSansLightItalic(Context c) {
        if(fujitsuSansLightItalic == null) {
            fujitsuSansLightItalic = Typeface.createFromAsset(c.getAssets(), "FujitsuSansLightIta.ttf");
        }
        return  fujitsuSansLightItalic;
    }

    public static Typeface getFujitsuSansMedium(Context c) {
        if(fujitsuSansMedium == null) {
            fujitsuSansMedium = Typeface.createFromAsset(c.getAssets(), "FujitsuSansMedium.ttf");
        }
        return  fujitsuSansMedium;
    }

    public static Typeface getFujitsuSansMediumIta(Context c) {
        if(fujitsuSansMediumItalic == null) {
            fujitsuSansMediumItalic = Typeface.createFromAsset(c.getAssets(), "FujitsuSansMediumIta.ttf");
        }
        return  fujitsuSansMediumItalic;
    }

    public static Typeface getFujitsuSansRegular(Context c) {
        if(fujitsuSansRegular == null) {
            fujitsuSansRegular = Typeface.createFromAsset(c.getAssets(), "FujitsuSansRegular.ttf");
        }
        return  fujitsuSansRegular;
    }
}
