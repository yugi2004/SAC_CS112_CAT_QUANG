
public class MiniVan extends AutomobileW14{
	private double turboBoost=0.0;// chi so tang toc cua xe Sport
	private double currentBoost = 0.0;
	public MiniVan(int Year,String make, String model, String color, String name, int numOfGears, double turboBoost)
	{
		super(Year, make, model, color, name, numOfGears);
		this.turboBoost = turboBoost;
	}
	@Override
	public void Drive(int opCycle)
	{
		setOperatingCycle(opCycle);
		if (getGear() < getNumberOfGreat())
		{
			increaseGear();
			setSpeed(getGear()*10);
		}
		else if (getGear() == getNumberOfGreat())
		{
			setSpeed( (getGear()*10) * (turboBoost) );// them chi so turboBoost
			currentBoost = turboBoost;
		}
		setDistanceTraveled (getDistanceTraveled() + (getSpeed()/60.0));
	}
	@Override
	public String toString()
	{
		double turboPercent = currentBoost *100;
		return String.format("%s, TurboBoost of Mini Van: %.2f%%",
				super.toString(), turboPercent);
	}
}
