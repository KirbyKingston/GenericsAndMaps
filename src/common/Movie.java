package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie implements Comparable {
    private String title;
    private String director;
    private String movieId;

     public Movie(String title, String director, String movieId) {
        setTitle(title);
        setDirector(director);
        setMovieId(movieId);
    }
    
    public final String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }

    public final String getDirector() {
        return director;
    }

    public final void setDirector(String director) {
        this.director = director;
    }
    
    public final String getMovieId() {
        return movieId;
    }

    public final void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    
     @Override
    public final int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.movieId);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.movieId, other.movieId)) {
            return false;
        }
        return true;
    }

    @Override
    public final String toString() {
        return "| Title: " + title + " | Director: " + director + " | MovieId: " + movieId + "|";
    }
    
    @Override
    public int compareTo(Object other) {
        Movie o = (Movie)other;
        
        return new CompareToBuilder()
                .append(this.movieId, o.movieId)
                .toComparison();
    }

}
