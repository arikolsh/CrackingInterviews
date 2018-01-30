package problemsolving.crackingTheCode;

import org.junit.Test;

/*
Imagine a robot sitting on the upper left hand corner of an NxN grid The robot can
only move in two directions: right and down How many possible paths are there for
the robot?
FOLLOW UP
Imagine certain squares are “off limits”, such that the robot can not step on them
Design an algorithm to get all possible paths for the robot
*/
public class RobotNumPaths {

    public int solve(int[][] mat, int i, int j) {
        if (i >= mat.length - 1 || j >= mat[0].length - 1) return 1;
        return solve(mat, i + 1, j) + solve(mat, i, j + 1);
    }

    @Test
    public void t() {
        int[][] mat = {{1, 2}, {3, 4}};
        System.out.println(solve(mat, 0, 0));
    }
}
