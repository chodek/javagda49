package streamapi.zad1;

public class App {
    public static void main(String[] args) {
        VideoService videoService = new VideoService(Library.getData());

        // zad 1 - lista wszystkich epizodow
        videoService.listAllEpisodes();

    }
}
