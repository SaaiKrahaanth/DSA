import java.util.Scanner;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        int s;
        Scanner sc = new Scanner(System.in);
        s = 5;
        System.out.println(s);
        int[] numArray = new int[5];
        for (int i = 0; i < s; i++) {
            numArray[i] = i;
        }
        System.out.println("Array initalization completed successfully. " + s + " " + numArray);
        System.out.println(numArray[0]);
        for (int i = 0; i < s; i++) {

            System.out.print(numArray[i] + " ");
        }
        System.out.println("");
        // -------------ENHANCED FORLOOP------
        for (int num : numArray) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(numArray));

        // -------STRING ARRAY-----

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {

            str[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(str));
        // modify
        change(str);

        System.out.println(Arrays.toString(str));
       
        sc.close();

    }
    public static void change(String[] a){
        a[0]="HEHE";
            
    }
}