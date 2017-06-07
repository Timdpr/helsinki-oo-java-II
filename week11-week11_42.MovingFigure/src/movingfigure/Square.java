/*
 * @author Timdpr
 */
package movingfigure;

import java.awt.Graphics;

public class Square extends Figure {
    private int length;
    
    public Square(int x, int y, int sideLength) {
        super(x,y);
        this.length = sideLength;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(this.getX(), this.getY(), length, length);
    }  
}
