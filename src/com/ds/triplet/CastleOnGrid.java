package com.ds.triplet;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CastleOnGrid {

    static int minimumMoves(String[] grid, int startX, int startY, int goalX, int goalY) {
        // Complete this function
        int n=grid.length;
        char[][] arr=new char[n][n];
        int i=0;
        for(String s:grid)
        {
            char[] c=s.toCharArray();
            for(int j=0;j<n;j++)
            {
               arr[i][j]=c[j];
            }
            i++;
        }
       
        System.out.println(arr.toString());
        return 0;
        		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i = 0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        int startX = in.nextInt();
        int startY = in.nextInt();
        int goalX = in.nextInt();
        int goalY = in.nextInt();
        int result = minimumMoves(grid, startX, startY, goalX, goalY);
        in.close();
    }
}

