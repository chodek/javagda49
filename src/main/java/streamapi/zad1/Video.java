package streamapi.zad1;

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
}