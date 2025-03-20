package TCSNQT;
import java.util.*;

public class sumOfmaxProduct2int {
    public static void main(String[] args) {
        int[] arr={9,-3,8,-6,-7,8,10
        };
        int n=arr.length;
        int maxint=Integer.MIN_VALUE;
        int a=0;
        int b=0;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int current_product=arr[i]*arr[j];
                if (current_product>maxint){
                    maxint=current_product;
                    a=i;
                    b=j;
                }

                
            }
            
        }
        System.out.println(arr[a]+arr[b]);
    }
    
}
