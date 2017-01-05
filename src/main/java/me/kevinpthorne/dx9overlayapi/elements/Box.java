package me.kevinpthorne.dx9overlayapi.elements;

import com.sun.jna.ptr.IntByReference;
import me.kevinpthorne.dx9overlayapi.DX9OverlayAPI;
import me.kevinpthorne.dx9overlayapi.DX9OverlayUtil;

import java.awt.Color;
import java.awt.Rectangle;


/**
 * Created by kevint on 1/3/2017.
 */
public class Box extends OverlayElement {

    private Color color;
    private Rectangle rectangle;
    private boolean borderShown;
    private int borderHeight;
    private Color borderColor;

    public Box(Rectangle rectangle, Color color, boolean show) {
        new Box(rectangle, color, show, false, 0, DEFAULT_COLOR);
    }

    public Box(Rectangle rectangle, Color color, boolean show, boolean borderShown) {
        new Box(rectangle, color, show, borderShown, 0, DEFAULT_COLOR);
    }

    public Box(Rectangle rectangle, Color color, boolean show, boolean borderShown, int borderHeight) {
        new Box(rectangle, color, show, borderShown, borderHeight, DEFAULT_COLOR);
    }

    public Box(Rectangle rectangle, Color color, boolean show, boolean borderShown, int borderHeight, Color borderColor)
    {
        setId(DX9OverlayAPI.INSTANCE.BoxCreate(rectangle.x, rectangle.y, rectangle.width, rectangle.height, DX9OverlayUtil.colorToD3Color(color), show));
        if (borderHeight != 0) {
            DX9OverlayAPI.INSTANCE.BoxSetBorder(getId(), borderHeight, borderShown);
            this.borderHeight = borderHeight;
            this.borderShown = borderShown;
        }
        if (borderColor != DEFAULT_COLOR)
        {
            DX9OverlayAPI.INSTANCE.BoxSetBorderColor(getId(), DX9OverlayUtil.colorToD3Color(borderColor));
            this.borderColor = borderColor;
        }
        this.rectangle = rectangle;
        setVisible(show);
        this.color = color;
    }

    @Override
    public void destroy() {
        DX9OverlayAPI.INSTANCE.BoxDestroy(getId());
        super.destroy();
    }


    @Override
    public void setVisible(boolean visible) {
        DX9OverlayAPI.INSTANCE.BoxSetShown(getId(), visible);
        super.setVisible(visible);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        DX9OverlayAPI.INSTANCE.BoxSetColor(getId(), DX9OverlayUtil.colorToD3Color(color));
        this.color = color;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rect) {
        DX9OverlayAPI.INSTANCE.BoxSetPos(getId(), rect.x, rect.y);
        DX9OverlayAPI.INSTANCE.BoxSetWidth(getId(), rect.width);
        DX9OverlayAPI.INSTANCE.BoxSetHeight(getId(), rect.height);

        this.rectangle = rect;
    }

    public boolean isBorderShown() {
        return borderShown;
    }

    public void setBorderShown(boolean borderShown) {
        DX9OverlayAPI.INSTANCE.BoxSetBorder(getId(), borderHeight, borderShown);
        this.borderShown = borderShown;
    }

    public int getBorderHeight() {
        return borderHeight;
    }

    public void setBorderHeight(int borderHeight) {
        DX9OverlayAPI.INSTANCE.BoxSetBorder(getId(), borderHeight, borderShown);
        this.borderHeight = borderHeight;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        DX9OverlayAPI.INSTANCE.BoxSetBorderColor(getId(), DX9OverlayUtil.colorToD3Color(borderColor));
        this.borderColor = borderColor;
    }
}
