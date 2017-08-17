package com.fujitsu.fac.font;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by balote on 13/08/2017.
 */

public class RobotoFontUtil extends AbstractFontUtil {

    private static Typeface robotoBlackFont = null;
    private static Typeface robotoBlackItalicFont = null;
    private static Typeface robotoBoldFont = null;
    private static Typeface robotoBoldItalicFont = null;
    private static Typeface robotoItalicFont = null;
    private static Typeface robotoLightFont = null;
    private static Typeface robotoLightItalicFont = null;
    private static Typeface robotoMediumFont = null;
    private static Typeface robotoMediumItalicFont = null;
    private static Typeface robotoRegularFont = null;
    private static Typeface robotoThinFont = null;
    private static Typeface robotoThinItalic = null;

    private RobotoFontUtil() {
    }

    public static Typeface getRobotoBlackFont(Context context) {

        if (robotoBlackFont == null) {
            robotoBlackFont = getTypeFace(context, "roboto/Roboto-Black.ttf");
        }

        return robotoBlackFont;
    }

    public static Typeface getRobotoBlackItalicFont(Context context) {

        if (robotoBlackItalicFont == null) {
            robotoBlackItalicFont = getTypeFace(context,
                    "roboto/Roboto-BlackItalic.ttf");
        }
        return robotoBlackItalicFont;
    }

    public static Typeface getRobotoBoldFont(Context context) {

        if (robotoBoldFont == null) {
            robotoBoldFont = getTypeFace(context, "roboto/Roboto-Bold.ttf");
        }
        return robotoBoldFont;
    }

    public static Typeface getRobotoBoldItalicFont(Context context) {

        if (robotoBoldItalicFont == null) {
            robotoBoldItalicFont = getTypeFace(context,
                    "roboto/Roboto-BoldItalic.ttf");
        }
        return robotoBoldItalicFont;
    }

    public static Typeface getRobotoItalicFont(Context context) {

        if (robotoItalicFont == null) {
            robotoItalicFont = getTypeFace(context, "roboto/Roboto-Italic.ttf");
        }
        return robotoItalicFont;
    }

    public static Typeface getRobotoLightFont(Context context) {

        if (robotoLightFont == null) {
            robotoLightFont = getTypeFace(context, "roboto/Roboto-Light.ttf");
        }
        return robotoLightFont;
    }

    public static Typeface getRobotoLightItalicFont(Context context) {

        if (robotoLightItalicFont == null) {
            robotoLightItalicFont = getTypeFace(context,
                    "roboto/Roboto-LightItalic.ttf");
        }
        return robotoLightItalicFont;
    }

    public static Typeface getRobotoMediumFont(Context context) {

        if (robotoMediumFont == null) {
            robotoMediumFont = getTypeFace(context, "roboto/Roboto-Medium.ttf");
        }
        return robotoMediumFont;
    }

    public static Typeface getRobotoMediumItalicFont(Context context) {

        if (robotoMediumItalicFont == null) {
            robotoMediumItalicFont = getTypeFace(context,
                    "roboto/Roboto-MediumItalic.ttf");
        }
        return robotoMediumItalicFont;
    }

    public static Typeface getRobotoRegularFont(Context context) {

        if (robotoRegularFont == null) {
            robotoRegularFont = getTypeFace(context,
                    "roboto/Roboto-Regular.ttf");
        }
        return robotoRegularFont;
    }

    public static Typeface getRobotoThinFont(Context context) {

        if (robotoThinFont == null) {
            robotoThinFont = getTypeFace(context, "roboto/Roboto-Thin.ttf");
        }
        return robotoThinFont;
    }

    public static Typeface getRobotoThinItalic(Context context) {

        if (robotoThinItalic == null) {
            robotoThinItalic = getTypeFace(context,
                    "roboto/Roboto-ThinItalic.ttf");
        }
        return robotoThinItalic;
    }
}
