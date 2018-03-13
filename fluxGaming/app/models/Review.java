package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Review extends Model {

    @Id
    private Long id;
    private String name;
    private String author;
    private String caption;
    private String review;
    private int rating;

    //to add:
    //arrayList genre;
    //arrayList platform;
    //arrayList comments?

    public Review(Long id, String name, String author, String caption, String review, int rating) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.caption = caption;
        this.review = review;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}