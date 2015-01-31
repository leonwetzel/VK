import java.awt.Color;
import java.util.List;

public class Radiation extends Ground
{
    private int groundLevel;
    private int expanded;
    private static final int GROUND_MAX_LEVEL = 10,GROUND_MIN_LEVEL=0;

    public Radiation(Field field, AreaLocation areaLocation)
    {
    	super(field, areaLocation);
    	groundLevel = 10;
    	expanded = 0;
    	
    }
    public Radiation(Field field, AreaLocation areaLocation,int groundLevel)
    {
    	super(field, areaLocation);
    	this.groundLevel = groundLevel;
 		//if(groundLevel>GROUND_MAX_LEVEL){
    		/*List<AreaLocation> areaLocations = field.adjacentAreaLocations(areaLocation);
    		for(int i = 0; i<areaLocations.size();i++){
    			;
    			Area area = field.getAreaAt(areaLocations.get(i));
    			
    			if(!(area instanceof Radiation)){
    				area.special(this.groundLevel);
    				
    			}
    		}*/
 			
 			
 			
    	//}
    	expanded = 0;
    	
    }
	public Color getColor()
	{
		if(groundLevel>5){
			return Color.YELLOW;
		}else{
			return Color.BLACK;
		}
	}
    
    public int getGroundLevel()
    {
    	return groundLevel;
    }
    
	public void lowerLevel(int amount)
	{
    	if(groundLevel>(GROUND_MIN_LEVEL+amount))
		{
    		groundLevel-=amount;
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
	public void passTime(List<Area> newRadiation)
	{
 		
 		expand(newRadiation);
 		
 		
    	this.lowerLevel(1);
 			
    	
	}
 	public void expand(List<Area> newRadiation)
 	{
 		if(groundLevel>GROUND_MAX_LEVEL&&expanded<1){
 			expanded++;
    		List<AreaLocation> areaLocations = field.adjacentAreaLocations(areaLocation);
    		
    		for(int i = 0; i<areaLocations.size();i++){
    			;
    			
    			
    			if(!(areaLocations instanceof Radiation)){
    				AreaLocation aLoc = areaLocations.remove(0);
    				field.clear(aLoc);
    				Radiation expand = new Radiation(field,aLoc,groundLevel);
    				newRadiation.add(expand);
    			}
    		}
 		}
 	}
	public void walkedOn()
	{
		//
	}
 	
	public void beingEaten()
	{
		higherLevel(GROUND_MAX_LEVEL);
	}
 	 
	public void special()
	{
		AreaLocation a = areaLocation;
		field.clear(areaLocation);
		Radiation radiation = new Radiation(field,a);
		field.placeArea(radiation,a);
	}
	public void special(int level){
		field.clear(areaLocation);
		Radiation radiation = new Radiation(field,areaLocation,level);
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
    public void setLocation(AreaLocation newAreaLocation)
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
