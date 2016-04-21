
public class Automobile {
	private int door = 0;
	private int cylinders = 0;
	private String color = null;
	private int transmission = 0;
	private String name = null;
	
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
		String autoMobile="A "+color+" " +door+"door name "+name;
		return autoMobile;
	}
}
