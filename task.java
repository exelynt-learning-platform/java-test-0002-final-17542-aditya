public class task {

    public static void main(String[] args) {

        int totalRows = 5;

        for (int i = 1; i <= totalRows; i++) {
            for (int s = 1; s <= totalRows - i; s++) {
                System.out.print("  ");
            }
            for (int num = 1; num <= i; num++) {
                System.out.print(num + " ");
            }
            for (int num = i - 1; num >= 1; num--) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}