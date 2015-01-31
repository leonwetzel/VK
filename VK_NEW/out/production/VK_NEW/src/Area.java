import java.util.List;
import java.awt.Color;

/**
* Public interface containing methods for all classes which implement this interface
*
*/

public interface Area {
	//general method to get groundlevel
	public int getGroundLevel();
	//general method passTime in the simulator
	public void passTime(List<Area>newArea);
	//general method for walking over area.
	public void walkedOn();
	//general method for being eaten.
	public void beingEaten();
	//general method for special moves.
	public void special();
	//public void special(int level);
	// get a location
	public AreaLocation getAreaLocation();
	// get a field
	public Field getField();
	// get color.
	public Color getColor();
}