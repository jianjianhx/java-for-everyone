package ch13;

import java.util.Arrays;

public class NQueenSolution implements PartialSolution {
    private final Queen[] queens;
    private final int nQueens;

    /**
     * Constructs a solution of queens of a given size
     * @param size the size
     */
    public NQueenSolution(int size, int n) {
        queens = new Queen[size];
        nQueens = n;
    }

    @Override
    public int examine() {
        for (int i = 0; i < queens.length; i++) {
            for (int j = i + 1; j < queens.length; j++) {
                if (queens[i].attacks(queens[j])) { return ABANDON; }
            }
        }
        if (queens.length == nQueens) { return ACCEPT; }
        else { return CONTINUE; }
    }

    @Override
    public PartialSolution[] extend() {
        NQueenSolution[] result = new NQueenSolution[nQueens];
        for (int i = 0; i < result.length; i++) {
            int size = queens.length;

            // The new solution has one more row than this one
            result[i] = new NQueenSolution(size + 1, nQueens);

            // Copy this solution into the new one
            System.arraycopy(queens, 0, result[i].queens, 0, size);

            // Append the new queen into the ith column
            result[i].queens[size] = new Queen(size, i);
        }
        return result;
    }

    @Override
    public String toString() { return Arrays.toString(queens); }
}

/**
 * A queen in the eight queens problem.
 */
class Queen {
    private final int row;
    private final int column;

    /**
     * Constructs a queen at a given position
     * @param row the row
     * @param column the column
     */
    public Queen(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * Checks whether this queen attacks another.
     * @param other the other queen
     * @return true if this and the other queen are in the same row, column, or diagonal
     */
    public boolean attacks(Queen other) {
        return row == other.row
                || column == other.column
                || Math.abs(row - other.row) == Math.abs(column - other.column);
    }

    @Override
    public String toString() { return "" + "abcdefgh".charAt(column) + (row + 1); }
}