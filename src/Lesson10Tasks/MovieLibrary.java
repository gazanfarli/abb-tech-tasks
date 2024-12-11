package Lesson10Tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieLibrary {
    List<Movie> movies = new ArrayList<>();

    Comparator<Movie> movieComparator = Comparator
            .comparing(Movie::getTitle)
            .thenComparing(Movie::getDirector)
            .thenComparingInt(Movie::getReleaseYear);

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.removeIf((m) -> m.equals(movie));
    }

    public List<Movie> searchMovie(Movie movie) {
        return movies
                .stream()
                .filter(
                        (m) ->
                                movie.getTitle().equals(m.getTitle()) ||
                                movie.getDirector().equals(m.getDirector()) ||
                                movie.getGenre().equals(m.getGenre())
                ).toList();
    }

    public List<Movie> searchByTitle (String title) {
        return movies
                .stream()
                .filter((m) -> m.getTitle().equals(title))
                .toList();
    }

    public List<Movie> searchByDirector (String director) {
        return movies
                .stream()
                .filter((m) -> m.getDirector().equals(director))
                .toList();
    }

    public List<Movie> searchByGenre (String genre) {
        return movies
                .stream()
                .filter((m) -> m.getGenre().equals(genre))
                .toList();
    }

    public void displayMovies() {
        List<Movie> movieList = movies
                .stream()
                .sorted(movieComparator)
                .toList();

        movieList.forEach(System.out::println);
    }

    public double getAverageReleaseYear() {
        return movies
                .stream()
                .mapToInt(Movie::getReleaseYear)
                .average()
                .orElse(0);
    }

    public long getCount() {
        return movies.size();
    }
}
