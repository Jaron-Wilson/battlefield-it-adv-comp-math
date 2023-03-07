import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bonusWorld here.
 * 
 * @author Jaron Wilson
 * @version 2/24/23
 */
public class BonusWorld extends World
{

    /**
    1.  pixelate() 
    Write a method that will pixelate an image to make it look more like it belongs on an old 
    Nintendo system.  To accomplish this, you will need to pause on a single pixel and change all 
    surrounding pixels to the same color as the current pixel.  Let's define a surrounding pixel to 
    be any pixel within 5 x/y of the current one in a box. 

    So, create your standard two loops to go from one pixel to another.  However, x++ and y++ will 
    not be good enough, you will need to skip farther (by 10).  At each (x, y) coordinate, now write 
    another set of nested loops that go from (x-5 to x+5) and (y-5 to y+5).  Change each of these 
    pixels to the same color as the original (x, y). 

    Tip!  You will need to write an if statement to check if the pixel you are looking at is even on the 
    screen.  For instance, if your current (x,y) is at (95, 10) and your screen has a width of 100, 
    then (96, 10) is fine, (97, 10) is fine, (98, 10) is fine, (99, 10) is fine, but x+5 at (100, 10) would 
    crash when you try to change its color.  

    2.  pixelate( int amount ) 
    This version of pixelate is the same as above, but instead of always 
    pixelating by 5, the amount to pixelate by comes in as a parameter. 

    3.  detectEdges() 
    Compares pixels directly next to each other, then determines if the colors are too far different.  
    If so, the pixels turn black.  If they are similar, they turn white.   

    Tip!  To compare colors, use the distance formula on the colors. 

    4.  shrink() 
    Makes a copy of the background, but much smaller, in one of the corners of the screen. 
     */
    public BonusWorld() {    
        super(702, 461, 1); 
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
        for (int x = amount; x <= getWidth()-1; x+=(amount*2)) {
            for (int y = amount; y <= getHeight()-1; y+=(amount*2)) {
                Color color = getColorAt(x,y);

                for (int x1 = -amount; x1 <= amount; x1++) {
                    for (int y1 = -amount; y1 <= amount; y1++) {
                        if(x+x1 >= 0 && x+x1 <= getWidth()-1 && y+y1 >= 0 && y+y1 <= getHeight()-1){
                            // if((x+x1) %2 == 0 ) {
                            //     // EVEN
                            if(x+(amount*2) >= getWidth()){
                                getBackground().setColorAt(x, y, color);
                            }
                            else{
                            getBackground().setColorAt(x+x1, y+y1, color);
                            }
                            // }else {
                            // getBackground().setColorAt(x+x1, y+y1, color);
                            // }

                        }
                    }
                }
        // Get remaining of screen and pixelate that.
                // if(x+(amount*2) > getWidth()){
                    // int remainingWidth = (getWidth()-1) - x;
                    // int remainingHeight = (getHeight()-1) - y;
                    // for (int x1 = -remainingWidth; x1 <= remainingWidth; x1++) {
                        // for (int y1 = -remainingHeight; y1 <= remainingHeight; y1++) {
                            // if(x+x1 >= 0 && x+x1 <= getWidth()-1 && y+y1 >= 0 && y+y1 <= getHeight()-1){
                                    // EVEN
                                // getBackground().setColorAt(x1+x,y+y1, color);
// 
                            // }
                        // }
                    // }
                // }
            }

        }
    }

    ///**
    public void mirrorLeftToRight() {
    for (int x = 0; x < getWidth() / 2; x++) {
    for (int y = 0; y < getHeight(); y++) {
    Color oldColor = getBackground().getColorAt(x, y);
    int newLoc = (getWidth() - 1) - x;
    getBackground().setColorAt(newLoc, y, oldColor);
    }
    }
    }
    //*/

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
