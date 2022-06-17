package org.example;

public class EditDistance_17_06_2022 {
    static int minimumDistance(String word1, String word2){
        int[][] cost = new int[word1.length()+1][word2.length()+1];
        //initializing the 2D array with base condition if word2 is empty.
        for(int i=0;i<=word1.length();i++){
            cost[i][word2.length()] = word1.length()-i;
        }
        // if word1 is empty
        for(int i=0;i<=word2.length();i++){
            cost[word1.length()][i] = word2.length()-i;
        }
        //filling the rest indexes of 2d array using bottom up approach.
        for(int i=word1.length()-1;i>-1;i--){
            for(int j=word2.length()-1;j>-1;j--){
                //if char at index i and j matches then we increment the i to i+1 and j to j+1
                //so the value depends on the next diagonal index(no. of operation required to change
                // word1 to word2).
                if(word1.charAt(i)==word2.charAt(j)){
                    cost[i][j] = cost[i+1][j+1];
                }else{
                    //minimum of the three operation(insert,delete,replace) is taken
                    cost[i][j] = 1+Math.min(cost[i+1][j],Math.min(cost[i][j+1],cost[i+1][j+1]));
                }
            }
        }

        return cost[0][0];
    }
}
