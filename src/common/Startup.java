
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Mitch
 */
public class Startup {
    
    public static void main(String[] args) {
        //Lab:2
        System.out.println("Lab:2");
        System.out.println("");
        Movie m1 = new Movie("Star Wars", "George Lucas", "100");
        Movie m2 = new Movie("Another movie", "Random Director1", "200");
        Movie m3 = new Movie("LOTR", "Peter Jackson", "300");
        Movie m4 = new Movie("Another movie", "Random Director1", "200");
        
        Map<String, Movie> map = new HashMap<>();
        map.put("movie1", m1);
        map.put("movie2", m2);
        map.put("movie3", m3);
        map.put("movie4", m4);
        
        Movie m = map.get("movie1");
        System.out.println(m);
        
        System.out.println("");
        Set<String> keys = map.keySet();
        for(String key : keys){
            Movie found = map.get(key);
            System.out.println(found.toString());
        }
       
        //Lab:3
        System.out.println("");
        System.out.println("Lab:3");
        System.out.println("");
        Map<String, Movie> map2 = new TreeMap<>(map);
        Set<String> keys2 = map2.keySet();
        for(String key: keys2){
            Movie found = map.get(key);
            System.out.println(found.toString());
        }
        
        System.out.println("");
        Collection<Movie> values = map2.values();
        List<Movie> sortedList = new ArrayList<>(values);
        Collections.sort(sortedList);
        for(Movie mov : sortedList){
            System.out.println(mov);
        }      
        
        //Lab:4
        System.out.println("");
        System.out.println("Lab:4");
        System.out.println("");
        Collection<Movie> values2 = map2.values();
        List<Movie> sortedList2 = new ArrayList<>(values2);
        Collections.sort(sortedList2, new SortMovieByTitle());
        for(Movie mov: sortedList2){
            System.out.println(mov);
        }
        
        //Lab:5
        System.out.println("");
        System.out.println("Lab:5");
        System.out.println("");
        Set<Movie> set = new TreeSet<>();
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);
        
        List<Movie> list = new ArrayList<>(set);
        Collections.sort(list, new SortMovieByTitle());
        for(Movie mov: set){
            System.out.println(mov);
        }
    }

}
