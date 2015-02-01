import java.util.List;

public class HolyLand extends Ground
{
    private int groundLevel;
    private static final int GROUND_MAX_LEVEL = 10,GROUND_MIN_LEVEL=0;

    public HolyLand(Field field, AreaLocation areaLocation)
    {
    	super(field, areaLocation);
    	groundLevel = 1;
    	
    }
	
    public int getGroundLevel()
    {
    	return groundLevel;
    }
    
	public void lowerLevel(int ammount)
	{
    	if(groundLevel>GROUND_MIN_LEVEL+ammount)
		{
    		groundLevel=groundLevel-ammount;
    	}else{
    		groundLevel=0;
    	}
	}
    
	public void higherLevel(int ammount)
	{
    	if(groundLevel<GROUND_MAX_LEVEL-ammount)
    	{
    		groundLevel=groundLevel+ammount;
    	}else{
    		groundLevel=GROUND_MAX_LEVEL;
    	} 		
	}
    
	/**
	 * general method passTime for all actors in the simulator
	 */
	public void passTime(List<Area> newGrass)
	{
 		//
	}
 	
	public void walkedOn()
	{
		//
	}
 	
	public void beingEaten()
	{
		field.clear(areaLocation);
		Grass grass = new Grass(field,areaLocation);
		field.placeArea(grass, areaLocation);
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
	public AreaLocation getLocation()
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
}
