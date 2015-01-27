import java.io.*;
import javax.sound.sampled.*;

/**
 * Class for the background music in the simulator
 * @author leonwetzel
 *
 * Special thanks go out to the one who published his/her notes
 * at http://www3.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html
 * 
 */
public class MusicPlayer {
	
	// background music
	private Clip clip;
	// nuke sound
	private Clip nuke;
	
	/**
	 * Constructor
	 */
	public MusicPlayer()
	{
		// prepare the background audio file
		prepareBackgroundGAudio();
		// prepare the nuke audio file
		prepareNukeSound();
		
	}
	
	/**
	 * Method to play music
	 * Please note that the track is playing in an infinite loop!
	 */
	public void playMusic()
	{
		clip.loop(clip.LOOP_CONTINUOUSLY);
	}
	
	/**
	 * Method to stop the music
	 */
	public void stopMusic()
	{
		clip.stop();
	}
	
	/**
	 * Method to play the nuke sound
	 */
	public void playNukeSound()
	{
		nuke.start();
	}
	
	/**
	 * Get the background audio file
	 */
	public void prepareBackgroundGAudio()
	{
	    try {
	        // Haal het audiobestand op
	    	File soundFile = new File("forest2.wav");
	    	//URL url = new URL("sonata.wav");
	        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
	        // Ontleed het bestand voor gebruik
	        clip = AudioSystem.getClip();
	        // Laad het bestand in het programma
	        clip.open(audioIn);
	     } catch (UnsupportedAudioFileException e) {
	        e.printStackTrace();
	     } catch (IOException e) {
	        e.printStackTrace();
	     } catch (LineUnavailableException e) {
	        e.printStackTrace();
	     }				
	}
	
	/**
	 * 
	 */
	public void prepareNukeSound()
	{
	    try {
	        // Haal het audiobestand op
	    	File soundFile = new File("nuke.wav");
	    	//URL url = new URL("sonata.wav");
	        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
	        // Ontleed het bestand voor gebruik
	        nuke = AudioSystem.getClip();
	        // Laad het bestand in het programma
	        nuke.open(audioIn);
	     } catch (UnsupportedAudioFileException e) {
	        e.printStackTrace();
	     } catch (IOException e) {
	        e.printStackTrace();
	     } catch (LineUnavailableException e) {
	        e.printStackTrace();
	     }	
	}
}
