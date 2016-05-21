//abstract khai bao lop truu tuong ma ko phai khai bao lai ham cua giao dien Drivable
public abstract class AutomobileW14 implements Drivable {
	private int year;
	private String make;
	private String model;
	private String name;
	private String color;
	private int numberOfGear=0;
	private double currentspeed=0.0;
	private int currentGear=0;
	private int operatingCycle =0;
	private double distance=0.0;
	public AutomobileW14(int year,String make, String model,String color,String name,int gear)
	{
		this.year=year;
		this.make=make;
		this.model=model;
		this.color=color;
		this.name=name;
		numberOfGear=gear;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public void setMake(String make)
	{
		this.make=make;
	}
	public void setModel(String model)
	{
		this.model=model;
		
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setGear(int gear)
	{
		numberOfGear=gear;
	}
	
	public int getYear()
	{
		return year;
	}
	public String getMake()
	{
		return make;
	}
	public String getModel()
	{
		return model;
	}
	public String getColor()
	{
		return color;
	}
	public int getNumberOfGreat()
	{
		return numberOfGear;
	}
	public void setOperatingCycle(int num)
	{
		operatingCycle =num;
	}
	public int getOperatingCycle()
	{
		return operatingCycle;// chu ky hoat dong
	}
	public void increaseGear ()
	{
		currentGear++;// tang so vong quay Gear
	}
	public double getDistanceTraveled()
	{
		return distance;
	}
	public void setDistanceTraveled (double travel)
	{
		distance = travel;
	}
	public void setCurrentGear (int c)
	{
		currentGear = c;// thiet lap gear hien tai
	}
	public int getGear()
	{
		return currentGear;
	}
	public double getSpeed()
	{
		return currentspeed;
	}
	public void setSpeed(double s)
	{
		currentspeed = s;
	}
	public String toString()
	{
		return String.format("\nYear: %d, Make: %s, Model: %s, Color: %s, Name: %s, Num of Gears: %d, Op Cycle: %d,"
				+ " Current Gear: %d, Current Speed: %.0f, Distance Traveled: %.2f", 
				year, make, model, color, name, numberOfGear, operatingCycle, currentGear, currentspeed, distance);
 	}
}
