package org.example;
import java.util.ArrayList;
import java.util.List;
/*Write an algorithm to justify text. Given a sequence of words and an integer line length k,
return a list of strings which represents each line, fully justified.
More specifically, you should have as many words as possible in each line.
There should be at least one space between each word. Pad extra spaces when necessary
so that each line has exactly length k. Spaces should be distributed as equally as possible,
with the extra spaces, if any, distributed starting from the left.
If you can only fit one word on a line, then you should pad the right-hand side with spaces.
Each word is guaranteed not to be longer than k.
For example, given the list of words
["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"] and k = 16,
you should return the following:
["the quick brown", # 1 extra space on the left

` “fox jumps over”,` # 2 extra spaces distributed evenly

` “the lazy dog”]` # 4 extra spaces distributed evenly*/
public class Justified_Strings_14_06_2022 {
public List<String> fullJustify(String[] words, int maxWidth)
{
    List<String> result = new ArrayList<>();

    int n = words.length;

    int i = 0;
    while(i < n)
    {
        int j = i + 1; // Next Word of i
        int lineLength = words[i].length(); // get the first word length in that line

            /* total length of collected words + required spaces
              less than maxWidth */
        while(j < n && (lineLength + words[j].length() + (j-i-1)) < maxWidth)
        {
            lineLength += words[j].length(); // Increase the lineLegth if it met this condition
            j++;                             // Move to next word if it met this condition
        }

        int diff = maxWidth - lineLength;   // Total number of space required
        int numberOfWords = j - i;          // Total number of words

        if(numberOfWords == 1)    // if a line has single word do the left justification.
            result.add(leftJustify(words, diff, i, j));
        else
            result.add(middleJustify(words, diff, i, j)); // Otherwise middle justification

        i = j; // move the i pointer to next line begining
    }

    return result;  // return the result
}

    private String leftJustify(String[] words, int diff, int i, int j)
    {
        int spaceOnRight = diff - (j - i - 1);  // extra space = diff-each space required b/w 2 words
        StringBuilder s = new StringBuilder(words[i]); // Append first word

        for(int k = i+1; k < j; k++) // loop through remaining words
        {
            s.append(" " + words[k]); // append remaining words with single space
        }
        // add all remaining space to end of the line
        for(int m=0;m<spaceOnRight;m++){
            s.append(" ");
        }


        return s.toString(); // return the line
    }

    private String middleJustify(String[] words, int diff, int i, int j)
    {
        int spacesNeeded = j - i - 1;       // Indicate number space spots. (min number of spaces)
        int spaces = diff / spacesNeeded;   // Utilize remaining space equally
        int extraSpace = diff % spacesNeeded; //calculate the extra space after equally divided

        StringBuilder s = new StringBuilder(words[i]); // append first word
        for(int k = i + 1; k < j; k++)  // loop through remaining words
        {
            // calcualte space to apply including equally divided space + extra space
            int spacesToApply = spaces + (extraSpace-- > 0 ? 1 : 0);
            //append spaces
            for(int m=0;m<spacesToApply;m++){
                s.append(" ");
            }
            s.append(words[k]); // add next word.
        }

        return s.toString();
    }

    public static void main(String[] args) {
        String[] given = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        int k = 16;
        Justified_Strings_14_06_2022 p1 = new Justified_Strings_14_06_2022();
        System.out.println(p1.fullJustify(given,k).toString());
    }
}
