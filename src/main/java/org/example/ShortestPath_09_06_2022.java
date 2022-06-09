package org.example;
/**/
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
