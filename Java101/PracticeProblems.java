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

        static String reverseArray() {
            int[] arr = {1,2,3,4,5};
            String reverse = "(";
            for (int i=4;i>-1;--i) {
                reverse += arr [i] + ",";
            }
            return reverse + ")";
        }
    
      //  static int sumGrid (int sum) {
          //  int[][] arr = {{1}, {2}};


       // }
        //Write a function called sumGrid that takes a 2d double array grid and returns the sum of all the 
        // elements. Hint: you can do this with nested for loops (look up what that is).

        static int fib (int n) {
            return n = n - 1 + n - 2;
        }

        //Write a function called fib that takes an integer n and returns the nth number in the
        // fibonacci sequence (starting with 0)
 

    }
