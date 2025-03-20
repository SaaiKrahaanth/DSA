public class basic {
    public static void main(String[] args) {
        int n = 4;

        char alphabet = 97;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(alphabet + " ");
                alphabet += 1;
            }

            System.out.println();

        }

    }

}
