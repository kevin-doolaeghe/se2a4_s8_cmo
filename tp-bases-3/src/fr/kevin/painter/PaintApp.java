package fr.kevin.painter;

import fr.kevin.shape.*;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class PaintApp extends Frame {

    private Painter painter;

    public PaintApp(ArrayList<GeometricShape> shapes) {
        painter = new Painter(shapes);
        this.add(painter);
        this.setTitle("PaintApp");
        this.setSize(600, 600);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dispose();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        painter.paint(g);
    }

}
