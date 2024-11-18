public class ArtistDemo {
    public static void main(String[] args) {
        // My favorite artist from the Renaissance period
        Singer singer = new Singer("Maddalena Casulana", "Italian", 40, "Music", Genre.CLASSICAL);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Leonardo da Vinci", "Italian", 67, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("William Shakespeare", "English", 52, "Writing", WritingStyle.DRAMA);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Cesare Negri", "Italian", 60, "Dancing", DanceStyle.CONTEMPORARY);
        dancer.displayInfo();

    }
}
