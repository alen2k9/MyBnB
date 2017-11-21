
public class Truck extends Vehicle {

int cargo_weight;
	
	public Truck(int Vehicletype, int registration_number, String owner_name, int totalvehiclerental, int costperday, int cargo_weight )
	{
		super(Vehicletype, registration_number, owner_name, totalvehiclerental, costperday);
		this.cargo_weight = cargo_weight;
	}
	
	public int getcargo_weight()
	{
		return cargo_weight;
	}
}
