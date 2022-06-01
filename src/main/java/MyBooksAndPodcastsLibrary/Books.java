package MyBooksAndPodcastsLibrary;

public class Books {
    private String bookAuthorName;
    private String bookAuthorSurname;
    private String bookTitle;
    public Books(String bookAuthorName, String bookAuthorSurname, String bookTitle,Genre genre) {
        this.bookAuthorName = bookAuthorName;
        this.bookAuthorSurname = bookAuthorSurname;
        this.bookTitle = bookTitle;
    }
    public Books(String bookAuthorName, String bookAuthorSurname) {
        this.bookAuthorName = bookAuthorName;
        this.bookAuthorSurname = bookAuthorSurname;
    }
    public String getBookAuthorName() {
        return bookAuthorName;
    }
    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }
    public String getBookAuthorSurname() {
        return bookAuthorSurname;
    }
    public void setBookAuthorSurname(String bookAuthorSurname) {
        this.bookAuthorSurname = bookAuthorSurname;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    @Override
    public String toString() {
        return (bookTitle);
    }
//    public boolean isAuthorOnTheList(Books author) {
//        return authorsList.contains(author);
//    }
}
