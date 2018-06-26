public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "How to burn to action";
        one.genre = "Drama";
        one.rating = -2;
        one.playIt();

        Movie two = new Movie();
        two.title = "Lost in office";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        two.run();

        Movie three = new Movie();
        three.title = "Fight club";
        three.genre = "Tragedy, but ultimately cheerful";
        three.rating = 127;
        three.playIt();
    }
}
