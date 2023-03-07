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

    public void pixelate() {
        // get pixel starting at 5 then add 10
        for (int x = 5; x <= getWidth(); x+=10) {
            // get pixel starting at 5 then add 10
            for (int y = 5; y <= getHeight(); y+=10) {
                // get the color at that location, it will be the color we will set it at.
                Color color = getColorAt(x,y);
                // new loop for the pixels -5 infront of the pixel and +5 infront of the pixel
                for (int x1 = -5; x1 <= 5; x1++) {
                    // same here but up and down
                    for (int y1 = -5; y1 <= 5; y1++) {
                        // set the color to the one above and we need to add the x+x1 to set that pixel to that color.
                        getBackground().setColorAt(x+x1, y+y1, color);
                    }
                }

            }

        }
    }

    public void pixelate(int amount) {
        for (int x = 0; x < getWidth(); x += amount) {
            for (int y = 0; y < getHeight(); y += amount) {
                Color color = getColorAt(x, y);

                for (int x1 = 0; x1 < amount; x1++) {
                    for (int y1 = 0; y1 < amount; y1++) {
                        int px = x + x1;
                        int py = y + y1;

                        if (px < getWidth() && py < getHeight()) {
                            getBackground().setColorAt(px, py, color);
                        }
                    }
                }
            }
        }
    }

    public void detectEdges() {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                //get the color at the x y positions
                Color oldColor = getBackground().getColorAt(x,y);
                int x2 = x+1;
                // get the color next to the x y position
                Color colorNextToColor = null;
                if(x2 >= getWidth()){
                    colorNextToColor = getBackground().getColorAt(x, y);
                }else {
                    colorNextToColor = getBackground().getColorAt(x2, y);   
                }

                // Get the old rgb's
                // int oldColorRed = oldColor.getRed();
                // int oldColorGreen = oldColor.getGreen();
                // int oldColorBlue = oldColor.getBlue();
                // get the new rgb's
                // int newColorRed = colorNextToColor.getRed();
                // int newColorGreen = colorNextToColor.getGreen();
                // int newColorBlue = colorNextToColor.getBlue();

                // Add up to find average.
                int newColorAvg = (colorNextToColor.getRed() + colorNextToColor.getBlue() + colorNextToColor.getGreen())/3;
                int oldColorAvg = (oldColor.getRed() + oldColor.getGreen() + oldColor.getBlue())/3;

                // Check if it is close to the color avg
                if(oldColorAvg == newColorAvg) {
                    // then turn white
                    getBackground().setColorAt(x,y, Color.WHITE);
                }else {
                    // not close to the color
                    // else turn black
                    getBackground().setColorAt(x,y, Color.BLACK);
                }

            }

        }
    }

    public void shrink() {
        for (int x = 1, px =0; x < getWidth(); x+=2, px++) {
            for (int y = 1, py = 0; y < getHeight()-1; y+=2, py++) {
                // Go through the pixels
                // Need to take out some pixels and not use all of them so lets take out every 2 pixels.
                Color newColor = getBackground().getColorAt(x,y);
                getBackground().setColorAt(px,py, newColor);
            }
        }
    }

    public void shrinkWhite() {
        int newWidth = getWidth()/2;
        int newHeight = getHeight()/2;
        shrink();
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y <= getHeight()-1; y++) {
                if(x >= newWidth || y >= newHeight){
                    getBackground().setColorAt(x,y, Color.WHITE);
                }
            }
        }
    }
}
