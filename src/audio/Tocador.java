package audio;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Tocador extends Thread {

    private final String resource;

    public static void play(String resource) {
        Thread t = new Tocador(resource);
        t.setDaemon(true);
        t.start();
    }

    public Tocador(String resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        Clip clip = null;
        try {
            InputStream in = Tocador.class.getClassLoader().getResourceAsStream(resource);
            if (in != null) {
                AudioInputStream stream = AudioSystem.getAudioInputStream(in);
                AudioFormat format = stream.getFormat();
                DataLine.Info info = new DataLine.Info(Clip.class, format);
                clip = (Clip) AudioSystem.getLine(info);
                clip.open(stream);
                clip.loop(0);
            }
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Tocador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Tocador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tocador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
