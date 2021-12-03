package com.daniel.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2021/12/3 16:40
 * @description 岛屿的最大面积
 * @className MaxAreaOfIsland.java
 * @motto Talk is cheap. Show me the code.
 */
public class MaxAreaOfIsland {

    /**
     * https://leetcode-cn.com/problems/max-area-of-island/
     *
     * @param grid
     *
     * @return
     */

    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    private static int dfs(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != 1) {
            return 0;
        }
        grid[x][y] = 0;
        int ans = 1;
        ans += dfs(grid, x - 1, y);
        ans += dfs(grid, x + 1, y);
        ans += dfs(grid, x, y - 1);
        ans += dfs(grid, x, y + 1);
        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int i = maxAreaOfIsland(grid);
        System.out.println(i);
    }

}
