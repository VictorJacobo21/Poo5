package wordle.wordlegame;

import java.awt.*;
import java.awt.geom.*;

public class Rectangulo {

    private int sizeWidth;
    private int sizeHeight;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    Shape rectangle;
    Canvas canvas;

    /**
     * Create a new square at default position with default color.
     */
    public Rectangulo() {
        sizeWidth = 60;
        sizeHeight = 60;
        xPosition = 310;
        yPosition = 120;
        color = "red";
        isVisible = false;
    }

    public Rectangulo(int xPosition, int yPosition, int sizeWidth, int sizeHeight, Canvas canvas) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.sizeWidth = sizeWidth;
        this.sizeHeight = sizeHeight;
        rectangle = new Rectangle2D.Double(xPosition, yPosition, sizeWidth, sizeHeight);
        this.canvas = canvas;
    }

    /**
     * Make this square visible. If it was already visible, do nothing.
     */
    public void makeVisible() {
        isVisible = true;
        draw();
    }

    /**
     * Make this square invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible() {
        erase();
        isVisible = false;
    }
    
    /**
     * Change the color of the foreground.
     */
    public void changeColor(String colorString) {
        if (colorString.equals("red")) {
            canvas.setForegroundColor(new Color(235, 25, 25));
        } else if (colorString.equals("black")) {
            canvas.setForegroundColor(Color.black);
        }  else if (colorString.equals("yellow")) {
            canvas.setForegroundColor(new Color(255, 230, 0));
        } else if (colorString.equals("green")) {
            canvas.setForegroundColor(new Color(80, 160, 60));
        } else if (colorString.equals("white")) {
            canvas.setForegroundColor(Color.white);
        } else if (colorString.equals("grey")) {
            canvas.setForegroundColor(new Color(211, 211, 211));
        } else {
            canvas.setForegroundColor(new Color(75,75,75));
        }
    }
    
    /**
     * Draw the square with current specifications on screen.
     */
    public void fill() {
        canvas.fill(this.rectangle);
    }
    
    /**
     * Draw the square with current specifications on screen.
     */
    private void draw() {
        if (isVisible) {
            canvas.draw(this.rectangle);
        }
    }

    /**
     * Erase the square on screen.
     */
    private void erase() {
        if (!isVisible) {
            canvas.erase(this.rectangle);
        }
    }

    public void position(int newXPosition, int newYPosition) {
        xPosition = newXPosition;
        yPosition = newYPosition;
        draw();
    }
    
    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

}
