package streamapi.zad1;

import java.util.Objects;

public class Video {
    public String title, url;
    public VideoType videoType;

    public Video(String title, String url, VideoType videoType) {
        this.title = title;
        this.url = url;
        this.videoType = videoType;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public VideoType getVideoType() {
        return videoType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video)) return false;
        Video video = (Video) o;
        return Objects.equals(title, video.title) &&
                Objects.equals(url, video.url) &&
                videoType == video.videoType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, url, videoType);
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", videoType=" + videoType +
                '}';
    }
}