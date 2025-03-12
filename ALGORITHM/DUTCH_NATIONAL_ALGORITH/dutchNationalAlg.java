package ALGORITHM.DUTCH_NATIONAL_ALGORITH;

import Practice.swap;
import java.util.*;

public class dutchNationalAlg {
    public static int[] dutchNationalAlg(int[] arr)
    {   int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {   swap.swap(arr, mid, low);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;

            }
            else
            {
                swap.swap(arr, mid, high);
                
                high--;
            }
        }
        return arr;

    }

    public static void main(String[] args)
    {
        int[] arr={2,1,0,2,1,0,2,1,2,1,0,0,1,2};
        
        System.out.println(Arrays.toString(dutchNationalAlg(arr)));

        
    }
    
}
