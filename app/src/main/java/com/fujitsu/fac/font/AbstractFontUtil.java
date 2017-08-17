package com.fujitsu.fac.font;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by balote on 13/08/2017.
 */

public abstract class AbstractFontUtil {

    protected AbstractFontUtil() {
    }

    public static Typeface getTypeFace(Context context, String typefaceName) {

        return Typeface.createFromAsset(context.getAssets(), typefaceName);

    }
}
