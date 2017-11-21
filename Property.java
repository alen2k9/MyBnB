
public class Property implements RentalItem
{
	
	//This class displays the different properties of the owner
	int Property_type;
	int Registration_Number;
	String Owner_Name;
	String Address;
	int Rent_Per_Day;
	int Total_Rent_Day;
	
	//constructor for property that inputs values
	
	public Property(int Property_type, int Registration_Number, String Owner_Name, String Address, int Rent_Per_Day, int Total_Rent_Day )
	{
		this.Property_type = Property_type;
		this.Registration_Number = Registration_Number;
		this.Owner_Name = Owner_Name;
		this.Address = Address;
		this.Rent_Per_Day = Rent_Per_Day;
		this.Total_Rent_Day = Total_Rent_Day;
	}
	
	//Different info of each type
	
	public int getRegistration_Number()
	{
		return Registration_Number;
	}
	public int getRent_Per_Day()
	{
		return Rent_Per_Day;
	}
	public int getTotal_Rent_Day()
	{
		return Total_Rent_Day;
	}
	public String Owner_Name()
	{
		return Owner_Name;
	}
	public String Address()
	{
		return Address;
	}

	@Override
	public void rentalitem(int rental_days) {
		// TODO Auto-generated method stub
		Total_Rent_Day += rental_days;
	}
	
}
