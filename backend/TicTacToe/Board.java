/**
 * The class for a dynamic tic tac toe board. The size of the board is n*n.
 * Constructor is used to initialize the board with the given size.
 * @author Jack 
 * @version v0.0.1
 */

public class Board 
{
    //The enum for the state of the board, either an x or an o.
    private enum state
    {
        x,o
    };
    //The 2D array to represent the board.
    private state[][] board;

    //The constructor for the board, initialises the board with size n.
    public Board(int n)
    {
        board = new state[n][n];
    }
    
    //The method to place a new state on the board at the given row and column.
    public void place(int r, int c, state s)
    {
        if(r > -1 && r < board.length && c > -1 && c < board.length)
        {
            if(board[r][c] == null)
            {
                board[r][c] = s;
            }
            else
            {
                throw new IllegalArgumentException("Occupied position.");
            }
        }
        else
        {
            throw new IllegalArgumentException("Row or column is out of bounds.");
        }
    }

    //Clears the board by setting every position to null.
    public void clear()
    {
        for(int r = 0; r < board.length; r++)
        {
            for(int c = 0; c < board.length; c++)
            {
                board[r][c] = null;
            }
        }
    }
}
