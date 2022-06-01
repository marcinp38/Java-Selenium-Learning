package MyBooksAndPodcastsLibrary;

public class Podcasts {
    private String podcastTitle;
    private String podcastAuthor;
    public Podcasts(String podcastTitle, String podcastAuthor,Genre genre) {
        this.podcastTitle = podcastTitle;
        this.podcastAuthor = podcastAuthor;
    }
    public String getPodcastTitle() {
        return podcastTitle;
    }
    public void setPodcastTitle(String podcastTitle) {
        this.podcastTitle = podcastTitle;
    }
    public String getPodcastAuthor() {
        return podcastAuthor;
    }
    public void setPodcastAuthor(String podcastAuthor) {
        this.podcastAuthor = podcastAuthor;
    }
    @Override
    public String toString() {
        return (podcastTitle + " - " + podcastAuthor);
    }
}
