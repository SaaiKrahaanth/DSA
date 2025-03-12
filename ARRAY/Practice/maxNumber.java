package Practice;  
import java.util.*;
public class maxNumber {
    static int maxNumber(int arr[],int start,int stop){
        int max=Integer.MIN_VALUE;
        if (arr==null
        for (int i = start; i <=stop; i++) {
            if (max<arr[i]){
                max=arr[i];
            }

    }
    return max;
}
static int maxNumber(ArrayList<Integer> arr){
    int max=Integer.MIN_VALUE;
    for (int i = 0; i < arr.size(); i++) {
        if (max<arr.get(i)){
            max=arr.get(i);
        }

}
return max;
}


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ArrayList<Integer> arrl=new ArrayList<>();
        for (int i : arr) {
            arrl.add(i);
            
        }System.out.println("arrl:-"+arrl);
        
        System.out.println("max num in array"+Arrays.toString(arr)+" is :- " + maxNumber(arr,1,2));
        System.out.println("max num in arrayList"+arrl+" is :- " + maxNumber(arrl));
        

            
        }
        
    }
    

