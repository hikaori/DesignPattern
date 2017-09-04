/**
 * Created by kaorihirata on 2017-09-03.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    private String audioType = "vlc";

    public String getAudioType() {
        return audioType;
    }

    public void playVlc(String filename) {
        System.out.println("Playing vlc file. Name: " + filename);
    }

    public void playMp4(String filename) {
        // do nothing
    }

}
