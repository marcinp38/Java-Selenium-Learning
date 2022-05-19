package MyBooksAndPodcastsLibrary;

import java.util.List;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        BooksLibrary lib = new BooksLibrary();
        Books book1 = new Books("Carol", "Dweck", "The New Psychology of Success", Genre.Psychology);
        Books book2 = new Books("Jeff", "Olson", "The Slight Edge",Genre.Self_development );
        Books book3 = new Books("Dale", "Carnegie", "How to Win Friends and Influence People", Genre.Must_read);
        Books book4 = new Books("David", "Allen", "Getting Things Done",Genre.Self_development);

        lib.add(book1);
        lib.add(book2);
        lib.add(book3);
        lib.add(book4);


        Scanner input = new Scanner(System.in);
        Boolean isExit = false;
        Boolean isBookExit = false;
        String Command;
        String bookCommand;

        welcomeNote();
        while (!isExit) {
            System.out.print("Please type exact command: ");
            Command = input.nextLine();
            switch (Command) {

                case "b":{
                    lib.bookWelcomeNote();
                    while(!isBookExit) {
                        System.out.print("What do you want me to do? ");
                        bookCommand = input.nextLine();
                        switch (bookCommand) {
                            case "r":
                                lib.showRandomBookToRead();
                                break;
                            case "l":
                                for (Books books : lib.booksList) {
                                    System.out.println(books);

                                }
                            case "s":{
                                lib.provideAuthorData();
                                System.out.println();
                                System.out.println(lib.getAuthorsBooksList());
//                                lib.showBooksByAuthor();


                            }
                                break;
                            case "e":
                                isBookExit = true;
                                welcomeNote();
                                break;
                            default:
                                System.out.println("Incorrect command.");
                                break;
                        }
                    }
                }
                System.out.println();
                break;

                case "p": {
                    System.out.println("You've picked podcasts. Please select an option:\n");
                }
                break;

                case "e":
                    isExit = true;
                    break;

                default:
                    System.out.print("You didn't pick the right command. Please repeat: ");

            }

        }

    }

    private static void welcomeNote() {
                    System.out.println("Are you interested in book or podcast?\n" +
                    "b- book \n" +
                    "p - podcast \n" +
                    "e - exit \n");


    }
}
