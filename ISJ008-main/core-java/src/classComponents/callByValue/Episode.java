package classComponents.callByValue;

public class Episode {
    int episodeId;
    String episodeName;
    int episodeDuration;

    public Episode() {
    }

    public Episode(int episodeId, String episodeName, int episodeDuration) {
        this.episodeId = episodeId;
        this.episodeName = episodeName;
        this.episodeDuration = episodeDuration;
    }
}
