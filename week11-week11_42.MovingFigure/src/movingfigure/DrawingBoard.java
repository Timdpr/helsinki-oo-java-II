/*
 * @author Timdpr
 */
package movingfigure;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {
    private Figure obj;
    
    public DrawingBoard(Figure obj) {
        this.obj = obj;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.obj.draw(g);
    }
}