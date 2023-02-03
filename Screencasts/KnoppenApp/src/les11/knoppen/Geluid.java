package les11.knoppen;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Geluid {
    private URL url;
    private AudioInputStream stream;
    private Clip clip;

    public Geluid(String bestand) {

        try {
            url = this.getClass().getClassLoader().getResource(bestand);
            stream = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(stream);
        } catch (UnsupportedAudioFileException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void schakelGeluid() {
        if (clip.isRunning()) {
            clip.stop();
            clip.setMicrosecondPosition(0);
        } else {
            clip.start();
        }
    }

}
