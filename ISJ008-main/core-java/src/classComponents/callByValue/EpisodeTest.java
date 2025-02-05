package classComponents.callByValue;

public class EpisodeTest {
    public static void main(String[] args) {
        Episode episode = new Episode(1, "Family Man", 3);
        printEpisodeDetails(episode);
        System.out.println(episode.episodeId);
        System.out.println(episode.episodeName);
        System.out.println(episode.episodeDuration);
    }

    private static void printEpisodeDetails(Episode episode) {
        episode.episodeId = 202;
        episode.episodeName = "Shaktiman";
        episode.episodeDuration = 1;
        System.out.println(episode.episodeId);
        System.out.println(episode.episodeName);
        System.out.println(episode.episodeDuration);
    }
}
