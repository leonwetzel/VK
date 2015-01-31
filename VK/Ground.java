import java.util.List;


public abstract class Ground implements Area
{
	//Whether the ground is edible.
	protected boolean edible;
	//The ground's field.
	protected Field field;
	//The ground's Location.
	protected AreaLocation areaLocation;
	
	public Ground(Field field, AreaLocation areaLocation)
	{
		this.field = field;
		setLocation(areaLocation);
		edible = true;
	}
	
	abstract public void passTime(List<Area> newArea);
	
	public AreaLocation getAreaLocation()
	{
		return areaLocation;
	}
	
	public void setLocation(AreaLocation newAreaLocation)
	{
		if(areaLocation !=null){
			field.clear(areaLocation);
		}
		areaLocation = newAreaLocation;
		field.placeArea(this, newAreaLocation);
	}
	
	public boolean edible()
	{
		return edible;
	}
	
	
}