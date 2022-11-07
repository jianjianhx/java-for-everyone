package ch13;

public interface PartialSolution {
    int ACCEPT = 1;
    int ABANDON = 2;
    int CONTINUE = 3;

    /**
     * Examine a partial solution
     * @return one of ACCEPT, ABANDON, CONTINUE
     */
    int examine();

    /**
     * Yields all extensions of this partial solution
     * @return an array of partial solutions that extend this solution.
     */
    PartialSolution[] extend();
}
