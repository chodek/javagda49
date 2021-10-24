package streamapi.zad1;

import java.util.Arrays;
import java.util.List;

public class Library {
    public static List<Season> getData() {
        Video video1101 = new Video("GOT111", "www.got1_1_1.com", VideoType.CLIP);
        Video video1102 = new Video("GOT112", "www.got1_1_2.com", VideoType.PREVIEW);
        Video video1103 = new Video("GOT113", "www.got1_1_3.com", VideoType.EPISODE);
        Video video1104 = new Video("GOT114", "www.got1_1_4.com", VideoType.CLIP);
        Video video1201 = new Video("GOT121", "www.got1_2_1.com", VideoType.CLIP);
        Video video1202 = new Video("GOT122", "www.got1_2_2.com", VideoType.PREVIEW);
        Video video1203 = new Video("GOT123", "www.got1_2_3.com", VideoType.EPISODE);
        Video video1204 = new Video("GOT124", "www.got1_2_4.com", VideoType.CLIP);
        Video video1301 = new Video("GOT131", "www.got1_3_1.com", VideoType.CLIP);
        Video video1302 = new Video("GOT132", "www.got1_3_2.com", VideoType.PREVIEW);
        Video video1303 = new Video("GOT133", "www.got1_3_3.com", VideoType.EPISODE);
        Video video1304 = new Video("GOT134", "www.got1_3_4.com", VideoType.CLIP);
        Video video2101 = new Video("GOT211", "www.got2_1_1.com", VideoType.CLIP);
        Video video2102 = new Video("GOT212", "www.got2_1_2.com", VideoType.PREVIEW);
        Video video2103 = new Video("GOT213", "www.got2_1_3.com", VideoType.EPISODE);
        Video video2104 = new Video("GOT214", "www.got2_1_4.com", VideoType.CLIP);
        Video video2201 = new Video("GOT221", "www.got2_2_1.com", VideoType.CLIP);
        Video video2202 = new Video("GOT222", "www.got2_2_2.com", VideoType.PREVIEW);
        Video video2203 = new Video("GOT223", "www.got2_2_3.com", VideoType.EPISODE);
        Video video2204 = new Video("GOT224", "www.got2_2_4.com", VideoType.CLIP);
        Video video2301 = new Video("GOT231", "www.got2_3_1.com", VideoType.CLIP);
        Video video2302 = new Video("GOT232", "www.got2_3_2.com", VideoType.PREVIEW);
        Video video2303 = new Video("GOT233", "www.got2_3_3.com", VideoType.EPISODE);
        Video video2304 = new Video("GOT234", "www.got2_3_4.com", VideoType.CLIP);

        Episode episode11 = new Episode("GOT11", 1, Arrays.asList(video1101, video1102, video1103, video1104));
        Episode episode12 = new Episode("GOT12", 2, Arrays.asList(video1201, video1202, video1203, video1204));
        Episode episode13 = new Episode("GOT13", 3, Arrays.asList(video1301, video1302, video1303, video1304));
        Episode episode21 = new Episode("GOT21", 1, Arrays.asList(video2101, video2102, video2103, video2104));
        Episode episode22 = new Episode("GOT22", 2, Arrays.asList(video2201, video2202, video2203, video2204));
        Episode episode23 = new Episode("GOT23", 3, Arrays.asList(video2301, video2302, video2303, video2304));

        Season season1 = new Season("GOT1", 1, Arrays.asList(episode11, episode12, episode13));
        Season season2 = new Season("GOT2", 2, Arrays.asList(episode21, episode22, episode23));
        return List.of(season1, season2);
    }
}