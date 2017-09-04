/**
 * Created by kaorihirata on 2017-09-03.
 */
public class MediaAdapter implements MediaPlayer {
    // Adapter pattern works as a bridge between two incompatible interfaces.
    // This pattern involves a single class(adapter) which is responsible to
    // join functionalities of independent or incompatible interfaces.
    // A real life example would be a memory card reader which acts as an
    // adapter between memory card and your laptop.

    AdvancedMediaPlayer advancedMediaPlayer;

    private String audioType;
    public MediaAdapter(String audioType) {
        if (audioType.equals("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
            this.audioType = "vlc";
        } else if (audioType.equals("mp4")) {
            advancedMediaPlayer = new Mp4Player();
            this.audioType = "mp4";
        }
    }

    @Override
    public void play(String filename) {
        if (audioType.equals("vlc")) {
            advancedMediaPlayer.playVlc(filename);
        } else if (audioType.equals("mp4")) {
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
