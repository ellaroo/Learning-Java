package Java101;
public class PracticeProblems {
   
        static int countOccurances (int n) {
            int[] arr = {11,22,33,44,111,222,333,444};
            int add = 0;
            for (int e: arr) {
                if (e == n) {
                    add += 1;
            }
            }
            return add;
        }
    }

// set sum tto 0, then check each arr[thing] and add 1 to sum if thing = n