package Lesson10Tasks;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MovieLibrary library = new MovieLibrary();

        library.addMovie(new Movie("Inception", "Christopher Nolan", "Sci-fi", 2010));
        library.addMovie(new Movie("The Dark Knight", "Christopher Nolan", "Action", 2008));
        library.addMovie(new Movie("Interstellar", "Christopher Nolan", "Sci-fi", 2014));
        library.addMovie(new Movie("Parasite", "Bong Joon-ho", "Thriller", 2019));
        library.addMovie(new Movie("The Matrix", "The Wachowskis", "Sci-fi", 1999));

        System.out.println("All Movies: ");
        library.displayMovies();

        System.out.println("\nSearch by title: ");
        List<Movie> titleSearch = library.searchByTitle("Inception");
        titleSearch.forEach(movie -> System.out.println(movie.getTitle()));

        System.out.println("\nSearch by genre: ");
        List<Movie> genreSearch = library.searchByGenre("Sci-fi");
        genreSearch.forEach(movie -> System.out.println(movie.getTitle()));

        System.out.println("\nSearch by director: ");
        List<Movie> directorSearch = library.searchByDirector("Christopher Nolan");
        directorSearch.forEach(movie -> System.out.println(movie.getTitle()));

        System.out.println("\nAverage release year: ");
        System.out.println(library.getAverageReleaseYear());

        System.out.println("\nTotal movie count: ");
        System.out.println(library.getCount());
    }
}
