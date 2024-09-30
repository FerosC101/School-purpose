import java.util.Scanner;

class GetArrayMean {

    public static double getArrayMean(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] element = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            element[i] = sc.nextInt();
        }

        double mean = getArrayMean(element);
        System.out.printf("Mean of Array is: %.2f", mean);

        sc.close();
    }
}
