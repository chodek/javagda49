package streamapi.zad1;

import java.util.List;
import java.util.stream.Collectors;

public class VideoService {
    List<Season> seasonList;

    public VideoService(List<Season> seasonList) {
        this.seasonList = seasonList;
    }

    // lista wszystkich epizodow
    public List<Episode> listAllEpisodes() {
        return seasonList.stream()
                .flatMap(season -> season.episodes.stream())
                .collect(Collectors.toList());
    }
}