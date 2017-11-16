
package common;

import java.util.Comparator;

/**
 *
 * @author Mitch
 */

public class SortMovieByDirector implements Comparator<Movie> {

    @Override
    public final int compare(Movie e1, Movie e2) {
        return e1.getDirector().compareTo(e2.getDirector());
        
    }
}