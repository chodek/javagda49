package streamapi.zad1;

public class App {
    public static void main(String[] args) {
        VideoService videoService = new VideoService(Library.getData());

        // zad 1 - lista wszystkich epizodow
        System.out.println(videoService.listAllEpisodes());

        // zad 2 - lista wszystkich video
        System.out.println(videoService.listAllVideos());

    }
}
