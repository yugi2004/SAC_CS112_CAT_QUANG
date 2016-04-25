
public class Automobile2 {
	private int door = 0;
	private int cylinders = 0;
	private String color = null;
	private int transmission = 0;
	private String name = null;
	public Automobile2 (String color, int door, int cylinders, int trans )
	{
		this.color=color;
		this.door=door;
		this.cylinders=cylinders;
		transmission=trans;
	}
	public Automobile2 (int door, int cylinders, int trans )
	{
		this.door=door;
		this.cylinders=cylinders;
		transmission=trans;
	}
	public Automobile2 (int door, int cylinders)
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
	{	String autoMobile=null;
		if(color!=null)
			autoMobile="A color is :"+color;
		if(door!=0)
			autoMobile=autoMobile+"\nA Door is :"+door;
		if(cylinders!=0)
			autoMobile=autoMobile+"\nA cylinders is :"+cylinders;
		if(transmission!=0)
			autoMobile=autoMobile+"\nA transmission is :"+transmission;
		autoMobile=autoMobile+"\nA Car name is :"+name;
		return autoMobile;
	}
}
