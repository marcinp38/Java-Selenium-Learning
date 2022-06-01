package MyBooksAndPodcastsLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BooksLibrary {
    Scanner input = new Scanner(System.in);
    List<Books> booksList = new ArrayList<>();
    private String authorsFullName;
    public void add(Books book) {
        booksList.add(book);

    }
    public void showRandomBookToRead() {
        int r = ThreadLocalRandom.current().nextInt(0, booksList.size());
        System.out.println(booksList.get(r));
    }
    public void bookWelcomeNote() {
        System.out.println("You've picked books. List of commands below:\n" +
                "r - show random book\n" +
                "l - show full list of books\n" +
                "s - search the books by an author\n" +
                "e - exit");
    }
    public void provideAuthorData(String authorsName, String authorsSurname){
        System.out.print("Please input Author's name: ");
        authorsName = input.nextLine();
        System.out.print("Please input Authors surname: ");
        authorsSurname = input.nextLine();
        authorsFullName = authorsName + " " + authorsSurname;
    }
}


