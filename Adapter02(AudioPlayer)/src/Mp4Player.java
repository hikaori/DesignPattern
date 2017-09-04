/**
 * Created by kaorihirata on 2017-09-03.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    private String audioType = "mp4";

    public String getAudioType() {
        return audioType;
    }

    public void playVlc(String filename) {
        // do nothing
    }

    public void playMp4(String filename) {
        System.out.println("Playing mp4 file. Name: " + filename);
    }

}
