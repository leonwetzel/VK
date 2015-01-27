/**
 * Public class for the nuclear threat, which kills everything when launched
 * @author leonwetzel
 *
 */
public class Nuke
{
	private boolean nukeStatus = false;
	
	public Nuke()
	{
		
	}
	
	/**
	 * Activate the nuke and return a boolean which indicates if the field is nuked
	 */
	public void explode()
	{
		setNukeStatus(true);
	}
	
	/**
	 * Method which returns true if the nuke has been ignited
	 * @return true/false
	 */
	public boolean isNuked()
	{
		return nukeStatus;
	}

	/**
	 * @param falloutIgnited, the falloutIgnited to set
	 */
	public void setNukeStatus(boolean nukeStatus) {
		this.nukeStatus = nukeStatus;
	}
}
