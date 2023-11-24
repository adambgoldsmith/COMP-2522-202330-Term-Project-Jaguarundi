package ca.bcit.comp2522.termproject.jaguarundi;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class BottleBox extends Interactable implements Collidable {
    public static final int BOTTLE_BOX_WIDTH = 50;
    public static final int BOTTLE_BOX_HEIGHT = 50;
    public static final Color BOTTLE_BOX_COLOR = Color.BROWN;

    private final int xPosition;
    private final int yPosition;
    private final int width;
    private final int height;
    private final Color color;


    public BottleBox(final int xPosition, final int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = BOTTLE_BOX_WIDTH;
        this.height = BOTTLE_BOX_HEIGHT;
        this.color = BOTTLE_BOX_COLOR;
    }

    public void draw(final GraphicsContext graphicsContext) {
        graphicsContext.setFill(color);
        graphicsContext.fillRect(xPosition, yPosition, width, height);
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
