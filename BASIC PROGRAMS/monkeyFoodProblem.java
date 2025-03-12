import java.util.Scanner;

public class monkeyFoodProblem {
    public static int monkeyFoodProblem(int n,int k,int j,int m,int p)
    {
        int bananaAteMonkey=m/k;
        int penutAteMonkey=p/j;

        int remainingBanana=m%k;
        int remainingPenut=p%j;

        int AteMonkey=bananaAteMonkey+penutAteMonkey;

        if(AteMonkey<n &&(remainingBanana>0 || remainingPenut>0))
        {
            AteMonkey++;
        }
        return AteMonkey;
    }
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter total number of monkeys (n): ");
        int n = sc.nextInt();
        System.out.print("Enter total number of bananas (m): ");
        int m = sc.nextInt();
        System.out.print("Enter total number of peanuts (p): ");
        int p = sc.nextInt();
        System.out.print("Enter number of bananas a monkey can eat (k): ");
        int k = sc.nextInt();
        System.out.print("Enter number of peanuts a monkey can eat (j): ");
        int j = sc.nextInt();

        System.out.println("result" + monkeyFoodProblem(n, k, j, m, p));

      
    }
    
}
