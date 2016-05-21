
public class SportCar extends AutomobileW14 {
	private double turboBoost=0.00;// chi so tang toc cua xe Sport
	private double currentBoost = 0.00;// chi so hien tai tang toc cua xe
	public SportCar (int year, String make, String model, String color, String name, int numOfGears, double turboBoost)
	{
		super(year, make, model, color, name, numOfGears);
		this.turboBoost = turboBoost;
	}
	@Override
	public void Drive(int opCycle)
	{
		setOperatingCycle(opCycle);
		if (getGear() < getNumberOfGreat())
		{
			increaseGear();
			setSpeed(getGear()*10.0);
		}
		else if (getGear() == getNumberOfGreat())
		{
			setSpeed( (getGear()*10.0) * (2 + turboBoost) );// them chi so turboBoost
			currentBoost = turboBoost;
		}
		setDistanceTraveled (getDistanceTraveled() + (getSpeed()/60.0));
	}
	@Override
	public String toString()
	{
		
		return String.format("%s, TurboBoost of Sport Car: %.2f %%",
				super.toString(), currentBoost*100);
	}
}
