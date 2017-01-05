# Java-DX9-Overlay-API
A Java Wrapper for the [DX9-Overlay-API](https://github.com/agrippa1994/DX9-Overlay-API)

### Usage example (dx9-overlay.dll needs to be added to classpath)
    import me.kevinpthorne.dx9overlayapi.DX9OverlayAPI;
    import me.kevinpthorne.dx9overlayapi.elements.TextLabel;
    
    import java.awt.Color;
    import java.awt.Point;
    
    /**
     * Created by kevint on 1/3/2017.
     */
    public class MyOverlay {
    
        public static void main(String[] args) throws InterruptedException {
    
            DX9OverlayAPI.INSTANCE.SetParam("process", "AoK HD.exe");
            DX9OverlayAPI.INSTANCE.DestroyAllVisual();
    
            System.out.println("Creating text");
    
            TextLabel text = new TextLabel("Arial", 20, false, false, new Point(10, 10), Color.RED, "Test123", true, true);
            Thread.sleep(5000);
    
            System.out.println("Updating text");
            text.setText("updated text");
            Thread.sleep(5000);
    
            System.out.println("Recoloring text");
            text.setColor(Color.CYAN);
            Thread.sleep(5000);
    
            System.out.println("Destroying text");
            text.destroy();
        }
    
    }
