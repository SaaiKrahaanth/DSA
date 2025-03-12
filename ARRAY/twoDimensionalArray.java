import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class twoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = sc.nextInt();

            }

        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");

            }System.out.println();

        }
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }

        // MULTIDIMENSIONAL ARRAYLIST
    ArrayList<ArrayList<Integer>> twoDArraylist=new ArrayList<ArrayList<Integer>>();
    twoDArraylist.add(new ArrayList<>(Arrays.asList(1,2,3)));
    twoDArraylist.add(new ArrayList<>(Arrays.asList(1,2,3)));
    twoDArraylist.add(new ArrayList<>(Arrays.asList(1,2,3)));
System.out.println(twoDArraylist);    
}

}
