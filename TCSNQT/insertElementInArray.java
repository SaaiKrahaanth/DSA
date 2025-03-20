package TCSNQT;
import java.util.*;

public class insertElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int position=3;
        int element=10;
        int[] newArr=new int[arr.length+1];
        for(int i=0 ,j=0;j<=arr.length;i++,j++){
            if (i==position-1){
                newArr[j]=element;
                j++;
            }
            
                newArr[j]=arr[i];
                
            
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }
    
}
