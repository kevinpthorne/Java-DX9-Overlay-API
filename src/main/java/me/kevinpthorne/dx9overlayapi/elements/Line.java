package me.kevinpthorne.dx9overlayapi.elements;

import me.kevinpthorne.dx9overlayapi.DX9OverlayAPI;
import me.kevinpthorne.dx9overlayapi.DX9OverlayUtil;

import java.awt.Color;
import java.awt.Point;

/**
 * Created by kevint on 1/3/2017.
 */
public class Line extends OverlayElement {

    private Color color;
    private int width;
    private Point startPos;
    private Point endPos;

    public Line(Color color, int width, Point startPos, Point endPos, boolean show) {
        setId(DX9OverlayAPI.INSTANCE.LineCreate(startPos.x, startPos.y, endPos.x, endPos.y, width, DX9OverlayUtil.colorToD3Color(color), show));
        this.color = color;
        this.width = width;
        this.startPos = startPos;
        this.endPos = endPos;
        setVisible(show);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        DX9OverlayAPI.INSTANCE.LineSetColor(getId(), DX9OverlayUtil.colorToD3Color(color));
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        DX9OverlayAPI.INSTANCE.LineSetWidth(getId(), width);
        this.width = width;
    }

    public Point getStartPos() {
        return startPos;
    }

    public void setStartPos(Point startPos) {
        DX9OverlayAPI.INSTANCE.LineSetPos(getId(), startPos.x, startPos.y, endPos.x, endPos.y);
        this.startPos = startPos;
    }

    public Point getEndPos() {
        return endPos;
    }

    public void setEndPos(Point endPos) {
        DX9OverlayAPI.INSTANCE.LineSetPos(getId(), startPos.x, startPos.y, endPos.x, endPos.y);
        this.endPos = endPos;
    }

    @Override
    public void setVisible(boolean visible) {
        DX9OverlayAPI.INSTANCE.LineSetShown(getId(), visible);
        super.setVisible(visible);
    }

    @Override
    public void destroy() {
        DX9OverlayAPI.INSTANCE.LineDestroy(getId());
        super.destroy();
    }
}
