package Practice;

public class recordBreakingElements {
    public static int recordBreakingElements1(int[] arr) {
        int count = 1;
        int n = arr.length;
        Boolean flag;
        if (n <= 0) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            flag = true;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    public static int recordBreakingElements2(int[] arr) {
        int currentMaxint = Integer.MIN_VALUE, count = 0;

        for (int i : arr) {
            if (i > currentMaxint) {
                currentMaxint = i;
                count++;

            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 2, 9 };

        System.out.println("the result of fun1 " + recordBreakingElements1(arr));
        System.out.println("the result of fun2 " + recordBreakingElements2(arr));
    }

}
