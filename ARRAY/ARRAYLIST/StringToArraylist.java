package ARRAYLIST;
import java.util.*;

//this program converts "1 2 3 4 " --> [1,2,3,4]
public class StringToArraylist {
    /**
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        input=input.trim();

        // System.out.println(input);

        String[] numbers=input.split(" ");

        // System.out.println(Arrays.toString(numbers));
        for(String number:numbers){
            String num=number.trim();

            try{
                arr.add(Integer.parseInt(num));

            }
            catch(Exception e){
                System.out.println("invalid input");
            }

        }

        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
    
}
