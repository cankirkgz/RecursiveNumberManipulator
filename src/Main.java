public class Main{
    public static void manipulateNumber(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        manipulateNumber(n - 5);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 16;
        manipulateNumber(n);
    }
}
