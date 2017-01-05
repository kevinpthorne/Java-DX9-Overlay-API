package me.kevinpthorne.dx9overlayapi;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;

/**
 *
 * Source: <a href="https://github.com/agrippa1994/DX9-Overlay-API/blob/master/include/c%23/Overlay.cs">DX9-Overlay-API GitHub</a>
 * <br>
 * Created by kevinpthorne on 1/3/2017.
 */
public interface DX9OverlayAPI extends Library {

    DX9OverlayAPI INSTANCE = (DX9OverlayAPI) Native.loadLibrary("dx9_overlay", DX9OverlayAPI.class);

//    [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int TextCreate(string font, int fontSize, bool bBold, bool bItalic, int x, int y, uint color, string text, bool bShadow, bool bShow);

    int TextCreate(String font, int fontSize, boolean bBold, boolean bItalic, int x, int y, NativeLong color, String text, boolean bShadow, boolean bShow);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int TextDestroy(int id);

    int TextDestroy(int id);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int TextSetShadow(int id, bool b);

    int TextSetShadow(int id, boolean b);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int TextSetShown(int id, bool b);

    int TextSetShown(int id, boolean b);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int TextSetColor(int id, uint color);

    int TextSetColor(int id, NativeLong color);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int TextSetPos(int id, int x, int y);

    int TextSetPos(int id, int x, int y);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int TextSetString(int id, string str);

    int TextSetString(int id, String str);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int TextUpdate(int id, string font, int fontSize, bool bBold, bool bItalic);

    int TextUpdate(int id, String font, int fontSize, boolean bBold, boolean bItalic);

//
//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int BoxCreate(int x, int y, int w, int h, uint dwColor, bool bShow);

    int BoxCreate(int x, int y, int w, int h, NativeLong dwColor, boolean bShow);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int BoxDestroy(int id);

    int BoxDestroy(int id);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int BoxSetShown(int id, bool bShown);

    int BoxSetShown(int id, boolean bShown);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int BoxSetBorder(int id, int height, bool bShown);

    int BoxSetBorder(int id, int height, boolean bShown);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int BoxSetBorderColor(int id, uint dwColor);

    int BoxSetBorderColor(int id, NativeLong dwColor);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int BoxSetColor(int id, uint dwColor);

    int BoxSetColor(int id, NativeLong dwColor);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int BoxSetHeight(int id, int height);

    int BoxSetHeight(int id, int height);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int BoxSetPos(int id, int x, int y);

    int BoxSetPos(int id, int x, int y);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int BoxSetWidth(int id, int width);

    int BoxSetWidth(int id, int width);

//
//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int LineCreate(int x1, int y1, int x2, int y2, int width, uint color, bool bShow);

    int LineCreate(int x1, int y1, int x2, int y2, int width, NativeLong color, boolean bShow);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int LineDestroy(int id);

    int LineDestroy(int id);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int LineSetShown(int id, bool bShown);

    int LineSetShown(int id, boolean bShown);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int LineSetColor(int id, uint color);

    int LineSetColor(int id, NativeLong color);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int LineSetWidth(int id, int width);

    int LineSetWidth(int id, int width);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int LineSetPos(int id, int x1, int y1, int x2, int y2);

    int LineSetPos(int id, int x1, int y1, int x2, int y2);

//
//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int ImageCreate(string path, int x, int y, int rotation, int align, bool bShow);

    int ImageCreate(String path, int x, int y, int rotation, int align, boolean bShow);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int ImageDestroy(int id);

    int ImageDestroy(int id);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int ImageSetShown(int id, bool bShown);

    int ImageSetShown(int id, boolean bShown);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int ImageSetAlign(int id, int align);

    int ImageSetAlign(int id, int align);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int ImageSetPos(int id, int x, int y);

    int ImageSetPos(int id, int x, int y);

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int ImageSetRotation(int id, int rotation);

    int ImageSetRotation(int id, int rotation);

//
//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int DestroyAllVisual();

    int DestroyAllVisual();

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int ShowAllVisual();

    int ShowAllVisual();

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int HideAllVisual();

    int HideAllVisual();

//
//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int GetFrameRate();

    int GetFrameRate();

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int GetScreenSpecs(out int width, out int height);

    int GetScreenSpecs(int width, int height);

//
//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern int Init();

    int Init();

//        [DllImport(PATH, CallingConvention = CallingConvention.Cdecl)]
//    public static extern void SetParam(string _szParamName, string _szParamValue);

    void SetParam(String _szParamName, String _szParamValue);


}
