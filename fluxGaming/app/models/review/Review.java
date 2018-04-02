package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.text.SimpleDateFormat;
import java.text.DateFormat;

@Entity
public class Review extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String author;
    @Constraints.Required
    private String caption;
    @Constraints.Required
    @javax.persistence.Column(length=7000)  
    private String review;
    @Constraints.Required
    private int rating;
    @Constraints.Required
    private int year;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "reviews")
    public List<Genre> genres;

    //to add:
    //arrayList platform;
    //arrayList comments?

    public static Finder<Long, Review> find = new Finder<Long, Review>(Review.class);

    public Review(Long id, String name, String author, String caption, String review, int rating, List<Genre> genres) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.caption = caption;
        this.review = review;
        this.rating = rating;
        this.genres = genres;
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

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public static List<Review> findAll(){
        return Review.find.all();
    }

    public static Map<String, String> options() {

        LinkedHashMap<String, String> years = new LinkedHashMap();
        int baseYear = 1980;
        int currentYear = Calendar.getInstance().get(1) + 1;
        
        while(baseYear < currentYear){
            years.put(Integer.toString(currentYear), Integer.toString(currentYear));
            currentYear--;
        }

        return years;
    }

    public static final List<Review> findRecent(){
    
        return Review.find.query().setMaxRows(5).where().orderBy("id DESC").findList();
    }

    public List<Long> genreSelect = new ArrayList<Long>();

    public List<Long> getGenreSelect(){
        return genreSelect;
    }

    public void setGenreSelect(List<Long> genreSelect){
        this.genreSelect = genreSelect;
    }

    public static final List<Review> findAllOrdered(String filter){
        return Review.find.query().where().ilike("name", "%" + filter + "%").orderBy("id DESC").findList();
    }

    public static List<Review> findFilter(Long genreId, String filter){
        return Review.find.query().where().eq("genres.id", genreId).ilike("name", "%" + filter + "%").orderBy("name asc").findList();
    }

    public List<Genre> getGenres(){
        return genres;
    }

}