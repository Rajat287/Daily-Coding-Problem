package org.example;

public class ArrangeRGB_21_06_2022 {
    static char[] isSorted(char[] arr){
        // I have used three pointers low at 0 index, high at len(arr)-1 index
        // and itr to loop every index
        int low=0,itr=0,high=arr.length-1;
        //looping through all the elements.
        while(itr<=high){
            //if we found R element we will swap it to the start of array(i.e. to the low index)
            if(arr[itr]=='R'){
                char temp = arr[low];
                arr[low] = arr[itr];
                arr[itr] = temp;
                itr++;
                low++;
            }
            //if we found G element we will increment the itr by one.
            else if (arr[itr] == 'G') {
                itr++;
            }
            //if we found B element we will swap it to the end of array(i.e. to the high index)
            else{
                char temp = arr[high];
                arr[high] = arr[itr];
                arr[itr] = temp;
                itr++;
                high--;
            }
        }
        return arr;//return the array.
    }
}
