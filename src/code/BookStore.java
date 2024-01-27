import java.util.ArrayList;

public class BookStore {
    final String BookStoreName;
    ArrayList<Novel> novels;

    public BookStore(String BookStoreName)
    {
        this.BookStoreName = BookStoreName;
        this.novels = new ArrayList<>();

        if(BookStoreName.equalsIgnoreCase("Amazon")){
            BookStoreName = "Chapters";
        }
        novels.add("The Adventures of Augie March", "Saul Bellow", "1953");
    }
}
