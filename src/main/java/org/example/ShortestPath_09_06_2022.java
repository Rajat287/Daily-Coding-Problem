package org.example;
/*You are given an M by N matrix consisting of booleans that represents a board.
Each True boolean represents a wall. Each False boolean represents a tile you can walk on.
Given this matrix, a start coordinate, and an end coordinate,
return the minimum number of steps required to reach the end coordinate from the start.
If there is no possible path, then return null. You can move up, left, down, and right.
You cannot move through walls. You cannot wrap around the edges of the board.
For example, given the following board:

[[f, f, f, f],
[t, t, f, t],
[f, f, f, f],
[f, f, f, f]]
and start = (3, 0) (bottom left) and end = (0, 0) (top left),
the minimum number of steps required to reach the end is 7, since we would need to go through (1, 2) because there is a wall everywhere else on the second row.*/
public class ShortestPath_09_06_2022 {
    boolean isSafe(char[][] mat, boolean[][] visited, int x, int y){
        return (x>=0&&x<mat.length&&y>=0&&y<mat[0].length&&!visited[x][y]&&mat[x][y]=='f');
    }
    int findShortestPath(char[][] mat, boolean[][] visited, int x, int y, int i, int j, int min_dist, int dist){
        if(i==x&&j==y){
            return Integer.min(min_dist,dist);
        }
        visited[i][j] = true;
        if(isSafe(mat,visited,i+1,j)){
            min_dist = findShortestPath(mat,visited,x,y,i+1,j,min_dist,dist+1);
        }
        if(isSafe(mat,visited,i,j+1)){
            min_dist = findShortestPath(mat,visited,x,y,i,j+1,min_dist,dist+1);
        }
        if(isSafe(mat,visited,i-1,j)){
            min_dist =  findShortestPath(mat,visited,x,y,i-1,j,min_dist,dist+1);
        }
        if(isSafe(mat,visited,i,j-1)){
            min_dist =  findShortestPath(mat,visited,x,y,i,j-1,min_dist,dist+1);
        }
        visited[i][j] = false;
        return min_dist;
    }
    int findShortestpathLength(char[][] mat,int x,int y, int i,int j){
        if(mat==null||mat[x][y]=='t'||mat[i][j]=='t'||mat.length==0){
            return -1;
        }
        int M = mat.length;
        int N = mat[0].length;
        boolean[][] visited = new boolean[M][N];
        int min_dist = findShortestPath(mat,visited,x,y,i,j, Integer.MAX_VALUE,0);
        if(min_dist != Integer.MAX_VALUE){
            return min_dist;
        }
        return -1;
    }

}
