import  java.util.Scanner;

public class Gettinginputs {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String Genre, Album, Title, Artist;
        int Year;

        System.out.print("Enter the year: ");
        Year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the genre: ");
        Genre = sc.nextLine();
        System.out.print("Enter the album: ");
        Album = sc.nextLine();
        System.out.print("Enter the song title: ");
        Title = sc.nextLine();
        System.out.print("Enter the artist: ");
        Artist = sc.nextLine();

        System.out.println("---------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("---------------------------------");

        System.out.printf("Year Released: %d \n", Year);
        System.out.printf("Genre: %s \n", Genre);
        System.out.printf("Album: %s \n", Album);
        System.out.printf("Title: \"%s\" \n", Title);
        System.out.printf("Artist: %s \n", Artist);

        sc.close();
    }
}
