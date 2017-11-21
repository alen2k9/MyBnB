import java.util.ArrayList;			//importing the array list library
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main {
	
	//Fill in properties method to add into the array list the property details
	public static void FillInProperties(ArrayList<Apartment> apartment,ArrayList<House> house, ArrayList<Villa> villa ){
		
		String inputfilename = "C:/Users/alen2/Desktop/college/2nd year#/semester 1/Java/Assignment 2/InputProperty.txt";	
		File inputfile = new File(inputfilename);
		
		try {
			Scanner in = new Scanner(inputfile);	//Algorithm to scan in input file
			while (in.hasNextLine())				//Separate word by word and put into arraylist
		{ 
			String line= in.nextLine();
		    Scanner sc = new Scanner(line); 
	     	String PropertyType = sc.next(); 
	     	int propertytype = Integer.parseInt(PropertyType);
	     	String regnum = sc.next();
	     	String name = sc.next();
	     	String address = sc.next();
	     	String rentpd = sc.next();
	     	String totday = sc.next();
	     	int registrationnumber = Integer.parseInt(regnum);
	     	int rentperday = Integer.parseInt(rentpd);
	     	int totaldays = Integer.parseInt(totday);
	     	
	     	if(propertytype == 1)					//Checks property type and puts into appropiate array
	     	{
	     		String floornumb = sc.next();
	     		int floornumber = Integer.parseInt(floornumb);
	     		
	     		String Nob = sc.next();
	     		int numberofbeds = Integer.parseInt(Nob);
	     		
	     		apartment.add(new Apartment(propertytype, registrationnumber, name, address, rentperday, totaldays, floornumber, numberofbeds));
	     	}
	     	else if(propertytype == 2)
	     	{
	     		String numbfloor = sc.next();
	     		int numberoffloors = Integer.parseInt(numbfloor);
	     		
	     		String cf = sc.next();
	     		int Clearingfee = Integer.parseInt(cf);
	     		
	     		house.add(new House(propertytype, registrationnumber, name, address, rentperday, totaldays, numberoffloors, Clearingfee));
	     	}
	     	else if(propertytype == 3)
	     	{
	     		String roomser = sc.next();
	     		int roomservice = Integer.parseInt(roomser);
	     		
	     		String lux = sc.next();
	     		int luxurytax = Integer.parseInt(lux);
	     		
	     		String nor = sc.next();
	     		int numberofrooms = Integer.parseInt(nor);
	     		
	     		villa.add(new Villa(propertytype, registrationnumber, name, address, rentperday, totaldays, roomservice, luxurytax, numberofrooms));
	     		
	     	}
			    
				sc.close();					//Closes each scanner
			}
			in.close();
		} 
		
		catch (FileNotFoundException e) {		//Closes input file
	        e.printStackTrace();
		}
	}
	
	//Print all the properties method to print the properties in a table
	public static void PrintAllProperties(ArrayList<Apartment> apartment,ArrayList<House> house, ArrayList<Villa> villa ) 
	{
		String apartments = "=========================================================Apartments=============================================================";
		String houses = "===========================================================Houses===============================================================";
		String villas = "===========================================================Villas===============================================================";
		String info_Apartment = "Registration Number  Owner           Address         Rent p/d   Total Days Rented  Floor Number  Number of Beds    ";
		String info_House = "Registration Number  Owner           Address         Rent p/d   Total Days Rented  Number of Floors     Clearing Fee    ";
		String info_Villa = "Registration Number  Owner           Address         Rent p/d   Total Days Rented  Room Service  Luxury Tax  Number of Rooms    ";
		
		String outputfilename = "C:/Users/alen2/Desktop/college/2nd year#/semester 1/Java/Assignment 2/OutputProperty.txt";
		try {
			PrintWriter out = new PrintWriter(outputfilename);		//File opened and array printed into file excluding property type 
			
			out.println("--------------------------------------------------------------------------------------------------------------------------------");
			out.println("-------------------------------------------------------MyBnB Property-----------------------------------------------------------");
			out.println("--------------------------------------------------------------------------------------------------------------------------------");
			out.println("\n");
			
			out.println(apartments);
			out.println(info_Apartment);
			out.println(apartment.get(0).getRegistration_Number() + "                    " + apartment.get(0).Owner_Name() +  "     " + apartment.get(0).Address() + "     " +  apartment.get(0).getRent_Per_Day() + "          " + apartment.get(0).getTotal_Rent_Day() + "                 " + apartment.get(0).getFloor_Number() + "             " + apartment.get(0).getNumber_Of_Beds() );
			out.println(apartment.get(1).getRegistration_Number() + "                    " + apartment.get(1).Owner_Name() +  "  " + apartment.get(1).Address() + "     " +  apartment.get(1).getRent_Per_Day() + "          " + apartment.get(1).getTotal_Rent_Day() + "                 " + apartment.get(1).getFloor_Number() + "             " + apartment.get(1).getNumber_Of_Beds() );
			out.println(apartment.get(2).getRegistration_Number() + "                    " + apartment.get(2).Owner_Name() +  "   " + apartment.get(2).Address() + "     " +  apartment.get(2).getRent_Per_Day() + "          " + apartment.get(2).getTotal_Rent_Day() + "                 " + apartment.get(2).getFloor_Number() + "             " + apartment.get(2).getNumber_Of_Beds() );
			
			out.println(houses);
			out.println(info_House);
			out.println(house.get(0).getRegistration_Number() + "                    " + house.get(0).Owner_Name() +  "   " + house.get(0).Address() + "      " +  house.get(0).getRent_Per_Day() + "         " + house.get(0).getTotal_Rent_Day() + "                 " + house.get(0).getNumber_Of_Floors() + "                    " + house.get(0).getClearing_Fee() );
			out.println(house.get(1).getRegistration_Number() + "                    " + house.get(1).Owner_Name() +  "    " + house.get(1).Address() + "    " +  house.get(1).getRent_Per_Day() + "         " + house.get(1).getTotal_Rent_Day() + "                 " + house.get(1).getNumber_Of_Floors() + "                    " + house.get(1).getClearing_Fee() );
			out.println(house.get(2).getRegistration_Number() + "                    " + house.get(2).Owner_Name() +  "     " + house.get(2).Address() + "    " +  house.get(2).getRent_Per_Day() + "         " + house.get(2).getTotal_Rent_Day() + "                 " + house.get(2).getNumber_Of_Floors() + "                    " + house.get(2).getClearing_Fee() );
			
			out.println(villas);
			out.println(info_Villa);
			out.println(villa.get(0).getRegistration_Number() + "                    " + villa.get(0).Owner_Name() +  "    " + villa.get(0).Address() + "  " +  villa.get(0).getRent_Per_Day() + "         " + villa.get(0).getTotal_Rent_Day() + "                 " + villa.get(0).getRoom_Service() + "             " + villa.get(0).getLuxury_Tax() + "          " + villa.get(0).getNumber_Of_Rooms() );
			out.println(villa.get(1).getRegistration_Number() + "                    " + villa.get(1).Owner_Name() +  "     " + villa.get(1).Address() + "      " +  villa.get(1).getRent_Per_Day() + "         " + villa.get(1).getTotal_Rent_Day() + "                 " + villa.get(1).getRoom_Service() + "             " + villa.get(1).getLuxury_Tax() + "          " + villa.get(1).getNumber_Of_Rooms() );
			out.println(villa.get(2).getRegistration_Number() + "                    " + villa.get(2).Owner_Name() +  "       " + villa.get(2).Address() + "      " +  villa.get(2).getRent_Per_Day() + "         " + villa.get(2).getTotal_Rent_Day() + "                 " + villa.get(2).getRoom_Service() + "             " + villa.get(2).getLuxury_Tax() + "          " + villa.get(2).getNumber_Of_Rooms() );
			
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	//total income calculating method to print the cost of rent
	public static void CalculateTotalIncome(ArrayList<Apartment> apartment,ArrayList<House> house, ArrayList<Villa> villa )
	{
	
	int total_apartment = 0;	//Variables are 0 at the start so you can add the cost to ach of them
	int total_house = 0;
	int total_villa = 0;
	int total1;
	
	for(int i = 0; i < 3; i++)
	total_apartment = total_apartment + (apartment.get(i).getRent_Per_Day()*apartment.get(i).getTotal_Rent_Day());
	
	for(int i = 0; i < 3; i++)
	total_house = total_house + house.get(i).getClearing_Fee() + (house.get(i).getRent_Per_Day()*house.get(i).getTotal_Rent_Day());
	
	for(int i = 0; i < 3; i++)
	total_villa = total_villa + ((villa.get(i).getRent_Per_Day() + villa.get(i).getRoom_Service() + villa.get(i).getLuxury_Tax())*villa.get(i).getTotal_Rent_Day());
	
	total1 = total_apartment + total_house + total_villa;	//Algorithim to add all properties together
	
	JFrame frame = new JFrame("Total Property income");				//JOption Pane used to print out to user total cost
	JOptionPane.showMessageDialog(frame, "Total Property income is" + " " + total1);
	}
	
	public static void RentDays(ArrayList<Apartment> apartment,ArrayList<House> house, ArrayList<Villa> villa ) 
	{
		JFrame rentframe = new JFrame("Property rent process");		//JFrame used to get user input to increase rental days
		rentframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Intial Renal days 0
		rentframe.setVisible(true);
		rentframe.setLocationRelativeTo(null);
		
		JPanel pane = new JPanel();
		
		JLabel label = new JLabel("Registration number");
		JTextField regnumbtxt = new JTextField(10);
		
		label.setLabelFor(regnumbtxt);
		
		pane.add(label);
		pane.add(regnumbtxt, BorderLayout.SOUTH);
		
		JLabel label1 = new JLabel("Rental Days");
		JTextField rentdays = new JTextField(10);
		
		pane.add(label1);
		pane.add(rentdays, BorderLayout.SOUTH);
		
		JButton button = new JButton();
		button.setText("Ok");
		pane.add(button, BorderLayout.PAGE_END);
		
		JButton button1 = new JButton();
		button1.setText("Cancel");
		pane.add(button1, BorderLayout.PAGE_END);

		rentframe.add(pane);
		rentframe.pack();
		
		button.addActionListener(new ActionListener() {		//JButtons are given functions
		    
		    public void actionPerformed(ActionEvent e) {
		    	 int registrationnumber = Integer.parseInt(regnumbtxt.getText());
		    	 int rentaldays = Integer.parseInt(rentdays.getText());
		    	 if(registrationnumber >= 1 && registrationnumber <= 3)
		    	 {
		    		 apartment.get(registrationnumber-1).rentalitem(rentaldays);
		    	 }
		    	 else if(registrationnumber >= 4 && registrationnumber <= 6)
		    	 {
		    		 house.get(registrationnumber-4).rentalitem(rentaldays);
		    	 }
		    	 else if(registrationnumber >= 7 && registrationnumber <= 9)
		    	 {
		    		 villa.get(registrationnumber-7).rentalitem(rentaldays);
		    	 }
		    	 
		    	 RentDays(apartment, house, villa);		//rentdays recalled if user wants to keep inputting
		    	 
		    	 
		    }
		});
		
	
		
		button1.addActionListener(new ActionListener() {	//Jbutton to end process
		   
		    public void actionPerformed(ActionEvent e) {
		    	CalculateTotalIncome(apartment, house, villa);
		    	PrintAllProperties(apartment, house, villa);
		    	System.exit(0);
		    }
		});
		
	}
	
	public static void ReadInputVehicleFile(ArrayList<Car> car,ArrayList<Truck> truck){
		String inputfilename = "C:/Users/alen2/Desktop/college/2nd year#/semester 1/Java/Assignment 2/InputVehicle.txt";
		File inputfile = new File(inputfilename);
		
		try {											//Algorithim to input Vehicle file 
			Scanner inr = new Scanner(inputfile);
			while (inr.hasNextLine())
		{ 
			String line1 = inr.nextLine();
		    Scanner sc = new Scanner(line1); 
	     	String VehicleType = sc.next(); 
	     	int vehicletype = Integer.parseInt(VehicleType);
	     	String regnum = sc.next();
	     	String name = sc.next();
	     	String rentpd = sc.next();
	     	String totday = sc.next();
	     	int registrationnumber = Integer.parseInt(regnum);
	     	int rentperday = Integer.parseInt(rentpd);
	     	int totaldays = Integer.parseInt(totday);
	     	
	 
			if(vehicletype == 1)			//Vehicle data put into correct arrays
			{
				String passenger = sc.next();
				int Passeneger = Integer.parseInt(passenger);
				car.add(new Car(vehicletype, registrationnumber, name, rentperday, totaldays, Passeneger));
			}
			else if(vehicletype == 2)
			{
				String mass = sc.next();
				int total_mass = Integer.parseInt(mass);
				truck.add(new Truck(vehicletype, registrationnumber, name, rentperday, totaldays, total_mass));
			}
			else
			{
				ReadInputVehicleFile(car, truck);
			}
			
				sc.close();
			}
			inr.close();
			
		} 
		
		catch (FileNotFoundException e) {
	        e.printStackTrace();
		}
		
	}
	
	public static void PrintAllVehicles(ArrayList<Car> car,ArrayList<Truck> truck){	//Method to put into output file
		
		String outputfilename = "C:/Users/alen2/Desktop/college/2nd year#/semester 1/Java/Assignment 2/OutputVehicle.txt";
		
		String cars = "======================================================Cars=============================================================";
		String trucks = "====================================================Trucks===============================================================";
		String info_Car = "Registration Number	Owner		Rental days	Rent p/d	Number of Seats";
		String info_Truck = "Registration Number  Owner		Rental days	Rent p/d	Truck Load Mass";
		
		try {
			PrintWriter out = new PrintWriter(outputfilename);
			
			out.println("--------------------------------------------------------------------------------------------------------------------------------");
			out.println("-------------------------------------------------------MyBnB Vehicle------------------------------------------------------------");
			out.println("--------------------------------------------------------------------------------------------------------------------------------");
			out.println("\n");
			
			out.println(cars);
			out.println(info_Car);
			out.println(car.get(0).getregistration_number() + "\t\t\t" + car.get(0).owner_name() +  "\t" +   car.get(0).gettotalvehiclerental() + "\t\t" + car.get(0).getcostperday() + "\t\t" + car.get(0).getpassenger_numbers() );
			out.println(car.get(1).getregistration_number() + "\t\t\t" + car.get(1).owner_name() +  "\t" +   car.get(1).gettotalvehiclerental() + "\t\t" + car.get(1).getcostperday() + "\t\t" + car.get(1).getpassenger_numbers() );
			
			out.println(trucks);
			out.println(info_Truck);
			out.println(truck.get(0).getregistration_number() + "\t\t\t" + truck.get(0).owner_name() +  "\t" +   truck.get(0).gettotalvehiclerental() + "\t\t" + truck.get(0).getcostperday() + "\t\t" + truck.get(0).getcargo_weight() );
			out.println(truck.get(1).getregistration_number() + "\t\t\t" + truck.get(1).owner_name() +  "\t" +   truck.get(1).gettotalvehiclerental() + "\t\t" + truck.get(1).getcostperday() + "\t\t" + truck.get(1).getcargo_weight() );
				
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	 public static void CalculateVehicleTotalIncome(ArrayList<Car> car,ArrayList<Truck> truck){		//Algorithm to calculate vehicle income
		int total_car = 0;	//Variables are 0 at the start so you can add the cost to ach of them
		int total_truck = 0;
		int total2;
			
			for(int i = 0; i < 2; i++)
			total_car = total_car + (car.get(i).getcostperday()*car.get(i).gettotalvehiclerental());
			
			for(int i = 0; i < 2; i++)
			total_truck = total_truck + (truck.get(i).getcargo_weight()*2) + (truck.get(i).getcostperday()*truck.get(i).gettotalvehiclerental());
			
			total2 = total_car + total_truck ;	//Algorithim to add all Vehicles together
			
			JFrame frame = new JFrame("Total Vehicle income");
			JOptionPane.showMessageDialog(frame, "Total Vehicle income is" + " " + total2);
	}
	
	 public static void FillInVehicles(ArrayList<Car> car,ArrayList<Truck> truck){	//JFrame to ask user to input rental days of vehicles
		 JFrame rentframe = new JFrame("Vehicle rent process");
			rentframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			rentframe.setVisible(true);
			rentframe.setLocationRelativeTo(null);
			
			JPanel pane = new JPanel();
			
			JLabel label2 = new JLabel("Vehicle type");
			JTextField vehicletype = new JTextField(10);
			
			pane.add(label2);
			pane.add(vehicletype, BorderLayout.SOUTH);
			
			JLabel label = new JLabel("Registration number:");
			JTextField regnumbtxt = new JTextField(10);
			
			label.setLabelFor(regnumbtxt);
			
			pane.add(label);
			pane.add(regnumbtxt, BorderLayout.SOUTH);
			
			JLabel label1 = new JLabel("Days to rent:");
			JTextField rentdays = new JTextField(10);
			
			pane.add(label1);
			pane.add(rentdays, BorderLayout.SOUTH);
			
			JButton button = new JButton();
			button.setText("Ok");
			pane.add(button, BorderLayout.PAGE_END);
			
			JButton button1 = new JButton();
			button1.setText("Cancel");
			pane.add(button1, BorderLayout.PAGE_END);

			rentframe.add(pane);
			rentframe.pack();
			
			button.addActionListener(new ActionListener() {		//JButtons are given functions
			    
			    public void actionPerformed(ActionEvent e) {
			    	int type = Integer.parseInt(vehicletype.getText());
			    	int registrationnumber = Integer.parseInt(regnumbtxt.getText());
			    	int rentaldays = Integer.parseInt(rentdays.getText());
			    	if(type == 1)
			    	 {
			    		 for(int i = 0; i<= 2; i++)
			    		 {
			    			 if(registrationnumber == car.get(i).getregistration_number())
			    			 {
			    				 car.get(i).rentalitem(rentaldays);
			    			 }
			    			 else
			    			 {
			    				 FillInVehicles(car, truck);
			    			 }
			    		 }
			    	 }
			    	 else if(type == 2)
			    	 {
			    		 for(int i = 0; i<= 2; i++)
			    		 {
			    			 if(registrationnumber == truck.get(i).getregistration_number())
			    			 {
			    				 truck.get(i).rentalitem(rentaldays);
			    			 }
			    			 else
			    			 {
			    				 FillInVehicles(car, truck);
			    			 }
			    		 }
			    	 }
			    	 else 
			    	 {
			    		 FillInVehicles(car, truck);
			    	 }
			    	 
			    	FillInVehicles(car, truck);
			    	 
			    	 
			    }
			});
			
		
			
			button1.addActionListener(new ActionListener() {
			   
			    public void actionPerformed(ActionEvent e) {
			    	CalculateVehicleTotalIncome(car, truck);
			    	PrintAllVehicles(car, truck);
			    	
			    }
			});
		 
			
	 }
	 
	 public static void main2(ArrayList<Apartment> apartment,ArrayList<House> house, ArrayList<Villa> villa , ArrayList<Car> car,ArrayList<Truck> truck)
	 {
		 JFrame mainframe = new JFrame("Total rent process");			//Second main where JFrame for user to choose what they want
			mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mainframe.setVisible(true);
			mainframe.setLocationRelativeTo(null);
			
			JPanel pane = new JPanel();
			
			
			JButton button = new JButton();
			button.setText("Rent Property");
			pane.add(button, BorderLayout.PAGE_END);
			
			JButton button1 = new JButton();
			button1.setText("Rent Vehicles");
			pane.add(button1, BorderLayout.PAGE_END);
			
			JButton button2 = new JButton();
			button2.setText("Output Files");
			pane.add(button2, BorderLayout.PAGE_END);

			mainframe.add(pane);
			mainframe.pack();
			
			button.addActionListener(new ActionListener() {
				   
			    public void actionPerformed(ActionEvent e) {
			    	RentDays(apartment, house, villa);
			    	
			    	
			    }
			});
			
			button1.addActionListener(new ActionListener() {
				   
			    public void actionPerformed(ActionEvent e) {
			    	FillInVehicles(car, truck);
			    
			    }
			});
			
			button2.addActionListener(new ActionListener() {
				   
			    public void actionPerformed(ActionEvent e) {
			    	PrintAllVehicles(car, truck);
			    	PrintAllProperties(apartment, house, villa);
			    	System.exit(0);
			    
			    }
			});
		 }
		 
	 
	 
	 public static void main(String[] args) {	//Main method where each method is called 
		 
		ArrayList<Apartment> apartment = new ArrayList<Apartment>();	//Array list is created here
		ArrayList<House> house = new ArrayList<House>();                        
		ArrayList<Villa> villa = new ArrayList<Villa>();
		ArrayList<Car> car = new ArrayList<Car>();
		ArrayList<Truck> truck = new ArrayList<Truck>();
		
		FillInProperties(apartment, house, villa);		//Each method is called one by one
		ReadInputVehicleFile(car, truck);
	
		
		main2(apartment, house, villa, car, truck);		//Calling second method with JFrame
	 }
	 

	 
	
}
