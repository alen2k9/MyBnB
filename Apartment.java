public class Apartment extends Property{

	int Floor_Number;		//Variables of apartment
	int Number_Of_Beds;
	
	//Constructor to edit Apartment details
	
	public Apartment(int Property_type, int Registration_Number, String Owner_Name, String Address, int Rent_Per_Day, int Total_Rent_Day, int Floor_Number, int Number_Of_Beds)
	{
		super(Property_type, Registration_Number, Owner_Name, Address, Rent_Per_Day, Total_Rent_Day);
		this.Floor_Number = Floor_Number;
		this.Number_Of_Beds = Number_Of_Beds;
	}
	
	//Accessor to get info of apartment
	
	public int getFloor_Number()
	{
		return Floor_Number;
	}
	public int getNumber_Of_Beds()
	{
		return Number_Of_Beds;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
