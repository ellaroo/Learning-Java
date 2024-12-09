package Java101;
public class Main {
    static int[] test = {10, 20, 30, 40, 50};
    public static String printIntArray(int[] arr) {
        String str = "(";
        for (int i = 0; i < test.length; i++) {
            str += test[i];
            if (i != test.length - 1) {
                str += ", ";
            }
        }
        return str + ")";
    }
    
        static double f(double x) {
            return 2 * x;
        }

        static String intArrToString(int[] arr) {
            String str = "(";
            for (int i = 0; i < arr.length; i++) {
                str += arr[i];
                if (i != arr.length - 1) {
                    str += ", ";
                }
            }
            return str + ")";
        }

        public static String boardToString(int[][] board) {
            String str = "";
            for (int i = 0; i < board.length; i++) {
                str += intArrToString(board[i]);
                if (i != board.length - 1) {
                    str += "\n";
                }
            }
            return str;
        }




    
        public static void main(String[] args) {
            int[] arr = new int[100];
            int index = 0;
            while (index < 100) {
                if (index % 2 == 0) {
                    arr[index] = 2;
                } else {
                    arr[index] = 1;
                }
                index = index + 1;
            }
            int[] test = {10, 20, 30, 40, 50};
           // System.out.println (arr[50]);
           // System.out.println(Main.printIntArray(test));
           // System.out.println("f(3): " + f(3));
            //System.out.println(intArrToString(arr));
             
		    System.out.println(PracticeProblems.countOccurances(44));
    }

    
}