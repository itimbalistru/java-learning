class Movie {
    String title;
    String genre;
    int rating;
    void playIt() {
        System.out.println(" Running the movie ");
    }

    void run () {
        System.out.println(title + " run " + genre + rating);
    }
}