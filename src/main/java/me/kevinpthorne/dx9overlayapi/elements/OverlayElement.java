package me.kevinpthorne.dx9overlayapi.elements;

import java.awt.Color;

/**
 * Generic class for any overlays
 *
 * Created by kevinpthorne on 1/3/2017.
 */
public abstract class OverlayElement {

    public static Color DEFAULT_COLOR = Color.WHITE;

    private int id = -1;
    private boolean visible;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void destroy() {
        id = -1;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + id;
    }

}
