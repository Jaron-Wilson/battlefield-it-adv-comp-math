import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Jaron Wilson
 * @version 2/22/23
 */
public class MyWorld extends World {

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(702, 461, 1);
    }

    public void fillRandom() {
        for (int i = 0; i < getWidth(); i++) {
            for (int y = 0; y < getHeight(); y++) {
                GreenfootImage bg = getBackground();
                int x = i;
                Color purple = new Color(
                        (int) (Math.random() * 256),
                        (int) (Math.random() * 256),
                        (int) (Math.random() * 256));
                bg.setColorAt(x, y, purple);
            }
        }
    }

    public void fillSolidRandom() {
        int rand = (int) (Math.random() * 256), rand1 = (int) (Math.random() * 256),
        rand2 = (int) (Math.random() * 256);
        Color color = new Color(rand, rand1, rand2);
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                getBackground().setColorAt(x, y, color);
            }
        }
    }

    public void redScale() {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                // Get background pixels
                Color pixel = getBackground().getColorAt(x, y);
                // set color to the new red scale
                Color color = new Color(pixel.getRed(), pixel.getGreen()/8, pixel.getBlue()/8);
                getBackground().setColorAt(x, y, color);
            }
        }
    }

    public void greenScale() {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                // Get background pixels
                Color pixel = getBackground().getColorAt(x, y);
                // set color to the new green scale
                Color color = new Color(pixel.getRed()/8, pixel.getGreen(), pixel.getBlue()/8);
                getBackground().setColorAt(x, y, color);
            }
        }
    }

    public void blueScale() {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                // Get background pixels
                Color pixel = getBackground().getColorAt(x, y);
                // set color to the new blue scale
                Color color = new Color(pixel.getRed()/8, pixel.getGreen()/8, pixel.getBlue());
                getBackground().setColorAt(x, y, color);
            }
        }
    }

    public void darken() {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                //Color pixelColor = getBackground().getColorAt(x, y).darker();
                //OR
                getBackground().setColorAt(x, y, getBackground().getColorAt(x, y).darker());
            }
        }
    }

    public void brighten() {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                //Color pixelColor = getBackground().getColorAt(x, y).brighter();
                //OR
                getBackground().setColorAt(x, y, getBackground().getColorAt(x, y).brighter());
            }
        }
    }

    public void grayScale() {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                // Get background pixels
                Color pixel = getBackground().getColorAt(x, y);
                // divide all by 3 when added up
                int get = (pixel.getRed()
                        + pixel.getGreen()
                        + pixel.getBlue()) / 3;
                // set color to the new gray scale
                Color color = new Color(get, get, get);
                getBackground().setColorAt(x, y, color);
            }
        }
    }

    public void invert() {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                // get old color
                Color oldColor = getBackground().getColorAt(x, y);
                // get opposite color by subracting from 255 and then get that sum for the new
                // color
                int newRed = (oldColor.getRed() - 255) * -1;
                int newGreen = (oldColor.getGreen() - 255) * -1;
                int newBlue = (oldColor.getBlue() - 255) * -1;
                // Set the color to new colors
                Color newColor = new Color(newRed, newGreen, newBlue);
                getBackground().setColorAt(x, y, newColor);
                // System.out.println("red: " + newRed + "green: " + newGreen + "blue: " +
                // newBlue);
            }
        }
    }

    public void mirrorLeftToRight() {
        for (int x = 0; x < getWidth() / 2; x++) {
            for (int y = 0; y < getHeight(); y++) {
                Color oldColor = getBackground().getColorAt(x, y);
                int newLoc = (getWidth() - 1) - x;
                getBackground().setColorAt(newLoc, y, oldColor);
            }
        }
    }

    public void mirrorRightToLeft() {
        for (int x = getWidth() - 1; x > getWidth() / 2; x--) {
            for (int y = 0; y < getHeight(); y++) {
                Color oldColor = getBackground().getColorAt(x, y);
                int newLoc = (getWidth() - 1) - x;
                getBackground().setColorAt(newLoc, y, oldColor);
            }
        }
    }

    public void mirrorTopToBottom() {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight() / 2; y++) {
                Color oldColor = getBackground().getColorAt(x, y);
                int newLoc = (getHeight() - 1) - y;
                getBackground().setColorAt(x, newLoc, oldColor);
            }
        }
    }

    public void mirrorBottomToTop() {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = getHeight() - 1; y > getHeight() / 2; y--) {
                Color oldColor = getBackground().getColorAt(x, y);
                int newLoc = (getHeight() - 1) - y;
                getBackground().setColorAt(x, newLoc, oldColor);
            }
        }
    }

    public void flipHorizontal() {
        for (int x = 0; x < getWidth() / 2; x++) {
            for (int y = 0; y < getHeight(); y++) {
                // Get right color location
                int newLoc = (getWidth() - 1) - x;
                // Get the left color and store it.
                Color leftColor = getBackground().getColorAt(x, y);
                // Get the right color and store it.
                Color rightColor = getBackground().getColorAt(newLoc, y);
                

                // Set the right location to the left color
                getBackground().setColorAt(newLoc, y, leftColor);
                // Set the left location to the right color
                getBackground().setColorAt(x, y, rightColor);
            }

        }
    }

    public void flipVertical() {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight() / 2; y++) {
                // Get right color location
                int newLoc = (getHeight() - 1) - y;
                // Get the left color and store it.
                Color topColor = getBackground().getColorAt(x, y);
                // Get the right color and store it.
                Color bottomColor = getBackground().getColorAt(x, newLoc);
                

                // Set the right location to the left color
                getBackground().setColorAt(x, newLoc, topColor);
                // Set the left location to the right color
                getBackground().setColorAt(x, y, bottomColor);
            }

        }
    }
}
