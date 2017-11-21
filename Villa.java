public class Villa extends Property{

	int Room_Service;		//Villa variables
	int Luxury_Tax;
	int Number_Of_Rooms;
	
	//Constructor for Villa
	
	public Villa(int Property_type, int Registration_Number, String Owner_Name, String Address, int Rent_Per_Day, int Total_Rent_Day, int Room_Service, int Luxury_Tax, int Number_Of_Rooms )
	{
		super(Property_type, Registration_Number, Owner_Name, Address, Rent_Per_Day, Total_Rent_Day);
		this.Room_Service = Room_Service;
		this.Luxury_Tax = Luxury_Tax;
		this.Number_Of_Rooms = Number_Of_Rooms;
	}
	
	//Accessor to return Villa details
	
	public int getRoom_Service()
	{
		return Room_Service;
	}
	public int getLuxury_Tax()
	{
		return Luxury_Tax;
	}
	public int getNumber_Of_Rooms()
	{
		return Number_Of_Rooms;
	}
}
