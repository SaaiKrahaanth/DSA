package STRING;

import java.util.*;

public class validString {

    public static int validString(String str, char x) {
        int sum = 0;
        switch (x) {
            case 'x':
                for (char ch : str.toCharArray()) {
                    if (ch == '#') {
                        sum += 1;
                    } else {
                        sum -= 1;
                    }

                }
                return sum;

            default:

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '#') {
                        sum += 1;
                    } else {
                        sum -= 1;
                    }
                }
                return sum;

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to validate:- ");
        String str = sc.nextLine();
        System.out.println("Enter the type of  forloop :- ");
        char x = sc.next().charAt(0);
        System.out.println("The result is " + validString(str, x));

    }

}
