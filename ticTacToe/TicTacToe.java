package ticTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import ticTacToe.Models.Board;
import ticTacToe.Models.OPiece;
import ticTacToe.Models.Player;
import ticTacToe.Models.XPiece;

public class TicTacToe {
    public Board board;
    Deque<Player> players;

    public TicTacToe(){
        initGame();
    }

    private void initGame() {
        board = new Board(3);
        players = new LinkedList<>();
        XPiece xPiece = new XPiece();
        Player player1 = new Player("Player 1", xPiece);

        OPiece oPiece = new OPiece();
        Player player2 = new Player("Player 2", oPiece);

        players.add(player1);
        players.add(player2);
    }

    public void startGame(){
        boolean winner = false;

        while (!board.isFull() && !winner) {

            board.printBoard();

            Player currPlayer = players.removeFirst();
            System.out.println(currPlayer.getName() + "'s turn");
            System.out.println("Enter row: ");
            Scanner inputScanner = new Scanner(System.in);
            int row = inputScanner.nextInt();
            System.out.println("Enter column: ");
            int col = inputScanner.nextInt();
            if (board.isPieceAt(row, col) || !board.isValidCordinate(row, col)) {
                System.out.println("Invalid move, try again");
                players.addFirst(currPlayer);
                continue;
            }
            
            players.addLast(currPlayer);

            board.addPiece(currPlayer.getPiece(), row, col);
            winner = board.isWinner(currPlayer.getPiece());

            if(winner){
                board.printBoard();
                System.out.println(currPlayer.getName() + " wins!");
                inputScanner.close();
                break;
            }

            if(board.isFull()){
                board.printBoard();
                System.out.println("It's a draw!");
                inputScanner.close();
                break;
            }
            
        }

    }

}
