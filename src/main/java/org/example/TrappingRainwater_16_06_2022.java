package org.example;
/*Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it is able to trap after raining.
Input - {0,1,0,2,1,0,1,3,2,1,2,1}
output - 6
Time complexity = O(n)
Space complexity = O(1)*/
public class TrappingRainwater_16_06_2022 {
    static int trapped(int[] height){
        //two pointers at each end
        int left=0,right=height.length-1;
        //variable to store max bar height on left and right.
        int left_max=0,right_max=0;
        int ans=0;
        while(left<right){
            //traversing from left if height of left bar is smaller than right bar.
            if(height[left]<height[right]){
                //if height of current bar is greater than the left_max then change the left_max
                if(left_max<=height[left]){
                    left_max=height[left];
                }else{
                //if height of current bar is less than the left_max add to ans left_max-height[left]
                    ans += left_max-height[left];
                }
                left++;//increment the left pointer

                //traversing from right if height of right bar is smaller than left bar.
            }else{
                if(right_max<=height[right]){
                    //if height of current bar is greater than the right_max then change the right_max
                    right_max = height[right];
                }else{
                    //if height of current bar is less than the right_max add to ans right_max-height[right]
                    ans += right_max-height[right];
                }
                right--;//decrement the left pointer
            }
        }
        return ans;
    }
}
/* 
    Aravind's Review : Well optimized code man.
*/

// Brute force(O(n))
/*int left_max=0,right_max=0,ans=0;
        for(int i=1;i<height.length-1;i++){
            int j=i;
            left_max = height[i];
            while(j>=0){
                left_max = Math.max(left_max,height[j]);
                j--;
            }
            j=i;
            right_max = height[i];
            while(j<height.length){
                right_max = Math.max(right_max,height[j]);
                j++;
            }
            ans += Math.min(left_max,right_max)-height[i];
        }
        return ans;*/
