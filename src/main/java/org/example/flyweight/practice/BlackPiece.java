package org.example.flyweight.practice;

import java.awt.*;

public class BlackPiece implements ChessPiece {

    @Override
    public void downPieces(Graphics g, Point p) {
        g.setColor(Color.BLACK);
        g.fillOval(p.x, p.y, 30, 30);
    }

}
