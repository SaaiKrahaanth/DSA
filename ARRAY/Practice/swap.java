package Practice;

import java.util.*;

public class swap {
    public static void main(String[] args) {
        int[] a = { 1, 2 };
        swap(a, 0, 1);
        System.out.println("a:- "+ Arrays.toString(a));
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        swap(list,0,1);
        System.out.println("al:- "+list);


    }

    static void swap(int ar[], int a, int b) {

        int t = ar[a];
        ar[a] = ar[b];
        ar[b] = t;
    }
    static void swap(ArrayList<Integer> List,int a, int b){

        int t=List.get(a);
        List.set(a,List.get(b));
        List.set(b,t);


    }

}
