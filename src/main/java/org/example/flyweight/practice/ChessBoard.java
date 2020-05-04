package org.example.flyweight.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChessBoard extends MouseAdapter {

    PieceFactory pf;
    JFrame f;
    Graphics g;
    JRadioButton wb;
    JRadioButton bb;
    private final int x = 50;
    private final int y = 50;
    private final int w = 40;
    private final int rw = 400;

    public ChessBoard() {
        pf = new PieceFactory();
        f = new JFrame("享元模式在五子棋游戏中的应用");
        f.setBounds(50, 50, 500, 550);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel southJP = new JPanel();
        f.add("South", southJP);
        wb = new JRadioButton("白子");
        bb = new JRadioButton("黑子", true);
        ButtonGroup group = new ButtonGroup();
        group.add(wb);
        group.add(bb);
        southJP.add(wb);
        southJP.add(bb);
        JPanel centerJP = new JPanel();
        centerJP.setLayout(null);
        centerJP.setSize(500, 500);
        centerJP.addMouseListener(this);
        f.add("Center", centerJP);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        g = centerJP.getGraphics();
        g.setColor(Color.BLUE);
        g.drawRect(x, y, rw, rw);
        for (int i = 0; i < 10; i++) {
            //绘制第i条竖直线
            g.drawLine(x + (i * w), y, x + (i * w), y + rw);
            //绘制第i条水平线
            g.drawLine(x, y + (i * w), x + rw, y + (i * w));
        }
    }

    public void mouseClicked(MouseEvent e) {
        Point p = new Point(e.getX() - 15, e.getY() - 15);
        if (wb.isSelected()) {
            ChessPiece c1 = pf.getChessPiece("w");
            c1.downPieces(g, p);
        } else {
            ChessPiece c2 = pf.getChessPiece("b");
            c2.downPieces(g, p);
        }
    }

}
