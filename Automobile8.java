
public class Automobile8 {
	private int door = 0;
	private int cylinders = 0;
	private String color = null;
	private int transmission = 0;
	private String name = null;
	public Automobile8(String name, String color, int door, int cylinders, int trans)
	{
		this.name=name;
		this.door=door;
		this.cylinders=cylinders;
		this.color=color;
		transmission=trans;
		
	}
	public Automobile8(String color, int door, int cylinders, int trans)
	{
		this.door=door;
		this.cylinders=cylinders;
		this.color=color;
		transmission=trans;
		
	}
	public Automobile8 (int door, int cylinders, int trans )
	{
		this.door=door;
		this.cylinders=cylinders;
		transmission=trans;
	}
	public Automobile8 (int door, int cylinders)
	{
		this.door=door;
		this.cylinders=cylinders;
	}
	public void SetName(String n)
	{
		name=n;
	}
	public void SetNumberOfDoors(int d)
	{
		door=d;
	}
	public void SetNumberOfCylinders(int c)
	{
		cylinders=c;
	}
	public void SetTransmission(int t)  
	{
		transmission=t;
	}
	public void SetColor(String c)
	{
		color=c;
	}
	public String About()
	{	
		String autoMobile=null;		
			autoMobile=String.format("A %s %d door name %s",color,door,name);
		return autoMobile;
	}
}
