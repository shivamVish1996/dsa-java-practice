package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable<Movie>{

    private String movieName;
    private int yearOfRelease;
    private double rating;

    Movie(String name, int year, double rating){
        movieName = name;
        yearOfRelease = year;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return 0;
    }
}

class MovieNameComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getMovieName().compareTo(o2.getMovieName());
    }
}

class MovieYearComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {

        if(o1.getYearOfRelease() > o2.getYearOfRelease())
            return 1;
        else if(o1.getYearOfRelease() < o2.getYearOfRelease())
            return -1;
        else
            return 0;
    }
}

class MovieRatingComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {

        if(o1.getRating() > o2.getRating())
            return 1;
        else if(o1.getRating() < o2.getRating())
            return -1;
        else
            return 0;
    }
}

public class MovieProblem {

    public static void main(String[] args) {

        List<Movie> listOfMovies = new ArrayList<>();
        Movie m1 = new Movie("Test30", 2012, 9.5);
        Movie m2 = new Movie("Aest4", 2010, 8);
        Movie m3 = new Movie("aCCCCC", 2015, 9.5);
        Movie m4 = new Movie("4sde", 2009, 9);

        listOfMovies.add(m1);
        listOfMovies.add(m2);
        listOfMovies.add(m3);
        listOfMovies.add(m4);

        System.out.println(listOfMovies);

        System.out.println("\nMovie name comparator: ");
        Collections.sort(listOfMovies, new MovieNameComparator());
        System.out.println(listOfMovies);

        System.out.println("\nMovie release year comparator: ");
        Collections.sort(listOfMovies, new MovieYearComparator());
        System.out.println(listOfMovies);

        System.out.println("\nMovie rating comparator: ");
        Collections.sort(listOfMovies, new MovieRatingComparator());
        System.out.println(listOfMovies);
    }

}