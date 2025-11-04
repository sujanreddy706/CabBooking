package Cab;

public class Bike extends Cab {
	String ModelName;
	Bike(String ModelName,String DriverName,String PhoneNumber,String NumberPlate,double Cost){
		super(DriverName,PhoneNumber,NumberPlate,Cost);
		this.ModelName=ModelName;
		 }
		void BikeDetails() {
				System.out.println("\n******* Your ordered is Booked! *******\n");
				System.out.println("Driver Name: "+DriverName);
				System.out.println("Driver PhoneNumber: "+PhoneNumber);
				System.out.println("Model Name: "+ModelName);
				System.out.println("Number Plate: "+NumberPlate);
				System.out.println("Cost: "+Cost+" ₹\n");
				System.out.println("****** Thank you for your booking! ******");
			 }
	}

