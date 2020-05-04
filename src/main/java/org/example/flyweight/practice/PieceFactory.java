package org.example.flyweight.practice;

import java.util.ArrayList;
import java.util.List;

public class PieceFactory {

    private List<ChessPiece> pieceList;

    public PieceFactory() {
        pieceList = new ArrayList<>();
        pieceList.add(new WhitePiece());
        pieceList.add(new BlackPiece());
    }

    public ChessPiece getChessPiece(String type) {
        if ("w".equalsIgnoreCase(type)) {
            return pieceList.get(0);
        } else if ("b".equalsIgnoreCase(type)) {
            return pieceList.get(1);
        } else {
            return null;
        }
    }

}
