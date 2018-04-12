package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Genre extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Review> reviews;

    public Genre() {

    }

    public Genre(Long id, String name, List<Review> reviews){
        this.id = id;
        this.name = name;
        this.reviews = reviews;
    }


    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Review> getReviews(){
        return reviews;
    }

    public void setReviews(List<Review> reviews){
        this.reviews = reviews;
    }

    public static Finder<Long, Genre> find = new Finder<Long, Genre>(Genre.class);

    public static List<Genre> findAll(){
        return Genre.find.query().where().orderBy("name asc").findList();
    }

    public static boolean inGenre(Long genre, Long review){
        return find.query().where().eq("reviews.id", review).eq("id", genre).findCount() > 0;
    }

    public static Map<String, String> options() {

        LinkedHashMap<String, String> options = new LinkedHashMap();

        for(Genre g : Genre.findAll()){
            options.put(g.getId().toString(), g.getName());
        }

        return options;
    }
}
