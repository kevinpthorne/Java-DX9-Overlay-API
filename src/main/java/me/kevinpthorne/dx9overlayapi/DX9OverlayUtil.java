package me.kevinpthorne.dx9overlayapi;


import com.sun.jna.NativeLong;
import com.sun.jna.ptr.IntByReference;
import sun.security.util.BigInt;

import java.awt.Color;
import java.awt.Point;
import java.math.BigInteger;

/**
 * Created by kevint on 1/3/2017.
 */
public class DX9OverlayUtil {

//    public static string ToHexValueRGB(Color color)
//    {
//        return "" + color.R.ToString("X2") + color.G.ToString("X2") + color.B.ToString("X2");
//    }
//    public static string ToHexValueARGB(Color color)
//    {
//        return "" + color.A.ToString("X2") + color.R.ToString("X2") + color.G.ToString("X2") + color.B.ToString("X2");
//    }
//    public Point GetScreenSpecs()
//    {
//        int x, y;
//        GetScreenSpecs(out x, out y);
//        return new Point(x, y);
//    }

    public static NativeLong colorToD3Color(Color color) {
        return new NativeLong(new BigInteger(colorToHex(color), 16).longValue());
    }

    private static String colorToHex(Color color) {
        //TODO fix alpha
        String argb = Integer.toHexString(color.getRGB());
        argb = argb.substring(2, argb.length());
        return Integer.toHexString(color.getAlpha()) + argb;
    }

    public static Point getScreenSpecs() {
        int x = 0, y = 0;
        DX9OverlayAPI.INSTANCE.GetScreenSpecs(x, y);
        return new Point(x, y);
    }

}
