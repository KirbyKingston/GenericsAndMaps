
package common;

import java.util.Comparator;

/**
 *
 * @author Mitch
 */

public class SortMovieByTitle implements Comparator<Movie> {

    @Override
    public int compare(Movie e1, Movie e2) {
        return e1.getTitle().compareTo(e2.getTitle());
        
    }
}