/**
 * Minimum Weight Path In A Triangle
 * Given a 2D array that resembles the shape of a triangle, return the min-cost path from the top to the bottom.
 *
 * From each cell, you may only go diagonally down to the left or right.
 *
 * Example:
 * Input:
 * [
 *   [5],
 *   [1,6],
 *   [4,3,10],
 *   [3,2,4,1]
 * ]
 *
 * Output: 11
 * Explanation:
 * [
 *       [5],
 *     [1,  6],
 *    [4, 3, 10],
 *   [3, 2, 4, 1]
 * ]
 */
package SWE.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    public static void main(String areg[]){
        Triangle triangle = new Triangle();
        List<List<Integer>> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        y.add(2);
        List<Integer> a = new ArrayList<>(); a.add(3); a.add(4);
        List<Integer> b = new ArrayList<>(); b.add(6); b.add(5); b.add(7);
        List<Integer> c = new ArrayList<>(); c.add(4); c.add(1);c.add(8); c.add(3);
        x.add(y);x.add(a);x.add(b);x.add(c);

        System.out.println(triangle.minimumPathCost(x));
    }
    public int minimumPathCost(List<List<Integer>> triangle) {
        if(triangle.size()==0)
            return 0;
        int m = triangle.size();
        for(int i=m-2;i>=0;i--){
            List<Integer> nextRow = triangle.get(i+1);
            for(int j=0;j<=i;j++){
                int sum=triangle.get(i).get(j) + Math.min(nextRow.get(j),nextRow.get(j+1));
                triangle.get(i).set(j,sum);
            }
        }
        return triangle.get(0).get(0);
    }
}
