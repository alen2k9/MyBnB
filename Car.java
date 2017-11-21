
public class Car extends Vehicle{
	
	int passenger_number;
	
	public Car(int Vehicletype, int registration_number, String owner_name, int totalvehiclerental, int costperday, int passeneger_number )
	{
		super(Vehicletype, registration_number, owner_name, totalvehiclerental, costperday);
		this.passenger_number = passenger_number;
	}
	
	public int getpassenger_numbers()
	{
		return passenger_number;
	}
}
