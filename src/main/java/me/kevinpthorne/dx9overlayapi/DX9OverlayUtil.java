package me.kevinpthorne.dx9overlayapi;

import com.sun.jna.NativeLong;

import java.awt.Color;
import java.awt.Point;
import java.math.BigInteger;

/**
 * Utility methods here for repeated operations like translating java.awt.Color
 * to a D3COLOR type and dealing with referenced returns.
 * <br><br>
 * Created by kevinpthorne on 1/3/2017.
 */
public class DX9OverlayUtil {

    public static NativeLong colorToD3Color(Color color) {
        return new NativeLong(new BigInteger(colorToHex(color), 16).longValue());
    }

    private static String colorToHex(Color color) {
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
