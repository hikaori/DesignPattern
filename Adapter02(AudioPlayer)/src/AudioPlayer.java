/**
 * Created by kaorihirata on 2017-09-03.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    private String audioType;
    public AudioPlayer(String audioType) {
        if (!audioType.equals("mp3")) {
            mediaAdapter = new MediaAdapter(audioType);
            this.audioType = audioType;
        } else {
            this.audioType = "mp3";
        }

    }
    public void play(String filename) {
        if (audioType.equals("mp3")) {
            System.out.println("Playing mp3 file. Name: " + filename);
        } else {
            mediaAdapter.play(filename);
        }
    }
}
