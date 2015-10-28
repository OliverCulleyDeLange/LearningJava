package uk.co.oliverdelange.applets;

import java.applet.Applet;
import java.awt.*;
// A horribly simple applet that simply draws some coloured lines on a black background...
public class Drawing extends Applet {
    int width, height;
    
    @Override
    public void init() {
        width = getSize().width;
        height = getSize().height;
        setBackground (Color.black);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.green);
        for ( int i = 0; i < 10; ++i) {
            g.drawLine(width,height, i * width / 10, 0);
        }
        g.setColor(Color.blue);
        for (int i = 0; i < 10; ++i) {
            g.drawLine(0,height,i*width/10,0);
        }
    }
}
