import java.util.Scanner;

public class Escseq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean tab = false;

        System.out.print("Enter number of multiples: ");
        int count = scanner.nextInt();

        for(int i = 1; i <= count; i++) {
            int multiple = i * 7;

            if (tab) {
                System.out.println("\t" + multiple);
            } else {
                System.out.println(multiple);
            }

            tab = !tab;
        }

        scanner.close();
    }
}
