package streamapi.zad1;

import java.util.List;
import java.util.Objects;

public class Season {
    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;

    public Season(String seasonName, int seasonNumber, List<Episode> episodes) {
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Season)) return false;
        Season season = (Season) o;
        return seasonNumber == season.seasonNumber &&
                Objects.equals(seasonName, season.seasonName) &&
                Objects.equals(episodes, season.episodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seasonName, seasonNumber, episodes);
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonNumber=" + seasonNumber +
                ", episodes=" + episodes +
                '}';
    }
}

