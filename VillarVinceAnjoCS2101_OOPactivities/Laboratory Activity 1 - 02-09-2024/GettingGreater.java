import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char char1 = sc.next().charAt(0);
        System.out.print("Enter second character: ");
        char char2 = sc.next().charAt(0);

        char greatValue = (char) Math.max(char1, char2);

        System.out.println("---------------------------------");
        System.out.printf("The character with great value is: %c \n", greatValue);
        System.out.println("---------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.printf("%c : %d \n",  char1, (int)char1);
        System.out.printf("%c : %d \n", char2, (int)char2);

        sc.close();
    }
}
