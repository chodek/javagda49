package streamapi.zad1;

import java.util.List;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Episode{" +
                "episodeName='" + episodeName + '\'' +
                ", episodeNumber=" + episodeNumber +
                ", videos=" + videos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Episode)) return false;
        Episode episode = (Episode) o;
        return episodeNumber == episode.episodeNumber &&
                Objects.equals(episodeName, episode.episodeName) &&
                Objects.equals(videos, episode.videos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(episodeName, episodeNumber, videos);
    }
}