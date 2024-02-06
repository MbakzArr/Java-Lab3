
public class Novel {
    // Novel properties
    private final String title;
    private final String authorName;
    private final int yearPublished;

    // Novel constructor
    public Novel(String title, String authorName, int yearPub) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPub;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Getter method for author name
    public String getAuthorName() {
        return authorName;
    }

    // Getter method for year the book published
    public int getYearPublished() {
        return yearPublished;
    }
}
