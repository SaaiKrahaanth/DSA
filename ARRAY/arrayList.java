import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        int len = 5;
        for (int i = 0; i < len; i++) {
            List.add(i * 2);

        }

        //ArrayList--> Array
        Integer[] arr = List.toArray(new Integer[0]);


        System.out.println(Arrays.toString(arr));
        System.out.println(List);
        for (int i = 0; i < List.size(); i++) {
            List.set(len - i - 1, arr[i]);
        }
        System.out.println(List);
        System.out.println(List.contains(0));
        List.remove(2);
        System.out.println(List);
        System.out.println(arr[2]);
        System.out.println(List.get(2));
       Collections.reverse(List);
       System.out.println(List);

}
}
