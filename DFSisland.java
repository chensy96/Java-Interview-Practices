package review;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DFSisland {
    public static int currentsize = 0;
    
    public static int search(int[][] grid){
        int largest = 0;
        boolean[][] visited = new boolean [grid.length][grid[0].length];
    
        for(int i=0; i < grid.length; i++){
            for(int j=0; j < grid[0].length; j++){
                if(grid[i][j]==1 && visited[i][j] == false){
                    //we find a filled, but is it the head? 
                    // int currentsize =0;
                    BFS(grid, visited, i, j);
                    if(currentsize >= largest){
                        largest = currentsize; 
                    }
                    currentsize = 0;
                }
            }
        }
        return largest;
    }
    
    public static void BFS(int[][]grid, boolean[][] visited, int x, int y){
        // int size =0;
        int[] row = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] col = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        visited[x][y] = true;
        // size++;
        currentsize++;
        
        for(int i=0; i < 8; i++){
                int adjx = x + row[i];
                int adjy = y + col[i];
            if ( adjx >= 0 && adjx < grid.length && adjy >= 0 && adjy < grid[0].length){
                if(grid[adjx][adjy] == 1 && visited[adjx][adjy] == false){
                    BFS(grid, visited, adjx, adjy);
                }
            }
            }

    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
            //the grid is already in the matrix
            //no need to creat a graph class
            
          
        }
        System.out.print(search(grid));
    }
}
