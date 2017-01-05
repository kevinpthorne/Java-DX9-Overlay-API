package me.kevinpthorne.dx9overlayapi.elements;

import me.kevinpthorne.dx9overlayapi.DX9OverlayAPI;

import java.awt.Point;

/**
 * Created by kevinpthorne on 1/3/2017.
 */
public class Image extends OverlayElement {

    private int rotation;
    private Point position;
    private Align align;

    public Image(String path, Point position, int rotation, Align align, boolean show) {
        setId(DX9OverlayAPI.INSTANCE.ImageCreate(path, position.x, position.y, rotation, align.getValue(), show));

        this.rotation = rotation;
        this.position = position;
        this.align = align;
        setVisible(show);
    }

    @Override
    public void destroy() {
        DX9OverlayAPI.INSTANCE.ImageDestroy(getId());
        super.destroy();
    }

    public int getRotation() {
        return rotation;
    }

    /**
     * @param rotation in degrees?
     */
    public void setRotation(int rotation) {
        DX9OverlayAPI.INSTANCE.ImageSetRotation(getId(), rotation);
        this.rotation = rotation;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        DX9OverlayAPI.INSTANCE.ImageSetPos(getId(), position.x, position.y);
        this.position = position;
    }

    public Align getAlign() {
        return align;
    }

    public void setAlign(Align align) {
        DX9OverlayAPI.INSTANCE.ImageSetAlign(getId(), align.getValue());
        this.align = align;
    }

    @Override
    public void setVisible(boolean visible) {
        DX9OverlayAPI.INSTANCE.ImageSetShown(getId(), visible);
        super.setVisible(visible);
    }

    private enum Align {
        LEFT(0),
        CENTER(1),
        RIGHT(2);

        int value;

        Align(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
