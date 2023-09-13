public class Multiples {
    public static void main(String[] args) {
        // int c = 0;
        // for (int i = 1; i < 1000; i++) {
        // if (i % 3 == 0 || i % 5 == 0) {
        // ++c;
        // }
        // }
        System.out.println(main());
    }

    public static int main(int n, int a, int b) {
        int c = 0;

        // faster runtime
        int a1 = a, b1 = b;
        while (a1 < n || b1 < n) {
            if (a1 < n) {
                ++c;
            }
            if (b1 < n && b1 % a != 0) {
                ++c;
            }
            a1 += a;
            b1 += b;
        }

        // for (int i = 1; i < n; i++) {
        // if (i % a == 0 || i % b == 0) {
        // ++c;
        // }
        // }
        return c;
    }

    public static int main() {
        return main(1000, 3, 5);
    }
}
