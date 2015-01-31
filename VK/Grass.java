import java.util.List;
import java.awt.*;

public class Grass extends Ground
{
    private int groundLevel;
    private static final int GROUND_MAX_LEVEL = 10,GROUND_MIN_LEVEL=0;
    //private static final Color COLOR_ONE = new Color(229,181,149);//127.51.0
    private static final Color COLOR_TWO = new Color(229,217,149);//127.109.0
    private static final Color COLOR_THREE = new Color(209,229,149);//127.170.0
    private static final Color COLOR_FOUR = new Color(198,229,149);//127.209.0
    private static final Color COLOR_FIVE = new Color(181,229,149);//97.244.0
    private Color color;
    
    

    public Grass(Field field, AreaLocation areaLocation)
    {
    	super(field, areaLocation);
    	groundLevel = 8;
    	setColor(groundLevel);
    	
    }
	
    public int getGroundLevel()
    {
    	return groundLevel;
    }
    
	public void lowerLevel(int amount)
	{
    	if(groundLevel>GROUND_MIN_LEVEL+amount)
		{
    		groundLevel-=amount;
    	}else{
    		groundLevel=0;
    	}
	}
    
	public void higherLevel(int amount)
	{
    	if(groundLevel<GROUND_MAX_LEVEL-amount)
    	{
    		groundLevel+=amount;
    	}else{
    		groundLevel=GROUND_MAX_LEVEL;
    	} 		
	}
    
	/**
	 * general method passTime for all actors in the simulator
	 */
	public void passTime(List<Area> newGrass)
	{
 		higherLevel(1);
 		setColor(getGroundLevel());
	}
 	
	public void walkedOn()
	{
		lowerLevel(3);
	}
 	
	public void beingEaten()
	{
		lowerLevel(3);
	}
 	 
	public void special()
	{
		field.clear(areaLocation);
		Radiation radiation = new Radiation(field,areaLocation);
		field.placeArea(radiation,areaLocation);
	}
	
	/**
	 * Return the animal's location.
     * @return The animal's location.
     */
	public AreaLocation getAreaLocation()
    {
        return areaLocation;
    }
    
    /**
     * Place the animal at the new location in the given field.
     * @param newLocation The animal's new location.
     */
    public void setAreaLocation(AreaLocation newAreaLocation)
    {
        if(areaLocation != null) {
            field.clear(areaLocation);
        }
        areaLocation = newAreaLocation;
        field.placeArea(this, newAreaLocation);
    }
    
    /**
     * Return the animal's field.
     * @return The animal's field.
     */
    public Field getField()
    {
        return field;
    }

	public Color getColor() {
		return color;
	}

	public void setColor(int value) {
		
		if(value>GROUND_MAX_LEVEL){
			value=GROUND_MAX_LEVEL;
		}
		switch(value){
			case 1: case 2:case 3:case 4:
				color = COLOR_ONE;
				break;
			 case 5: case 6:
				color = COLOR_TWO;
				break;
			 case 7: case 8:
				color = COLOR_THREE;
				break;
			 case 9:
				color = COLOR_FOUR;
				break;
			 case 10:
				color = COLOR_FIVE;
				break;
			default: 
				color = COLOR_FOUR;
				break;
			
		}
		
	}

	
}
