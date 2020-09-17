/**
 * You are given four classes — Publication, Newspaper, Article and Announcement.
 * You need to override methods getType() and getDetails() in classes inherited from the class Publication.
 *
 * Then you need to implement getInfo() in the class Publication using getType() and getDetails().
 * The method should return a String with a type of publication in the first place,
 * then details in round brackets and the title after a colon. Examples are shown below.
 *
 * Sample Input 1:
 * Publication; The new era
 * Sample Output 1:
 * Publication: The new era
 * Sample Input 2:
 * Newspaper; Football results; Sport news
 * Sample Output 2:
 * Newspaper (source - Sport news): Football results
 * Sample Input 3:
 * Article; Why the Sun is hot; Dr James Smith
 * Sample Output 3:
 * Article (author - Dr James Smith): Why the Sun is hot
 * Sample Input 4:
 * Announcement; Will sell a house; 30
 * Sample Output 4:
 * Announcement (days to expire - 30): Will sell a house
 */

public class PublicationAndItsSubclasses {

}
class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        // write your code here
        return getType() + getDetails() + ": " + title;
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return "";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    // write your code here

    @Override
    public String getType() {
        return "Newspaper";
    }

    @Override
    public String getDetails() {
        return " (source - " + source + ")";
    }
}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here
    @Override
    public String getType() {
        return "Article";
    }

    @Override
    public String getDetails() {
        return " (author - " + author + ")";
    }
}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here
    @Override
    public String getType() {
        return "Announcement";
    }

    @Override
    public String getDetails() {
        return " (days to expire - " + daysToExpire + ")";
    }

}