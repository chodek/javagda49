package streamapi.zad1;

import java.util.List;

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
}

