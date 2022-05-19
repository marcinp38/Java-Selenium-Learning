package MyBooksAndPodcastsLibrary;

public class Podcasts {
    private String podcastName;
    private String podcastAuthor;

    public Podcasts(String podcastName, String podcastAuthor) {
        this.podcastName = podcastName;
        this.podcastAuthor = podcastAuthor;
    }

    public String getPodcastName() {
        return podcastName;
    }

    public void setPodcastName(String podcastName) {
        this.podcastName = podcastName;
    }

    public String getPodcastAuthor() {
        return podcastAuthor;
    }

    public void setPodcastAuthor(String podcastAuthor) {
        this.podcastAuthor = podcastAuthor;
    }
}
