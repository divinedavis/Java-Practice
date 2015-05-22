/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shoot1;

/**
 *
 * @author s.mohanarajah0901
 */
import java.io.*;
import javax.sound.sampled.*;
import java.text.DecimalFormat;

public class SoundPlayer {
    private Clip clip;
    private String file;
    private boolean looping;

    public SoundPlayer(String filename) {
        file = filename;
        try {
            // Create a sound buffer to
            // minimize delays on startup
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Play the sound clip
    public void play() {
        if (!looping || !clip.isRunning()) {
            looping = false;
            makeClip();
            clip.start();
        }
    }

    // Play the sound repeatedly
    public void loop(int numRepeats) {
        if (!looping || !clip.isRunning()) {
            looping = true;
            makeClip();
            clip.loop(numRepeats); // plays numRepeats + 1
        }
    }

    // Stop the sound from playing
    public void stop() {
        clip.stop();
    }

    // Returns true if the sound is playing
    public boolean isPlaying() {
        return clip.isRunning();
    }

    // Make a new clip each time to allow multiple
    // sounds to play
    private void makeClip() {
        try {
            AudioInputStream stream =
                AudioSystem.getAudioInputStream(
                    getClass().getResource(file));
            clip = AudioSystem.getClip(); // since JDK 5
            clip.open(stream);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
