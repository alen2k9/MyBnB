public class House extends Property{

	//House Variables
	
	int Number_Of_Floors;
	int Clearing_Fee;
	
	//House constructors
	
	public House(int Property_type, int Registration_Number, String Owner_Name, String Address, int Rent_Per_Day, int Total_Rent_Day, int Number_Of_Floors, int Clearing_Fee)
	{
		super(Property_type, Registration_Number, Owner_Name, Address, Rent_Per_Day, Total_Rent_Day);
		this.Number_Of_Floors = Number_Of_Floors;
		this.Clearing_Fee = Clearing_Fee;
	}
	
	//Accessory method to get value for house
	
	public int getNumber_Of_Floors()
	{
		return Number_Of_Floors;
	}
	public int getClearing_Fee()
	{
		return Clearing_Fee;
	}
	
	
	
	
	
	
	
	
	
}
