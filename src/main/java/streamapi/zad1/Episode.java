package streamapi.zad1;

import java.util.List;

public class Episode {
    public String episodeName;
    public int episodeNumber;
    List<Video> videos;

    public Episode(String episodeName, int episodeNumber, List<Video> videos) {
        this.episodeName = episodeName;
        this.episodeNumber = episodeNumber;
        this.videos = videos;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public List<Video> getVideos() {
        return videos;
    }
}