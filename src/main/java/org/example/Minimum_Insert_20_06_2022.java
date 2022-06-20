package org.example;

public class Minimum_Insert_20_06_2022 {
//    static int minimumInsertion(String word){
//        int left=0, right = word.length()-1,count =0;
//        while(left<right){
//            if(word.length()==0||word.length()==1){
//                return 0;
//            }
//            if(word.charAt(left)==word.charAt(right)){
//                left++;
//                right--;
//            } else if (word.charAt(left)!=word.charAt(right)&&word.charAt(left)==word.charAt(right-1)) {
//                count += 1;
//                right--;
//            }else if (word.charAt(right)!=word.charAt(left)&&word.charAt(right)==word.charAt(left+1)){
//                count += 1;
//                left++;
//            }else{
//                if(word.length()%2==0&&left==right-1){
//                    count += 1;
//                }else {
//                    count += 2;
//                }
//
//                left++;
//                right--;
//            }
//
//        }
//        return count;

        static int findMinInsertions(char str[], int l,
        int h)
        {
            // Base Cases
            if (l > h) return Integer.MAX_VALUE;
            if (l == h) return 0;
            if (l == h - 1) return (str[l] == str[h])? 0 : 1;

            // Check if the first and last characters
            // are same. On the basis of the  comparison
            // result, decide which subproblem(s) to call
            return (str[l] == str[h])?
                    findMinInsertions(str, l + 1, h - 1):
                    (Integer.min(findMinInsertions(str, l, h - 1),
                            findMinInsertions(str, l + 1, h)) + 1);
        }

        // Driver program to test above functions
        public static void main(String args[])
        {
            String str= "ccewnxhytsr";
            System.out.println(findMinInsertions(str.toCharArray(),0, str.length()-1));
        }
    }









//    static int minimumInsertions(char str[], int n){
//        int[][] table = new int[n][n];
//        int l,h,gap;
//        for(gap=1,gap<n,++gap){
//            for(l=0,h=gap;h<n;++l,++h){
//                if(str[l]==str[h]){
//                    table[l][h] = table[l+1][h-1];
//                }else{
//                    table[l][h] = Integer.min(table[l+1][h]+1,table[l][h-1]);
//                }
//            }
//        }
//        return table[0][n-1];
//    }

//    public static void main(String[] args) {
//        String given = "ccewnxhytsr";
//        System.out.println(minimumInsertion(given));
//    }
//}
