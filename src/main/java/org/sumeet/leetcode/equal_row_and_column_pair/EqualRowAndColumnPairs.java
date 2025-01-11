package org.sumeet.leetcode.equal_row_and_column_pair;

import java.util.*;

public class EqualRowAndColumnPairs {

    public static void main(String[] args) {

        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        EqualRowAndColumnPairs equalRowAndColumnPairs = new EqualRowAndColumnPairs();
        System.out.println(equalRowAndColumnPairs.equalPairs(grid));

    }

    public int equalPairs(int[][] grid) {

        int length = grid.length;
        int count =  0;
        List<List<Integer>> rowList = new ArrayList<>();
        List<List<Integer>> columnList = new ArrayList<>();
        for(int i=0; i< length; i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> column = new ArrayList<>();
            for(int j=0; j<length; j++){
                row.add(grid[i][j]);
                column.add(grid[j][i]);
            }
            rowList.add(row);
            columnList.add(column);
        }

        for (List<Integer> r : rowList) {
            for (List<Integer> c : columnList) {
                if(r.equals(c)){
                   count++;
                }
            }
        }

        return count;
    }

}
