
public class Vehicle implements RentalItem{

	int registration_number;	//Vehicle class variables
	String owner_name;
	int totalvehiclerental;
	int costperday;
	int Vehicletype;
	
	public Vehicle(int Vehicletype, int registration_number, String owner_name, int totalvehiclerental, int costperday)
	{
		this.Vehicletype = Vehicletype;
		this.registration_number = registration_number;
		this.owner_name = owner_name;
		this.totalvehiclerental = totalvehiclerental;
		this.costperday = costperday;
	}
	
	//Different info of each type
	//constructor for Vehicle that inputs values
	public int getregistration_number()
	{
		return registration_number;
	}
	public int getcostperday()
	{
		return costperday;
	}
	public int gettotalvehiclerental()
	{
		return totalvehiclerental;
	}
	public String owner_name()
	{
		return owner_name;
	}

	//implementation
	public void rentalitem(int rental_days) {
		// TODO Auto-generated method stub
		totalvehiclerental = totalvehiclerental - 1 + rental_days;
	}
	
}
