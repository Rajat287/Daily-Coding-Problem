package org.example;
//Given an array of integers, retuen a new array such that each element at
//index i of the new array is the product of all the numbers in the
//original array except the one at i.
//example: input- [1,2,3,4,5]   output- [120,60,40,30,24]

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.util.Arrays;
public class ProductExceptItself {
    private static final Logger logger = LogManager.getLogger(ProductExceptItself.class);
    long[] product(){
        int[] a = {1,2,3,4,5};
        long[] prod = new long[a.length];
        long l=1;
        int f=0;
        for(int i=0;i<a.length;i++){
            if (a[i]==0){
                f += 1;
            }else{
                l *= a[i];
            }
            prod[i] = 1;
        }
        for(int j=0;j<a.length;j++){
            if(f>=2){
                prod[j] = 0;
            }else if(f==1){
                if(a[j]==0){
                    prod[j] = l;
                }else{
                    prod[j] = 0;
                }
            }else{
                prod[j] = l/a[j];
            }
        }
        return prod;
    }
    public static void main(String[] args){
        BasicConfigurator.configure();
        ProductExceptItself ob = new ProductExceptItself();
        long[] arr = ob.product();
        logger.debug(Arrays.toString(arr));

    }
}
