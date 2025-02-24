public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int c = 0; // counts number of steps
        while (n > 0) {
            n = reduce(n);
            ++c;
        }
        System.out.println(c);
    }

    public static int main(int n) {
        int c = 0; // counts number of steps
        while (n > 0) {
            n = reduce(n);
            ++c;
        }
        return c;
    }

    public static int main() {
        return main(100);
    }

    private static int reduce(int n) {
        // if odd
        if (n % 2 == 1) {
            return n - 1;
        } else {
            return n / 2;
        }
    }
}
