package ticTacToe.Models;

public class Board {
    private Piece[][] board;
    private int size;
    private int pieces;

    public Board(int size) {
        this.size = size;
        this.board = new Piece[size][size];
        this.pieces = 0;
    }

    public boolean isFull() {
        return pieces == size * size;
    }

    public boolean isValidCordinate(int x,int y){
        return x >= 0 && x < size && y >= 0 && y < size;
    }

    public boolean isPieceAt(int x, int y) {
        return board[x][y] != null;
    }

    public void addPiece(Piece piece, int x, int y) {
        board[x][y] = piece;
        pieces++;
    }

    public Piece getPieceAt(int x, int y) {
        return board[x][y];
    }

    public int getSize() {
        return size;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(board[i][j].pieceType);
                }
                if (j < size - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("-");
                    if (j < size - 1) {
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
        }
    }

    public boolean isWinner(Piece piece) {
        for (int i = 0; i < size; i++) {
            boolean rowWin = true;
            boolean colWin = true;
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null || board[i][j].pieceType != piece.pieceType) {
                    rowWin = false;
                }
                if (board[j][i] == null || board[j][i].pieceType != piece.pieceType) {
                    colWin = false;
                }
            }
            if (rowWin || colWin) {
                return true;
            }
        }

        boolean diag1Win = true;
        boolean diag2Win = true;
        for (int i = 0; i < size; i++) {
            if (board[i][i] == null || board[i][i].pieceType != piece.pieceType) {
                diag1Win = false;
            }
            if (board[i][size - i - 1] == null || board[i][size - i - 1].pieceType != piece.pieceType) {
                diag2Win = false;
            }
        }
        return diag1Win || diag2Win;
    }
}
