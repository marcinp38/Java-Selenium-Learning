package MyBooksAndPodcastsLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PodcastLibrary {
    List<Podcasts> podcastsList = new ArrayList<>();

    Scanner input = new Scanner(System.in);
    public void add(Podcasts podcast) {
        podcastsList.add(podcast);
    }
    public void showRandomPodcast() {
        int r = ThreadLocalRandom.current().nextInt(0, podcastsList.size());
        System.out.println(podcastsList.get(r));
    }
    public void podcastWelcomeNote() {
        System.out.println("You've picked podcasts. List of commands below:\n" +
                "r - show random podcast\n" +
                "l - show full list of podcasts\n" +
                "s - search the podcasts by an author\n" +
                "e - exit");
    }
}
