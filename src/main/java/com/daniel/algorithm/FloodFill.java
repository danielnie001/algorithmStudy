package com.daniel.algorithm;

/**
 * @author Administrator
 * @date 2021/12/3 11:26
 * @description 图像渲染
 * @className FloodFill.java
 * @motto Talk is cheap. Show me the code.
 */
public class FloodFill {

    /**
     * 有一幅以二维整数数组表示的图画，每一个整数表示该图画的像素值大小，数值在 0 到 65535 之间。
     * 给你一个坐标(sr, sc)表示图像渲染开始的像素值（行 ，列）和一个新的颜色值newColor，让你重新上色这幅图像。
     * 为了完成上色工作，从初始坐标开始，记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，
     * 接着再记录这四个方向上符合条件的像素点与他们对应四个方向上像素值与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为新的颜色值。
     * 最后返回经过上色渲染后的图像。
     *
     * https://leetcode-cn.com/problems/flood-fill/
     *
     * 深度优先遍历(dfs)
     */

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if(newColor != oldColor){
            dfs(image,sr,sc,newColor,oldColor);
        }
        return image;
    }

    private static void dfs(int[][] image, int x, int y, int newColor, int oldColor) {
        if(x>=image.length || x <0 || y >= image[0].length || y<0){
            return;
        }
        if(image[x][y] != oldColor || image[x][y] == newColor){
            return;
        }
        dfs(image,x-1,y,newColor,oldColor);
        dfs(image,x+1,y,newColor,oldColor);
        dfs(image,x,y-1,newColor,oldColor);
        dfs(image,x,y+1,newColor,oldColor);
        image[x][y] = newColor;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] ints = floodFill(image, sr, sc, newColor);
    }
}
