/**
 * Here's a class named Book. It has three fields: string field title, int field yearOfPublishing and an array of strings authors.
 * Override the method toString in the class to return string representations of books.
 *
 * The overridden method must return a string including all field-value pairs separated by commas.
 * An array of authors always includes at least one author. Do not add a comma after the last author.
 *
 * Here is an example: "title=Java 8 & 9 in Action,yearOfPublishing=2017,authors=[Mario Fusco,Alan Mycroft]".
 */
public class BooksAsStrings {
    public static void main(String[] args) {
        String[] authors = {"Mario Fusco", "Alan Mycroft"};
        Book book = new Book("Java 8 & 9 in Action", 2017, authors);
        System.out.println(book);
    }
}

class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    @Override
    public String toString() {
//        return "title=" + title + ",yearOfPublishing=" + yearOfPublishing + ",authors=" + stringArrayToString(authors);
        return "title=" + title + "," + "yearOfPublishing=" + yearOfPublishing
                + "," + "authors=[" + String.join(",", authors) + "]";
    }

    private String stringArrayToString(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            if (sb.length() == 0) {
                sb.append("[");
            } else {
                sb.append(",");
            }
            sb.append(s);
        }
        if (sb.length() != 0) {
            sb.append("]");
        }
        return sb.toString();
    }
}
