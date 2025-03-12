package HASHMAP;
import java.util.*;
public class mapCountForEach {
    public static String findOddBalloon1(String[] balloons)
    {
        Map<String,Integer> freqMap=new HashMap<>();
        for(String balloon:balloons){
            freqMap.put(balloon,freqMap.getOrDefault(balloon,0)+1);

        }
        for(String balloon:balloons){
            if(freqMap.get(balloon)%2!=0)
            {
                return balloon+" is the first odd counted balloon";

            }
        
    }
    return "All are even";
    
    }

    public static String findOddBalloon2(String[] balloons)
    {
        String currentBalloon;
        int currentCount;
        for (int i = 0; i < balloons.length; i++) 
        {
            currentBalloon=balloons[i];
            currentCount=0;
            for (int j = 0; j < balloons.length; j++) 
            {
                if(currentBalloon.equals(balloons[j]))
                {
                    currentCount++;
                }
                
            }
            if(currentCount%2!=0)
            {
                return currentBalloon+" is the first odd counted balloon";
            }

            
        }
        return "All are even";

    }


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of ballons:- ");

    int s=sc.nextInt();
    sc.nextLine();
    String[] balloons=new String[s];
    for (int i = 0; i < s; i++) {
        System.out.println("Enter the "+ (i+1) +"element");
        balloons[i]=sc.nextLine();
   
    }
    System.out.println("The final ballons are :- "+ Arrays.toString(balloons));

    System.out.println("Result:- "+ findOddBalloon1(balloons) );
    System.out.println("Result:- "+ findOddBalloon2(balloons) );
    sc.close();
}

}
