/**
 *

Number of Ways To Traverse A Matrix
        Given an integer value m (rows of a matrix), and an interger value n (columns of a matrix), return the total possible unique, simple, paths from the top-left of the matrix to the bottom-right with restricted moves.

        You may only make one of these moves at each position:
        Down 1 cell
        Right 1 cell

        Example:
        Input: m = 3, n = 3
        Output: 6
        Explanation:
        s -> "start"
        e -> "end"
        -----------
        | s | _ | _ |
        | _ | _ | _ |
        | _ | _ | e |
        -----------

        Total unique paths to any given cell:
        -----------
        | 1 | 1 | 1 |
        | 1 | 2 | 3 |
        | 1 | 3 | 6 |
        -----------

 */
package SWE.dynamicprogramming;

import java.util.Arrays;

public class NumberWaysTraverseMatrix {
    public static void main(String areg[]){
        NumberWaysTraverseMatrix matrix = new NumberWaysTraverseMatrix();
        System.out.println(matrix.uniquePaths(3,3));
    }

    public int uniquePaths(int rows, int cols) {
        if (rows==0)
            return 0;
        int [][] dp= new int[rows][cols];
        //Arrays.fill(dp,1);

        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || j==0)
                    dp[i][j]= 1;
                else {
                    // uprow value and right side same row value
                    dp[i][j]= ( dp[i][j-1]+dp[i-1][j]);
                }
            }
        }

        return dp[rows-1][cols-1];

    }
}
