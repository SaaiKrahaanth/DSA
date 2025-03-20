package TCSNQT;

public class nonSimilarFactor {
    public static void main(String[] args) {
        int n = 36;
        int c = 0;
        for (int i = 1; i <n; i++) {
            if ((n % i == 0)&&(n/i!=i)) {
                
                c++;

            }

        }
        System.out.println(c);
    }

}
