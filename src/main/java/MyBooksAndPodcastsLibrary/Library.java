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


        PodcastLibrary podLib = new PodcastLibrary();
        Podcasts podcast1 = new Podcasts("The Evil Tester Show", "Alan Richardson",Genre.Must_listen);
        Podcasts podcast2 = new Podcasts("Finanse Bardzo Osobiste","Marcin Iwuć",Genre.Should_listen);
        Podcasts podcast3 = new Podcasts("Podcast Pasja Informatyki","Mirosław Zelent",Genre.Must_listen);
        Podcasts podcast4 = new Podcasts("Podcast Stacja IT","Stacja IT",Genre.Should_listen);
        Podcasts podcast5 = new Podcasts("Leśnodorski i Żurnalista w trójkącie towarzyskim","Żurnalista", Genre.Listen_for_relax);


            podLib.add(podcast1);
            podLib.add(podcast2);
            podLib.add(podcast3);
            podLib.add(podcast4);
            podLib.add(podcast5);


        Scanner input = new Scanner(System.in);
        Boolean isExit = false;
        Boolean isBookExit = false;
        Boolean isPodcastExit = false;
        String Command;
        String bookCommand;
        String podcastCommand;

        welcomeNote();
        while (!isExit) {
            System.out.print("Please type exact command: ");
            Command = input.nextLine();
            switch (Command) {

                case "b":{
                    lib.bookWelcomeNote();
                    while(!isBookExit) {
                        System.out.println();
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
                                break;
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

                break;

                case "p": {
                    podLib.podcastWelcomeNote();
                    while(!isPodcastExit) {
                        System.out.println();
                        System.out.print("What do you want me to do? ");
                        podcastCommand = input.nextLine();
                        switch (podcastCommand) {
                            case "r":
                                podLib.showRandomPodcast();
                                break;
                            case "l":
                                for (Podcasts podcast : podLib.podcastsList) {
                                    System.out.println(podcast);

                                }
                                break;
                            case "s":{
//                                lib.provideAuthorData();
//                                System.out.println();
//                                System.out.println(lib.getAuthorsBooksList());
////                                lib.showBooksByAuthor();


                            }
                            break;
                            case "e":
                                isPodcastExit = true;
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

