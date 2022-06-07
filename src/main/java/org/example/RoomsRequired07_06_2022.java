package org.example;
//Given an array of intervals (start,end) for classroom letures
//(possibly overlaaping), find the minimum number of rooms required.
//example: input- [[30,75],[0,50],[60,150]]   output- 2
public class RoomsRequired07_06_2022 {

    static int findMinimumRoomsRequired(int[][] timings, int n){
        //sorting according to ascending start time
        for(int i=0;i<n-1;i++){
            if(timings[i][0]>timings[i+1][0]){
                int[] swap = timings[i];
                timings[i] = timings[i+1];
                timings[i+1] = swap;
            }
        }
        // to find the minimum number of rooms
        int roomsRquired = 1;
        for(int start=1; start<n; start++){
            roomsRquired++;
            for(int end=0; end<start; end++){
                if(timings[start][0]>=timings[end][1]){
                    roomsRquired--;
                }
            }
        }
        return roomsRquired;
//        System.out.println(Arrays.deepToString(timings));
    }
}
