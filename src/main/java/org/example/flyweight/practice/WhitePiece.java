package org.example.flyweight.practice;

import java.awt.*;

public class WhitePiece implements ChessPiece {

    @Override
    public void downPieces(Graphics g, Point p) {
        g.setColor(Color.WHITE);
        g.fillOval(p.x, p.y, 30, 30);
    }

}
