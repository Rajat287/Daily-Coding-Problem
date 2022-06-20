package org.example;

public class Minimum_Insert_20_06_2022 {


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
}

       







