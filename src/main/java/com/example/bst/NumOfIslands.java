package com.example.bst;

public class NumOfIslands {

    public Integer numOfIslands(Character[][] grid){
        if(grid == null || grid.length == 0){
            return 0;
        }

        Integer numOfIslands = 0;
        Integer nr = grid.length;
        Integer nc = grid[0].length;
        for(Integer i = 0; i< nr;i++){
            for(Integer j = 0; j< nc;j++){
                if(grid[i][j] == '1'){
                    ++numOfIslands;
                    dfs(grid,i,j);
                }
            }
        }
        return  numOfIslands;
    }

    public void dfs(Character[][] grid, Integer r, Integer c){
        Integer nr = grid.length;
        Integer nc = grid[0].length;

        if(r<0 || c<0 || r>=nr || c>=nc || grid[r][c] == '0'){
            return;
        }

        grid[r][c] = 0;
        dfs(grid, r-1,c);
        dfs(grid, r+1,c);
        dfs(grid, r,c-1);
        dfs(grid, r,c+1);
    }

}
