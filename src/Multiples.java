public class Multiples {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                ++c;
            }
        }
        System.out.println(c);
    }
}
