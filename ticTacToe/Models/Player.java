package ticTacToe.Models;

public class Player {
    Piece piece;
    String name;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public String getName(){
        return name;
    }
}
