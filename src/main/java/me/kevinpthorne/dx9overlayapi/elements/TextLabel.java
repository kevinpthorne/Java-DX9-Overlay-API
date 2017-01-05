package me.kevinpthorne.dx9overlayapi.elements;

import me.kevinpthorne.dx9overlayapi.DX9OverlayAPI;
import me.kevinpthorne.dx9overlayapi.DX9OverlayUtil;

import java.awt.Color;
import java.awt.Point;

/**
 * Created by kevinpthorne on 1/3/2017.
 */
public class TextLabel extends OverlayElement {

    private String text;
    private boolean shadow;
    private Color color;
    private Point position;

    public TextLabel(String font, int size, boolean bold, boolean italic, Point pos, Color color, String text, boolean shadow, boolean show)
    {
        setId(DX9OverlayAPI.INSTANCE.TextCreate(font, size, bold, italic, pos.x, pos.y, DX9OverlayUtil.colorToD3Color(color), text, shadow, show));
        this.text = text;
        this.shadow = shadow;
        this.color = color;
        this.position = pos;
        setVisible(show);
    }


    public void update(String font, int size, boolean bold, boolean italic) {
        DX9OverlayAPI.INSTANCE.TextUpdate(getId(), font, size, bold, italic);
    }

    @Override
    public void destroy() {
        DX9OverlayAPI.INSTANCE.TextDestroy(getId());
        super.destroy();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        DX9OverlayAPI.INSTANCE.TextSetString(getId(), text);
        this.text = text;
    }

    public boolean isShadow() {
        return shadow;
    }

    public void setShadow(boolean shadow) {
        DX9OverlayAPI.INSTANCE.TextSetShadow(getId(), shadow);
        this.shadow = shadow;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        DX9OverlayAPI.INSTANCE.TextSetColor(getId(), DX9OverlayUtil.colorToD3Color(color));
        this.color = color;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        DX9OverlayAPI.INSTANCE.TextSetPos(getId(), position.x, position.y);
        this.position = position;
    }

    @Override
    public void setVisible(boolean visible) {
        DX9OverlayAPI.INSTANCE.TextSetShown(getId(), visible);
        super.setVisible(visible);
    }
}
