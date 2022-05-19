package MyBooksAndPodcastsLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BooksLibrary {
    Scanner input = new Scanner(System.in);
    List<Books> booksList = new ArrayList<>();
    String AuthorsFullName;

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

    Books authorsFullName;
    public void provideAuthorData(){
        System.out.print("Please input Author's name: ");
        String authorsName = input.nextLine();
        System.out.print("Please input Authors surname: ");
        String authorsSurname = input.nextLine();
        String authorsFullName = authorsName + " " + authorsSurname;
        System.out.println(authorsFullName);

    }

    public List<Books> getAuthorsBooksList() {
        List<Books> tmp = new ArrayList<>();
        for (Books item : booksList) {

            if (booksList.contains(authorsFullName)) {
                tmp.add(item);
            }
        }
        return tmp;
    }

    //    public List<Books> getbooksByAuthor(String name, String surname) {
//        System.out.print("Please input Author's name: ");
//        String authorsName = input.nextLine();
//        System.out.print("Please input Authors surname: ");
//        String authorsSurname = input.nextLine();
//        Books author = new Books(authorsName, authorsSurname);
//        List<Books> tmp = new ArrayList<>();
//        for (Books item : booksList) {
//            if (item.isAuthorOnTheList(item)) {
//                tmp.add(item);
//            }
//
//        }
//    return tmp;
//    }
//    public void showBooksByAuthor(String bookAuthorname, String bookAuthorSurname) {
//        for (Books item : getbooksByAuthor()) {
//            System.out.println(item);
//
//        }
//        }


}
